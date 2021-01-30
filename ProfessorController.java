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


import com.project.StudentManagementSystem.model.Professor;
import com.project.StudentManagementSystem.service.ProfessorService;


@RestController
@RequestMapping("/organization")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;
	
	@GetMapping("/professors")
	public ResponseEntity<List<Professor>> getAllProfessor(){
		return  ResponseEntity.ok().body(professorService.getAllProfessor());
	}
	
	@GetMapping("/professors/{id}")
	public ResponseEntity<Professor> getProfessorById(@PathVariable long id){
		return  ResponseEntity.ok().body(professorService.getProfessorById(id));
	}
	
	@PostMapping("/professors")
	public ResponseEntity<Professor> createProfessor(@RequestBody Professor professor){
		return ResponseEntity.ok().body(this.professorService.createProfessor(professor));
	}
	
	@PutMapping("/professors/{id}")
	public ResponseEntity<Professor> updateProfessor(@PathVariable long id, @RequestBody Professor professor){
		
		professor.setId(id);
		return ResponseEntity.ok().body(this.professorService.updateProfessor(professor));
	}
	
	
	@DeleteMapping("/professors/{id}")
	public HttpStatus deleteProfessor(@PathVariable long id){
		
		this.professorService.deleteProfessor(id);
		return HttpStatus.OK;

}
}
