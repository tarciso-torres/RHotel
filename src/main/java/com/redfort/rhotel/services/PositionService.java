package com.redfort.rhotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfort.rhotel.entities.Position;
import com.redfort.rhotel.repositories.PositionRepository;

@Service
public class PositionService {
	
	@Autowired
	private PositionRepository repository;
	
	public List<Position> findAll(){
		return repository.findAll();
	}
	
	public Position findById(Long id) {
		Optional<Position> obj =  repository.findById(id);
		return obj.get();
	}

}
