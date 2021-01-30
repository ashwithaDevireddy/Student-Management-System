package com.project.StudentManagementSystem.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.exception.ResourceNotFoundException;
import com.project.StudentManagementSystem.model.Admin;
import com.project.StudentManagementSystem.service.AdminService;

@Service
@Transactional
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	
	@Override
	public Admin createAdmin(Admin admin) {
		
		return adminRepository.save(admin);
		
	}
	
	

	@Override
	public Admin updateAdmin(Admin admin) {
		
		Optional<Admin> adminDb = this.adminRepository.findById(admin.getId());
		
		if( adminDb.isPresent()) {
			
			Admin adminUpdate = adminDb.get();
			adminUpdate.setId(admin.getId());
			adminUpdate.setFirstName(admin.getFirstName());
			adminUpdate.setLastName(admin.getLastName());
			adminUpdate.setPhoneNo(admin.getPhoneNo());
			adminUpdate.setLocation(admin.getLocation());
			adminUpdate.setEmail(admin.getEmail());
			adminUpdate.setDepartment(admin.getDepartment());
			
			adminRepository.save(adminUpdate);
			return adminUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + admin.getId());
		}
	}
	
	

	@Override
	public List<Admin> getAllAdmin() {
		
		return this.adminRepository.findAll();
		
	}

	@Override
	public Admin getAdminById(long adminId) {
		
		Optional<Admin> adminDb = this.adminRepository.findById(adminId);
		
		if(adminDb.isPresent()) {
			return adminDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + adminId);
		}
		
	}

	@Override
	public void deleteAdmin(long adminId) {
		
		Optional<Admin> adminDb = this.adminRepository.findById(adminId);
		
		if(adminDb.isPresent()) {
			this.adminRepository.delete(adminDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + adminId);
		}
	}
}
