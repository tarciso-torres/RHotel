package com.redfort.rhotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfort.rhotel.entities.Staff;
import com.redfort.rhotel.repositories.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository repository;
	
	public List<Staff> findAll(){
		return repository.findAll();
	}
	
	public Staff findById(Long id) {
		Optional<Staff> obj =  repository.findById(id);
		return obj.get();
	}
	
	public Staff save(Staff entity) {
		Staff obj = repository.save(entity);
		return obj;
	}

}
