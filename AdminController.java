package com.project.StudentManagementSystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.project.StudentManagementSystem.model.Admin;
import com.project.StudentManagementSystem.service.AdminService;




@RestController
@RequestMapping("/organization")
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admins")
	public ResponseEntity<List<Admin>> getAllAdmin(){
		return  ResponseEntity.ok().body(adminService.getAllAdmin());
	}
	
	@GetMapping("/admins/{id}")
	public ResponseEntity<Admin> getAdminById(@PathVariable long id){
		return  ResponseEntity.ok().body(adminService.getAdminById(id));
	}
	
	@PostMapping("/admins")
	public ResponseEntity<Admin> createAdmin(@RequestBody Admin professor){
		return ResponseEntity.ok().body(this.adminService.createAdmin(professor));
	}
	
	@PutMapping("/admins/{id}")
	public ResponseEntity<Admin> updateAdmin(@PathVariable long id, @RequestBody Admin admin){
		
		admin.setId(id);
		return ResponseEntity.ok().body(this.adminService.updateAdmin(admin));
	}
	
	
	@DeleteMapping("/admins/{id}")
	public HttpStatus deleteAdmin(@PathVariable long id){
		
		this.adminService.deleteAdmin(id);
		return HttpStatus.OK;

}
}
