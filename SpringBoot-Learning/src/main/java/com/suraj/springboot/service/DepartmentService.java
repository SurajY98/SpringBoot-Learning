package com.suraj.springboot.service;

import java.util.List;

import com.suraj.springboot.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartments();

	public Department fetchDepartmentById(Long depId);

	public void deleteDepartmentById(long depId);

	public Department updateDepartment(long depId, Department department);

	public Department findbyDepartmentName(String depName);
	

}
