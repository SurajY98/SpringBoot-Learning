package com.suraj.springboot.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.springboot.entity.Department;
import com.suraj.springboot.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	
//	Implementing logger in our code.
	private final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService departmentService;
	
//	Save Department in the Database
	@PostMapping("/saveDepartment")
	public Department saveDepartments(@Valid @RequestBody Department department) {
		LOGGER.info("Inside the departmentService class");
		return departmentService.saveDepartment(department);
		
	}
	
//	Fetch Department from database
	
	@GetMapping("/fetchDepartment")
	public List<Department> fetchDepartments(){
		return departmentService.fetchDepartments();		
	}
	
//	Fetching Department by id from database
	
	@GetMapping("/fetchDepartment/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long depId) {
		return departmentService.fetchDepartmentById(depId);		
	}

//	Deleting Department by id from database
	
	@DeleteMapping("/deleteDepartment/{id}")
	public String deleteDepartmentById(@PathVariable("id") long depId) {
		departmentService.deleteDepartmentById(depId);
		return "Department details deleted successfully";		
	}
	
//	Updating Department details
	
	@PutMapping("/updateDepartment/{id}")
	public Department updateDepartment(@PathVariable("id") long depId, @RequestBody Department department) {
		return departmentService.updateDepartment(depId,department);
		
	}
	
//	Find by Name
	@GetMapping("/fetchDepartment/name/{name}")
	public Department findbyDepartmentName(@PathVariable("name") String depName) {
		return departmentService.findbyDepartmentName(depName);
		
	}
}
