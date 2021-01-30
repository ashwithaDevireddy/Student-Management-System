package com.project.StudentManagementSystem.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.StudentManagementSystem.exception.ResourceNotFoundException;
import com.project.StudentManagementSystem.model.Professor;
import com.project.StudentManagementSystem.repository.ProfessorRepository;

@Service
@Transactional
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;
	
	
	@Override
	public Professor createProfessor(Professor professor) {
		
		return professorRepository.save(professor);
		
	}
	
	

	@Override
	public Professor updateProfessor(Professor professor) {
		
		Optional<Professor> professorDb = this.professorRepository.findById(professor.getId());
		
		if( professorDb.isPresent()) {
			
			Professor professorUpdate = professorDb.get();
			professorUpdate.setId(professor.getId());
			professorUpdate.setFirstName(professor.getFirstName());
			professorUpdate.setLastName(professor.getLastName());
			professorUpdate.setPhoneNo(professor.getPhoneNo());
			professorUpdate.setLocation(professor.getLocation());
			professorUpdate.setEmail(professor.getEmail());
			professorUpdate.setDepartment(professor.getDepartment());
			
			professorRepository.save(professorUpdate);
			return professorUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + professor.getId());
		}
	}
	
	

	@Override
	public List<Professor> getAllProfessor() {
		
		return this.professorRepository.findAll();
		
	}

	@Override
	public Professor getProfessorById(long professorId) {
		
		Optional<Professor> professorDb = this.professorRepository.findById(professorId);
		
		if(professorDb.isPresent()) {
			return professorDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + professorId);
		}
		
	}

	@Override
	public void deleteProfessor(long professorId) {
		
		Optional<Professor> professorDb = this.professorRepository.findById(professorId);
		
		if(professorDb.isPresent()) {
			this.professorRepository.delete(professorDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id: " + professorId);
		}
	}
}
