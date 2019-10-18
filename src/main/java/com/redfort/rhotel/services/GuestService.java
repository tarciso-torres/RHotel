package com.redfort.rhotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfort.rhotel.entities.Guest;
import com.redfort.rhotel.entities.Staff;
import com.redfort.rhotel.repositories.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository repository;
	
	public List<Guest> findAll(){
		return repository.findAll();
	}
	
	public Guest findById(Long id) {
		Optional<Guest> obj =  repository.findById(id);
		return obj.get();
	}
	
	public Guest save(Guest entity) {
		Guest obj = repository.save(entity);
		return obj;
	}

}
