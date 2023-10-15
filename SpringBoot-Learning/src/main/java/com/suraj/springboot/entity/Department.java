package com.suraj.springboot.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "Department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long depId;
	@NotBlank(message = "Please add department name")	
	@Nonnull
	private String depName;
	@NotBlank(message = "Please add department address")	
	@Nonnull
	private String depAddress;
	@NotBlank(message = "Please add department code")	
	@Nonnull
	private String depCode;

//	Getters and Setters

	public long getDepId() {
		return depId;
	}

	public void setDepId(long depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepAddress() {
		return depAddress;
	}

	public void setDepAddress(String depAddress) {
		this.depAddress = depAddress;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

//	Default Constructor
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

//	Constructor using fields
	public Department(long depId, String depName, String depAddress, String depCode) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depAddress = depAddress;
		this.depCode = depCode;
	}

//	ToString method
	
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depAddress=" + depAddress + ", depCode="
				+ depCode + "]";
	}
	

	

}
