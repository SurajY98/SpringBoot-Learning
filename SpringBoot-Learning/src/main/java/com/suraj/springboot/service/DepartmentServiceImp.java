package com.suraj.springboot.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.springboot.entity.Department;
import com.suraj.springboot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
//	Saving department in the database
	
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

//	Fetching data from database
	
	@Override
	public List<Department> fetchDepartments() {
		return departmentRepository.findAll();
	}

//	Fetching data from database using departmentId

	@Override
	public Department fetchDepartmentById(Long depId) {
		return departmentRepository.findById(depId).get();
	}

	@Override
	public void deleteDepartmentById(long depId) {
		departmentRepository.deleteById(depId);		
	}

	@Override
	public Department updateDepartment(long depId, Department department) {
	 	 Department dbData = departmentRepository.findById(depId).get();
	 	 if (Objects.nonNull(department.getDepName()) && !"".equalsIgnoreCase(department.getDepName())) {
			dbData.setDepName(department.getDepName());
		}
	 	 if (Objects.nonNull(department.getDepCode()) && !"".equalsIgnoreCase(department.getDepCode())) {
			dbData.setDepCode(department.getDepCode());
		}
	 	 if (Objects.nonNull(department.getDepAddress()) && !"".equalsIgnoreCase(department.getDepAddress())) {
	 		 dbData.setDepAddress(department.getDepAddress());
		}
	 	 System.out.println(dbData);
	 	 return departmentRepository.save(dbData);
	}

//	Find by name
	@Override
	public Department findbyDepartmentName(String depName) {
		return departmentRepository.findByDepName(depName);
	}


	

}
