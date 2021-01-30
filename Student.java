package com.project.StudentManagementSystem.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Students")
public class Student {

	@Id
	@GeneratedValue()
	private Long id;
	
	@Column(name="stu_first_name")
	private String firstName;
	
	@Column(name="stu_last_name")
	private String lastName;
	
	@Column(name="stu_phone_no")
	private String phoneNo;
	
	@Column(name="stu_address")
	private String address;
	
	@Column(name="stu_email")
	private String email;
	
	@Column(name="stu_department")
	private String department;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	
	
}