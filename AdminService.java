package com.project.StudentManagementSystem.service;

import java.util.List;

import com.project.StudentManagementSystem.model.Admin;



public interface AdminService {

Admin createAdmin(Admin admin);
	
Admin updateAdmin(Admin admin);
		
		List<Admin> getAllAdmin();
		
		Admin getAdminById(long AdminId);
		
		void deleteAdmin(long id);
}
