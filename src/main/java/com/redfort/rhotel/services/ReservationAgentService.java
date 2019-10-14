package com.redfort.rhotel.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redfort.rhotel.entities.ReservationAgent;
import com.redfort.rhotel.repositories.ReservationAgentRepository;

@Service
public class ReservationAgentService {
	
	@Autowired
	private ReservationAgentRepository repository;
	
	public List<ReservationAgent> findAll(){
		return repository.findAll();
	}
	
	public ReservationAgent findById(Long id) {
		Optional<ReservationAgent> obj =  repository.findById(id);
		return obj.get();
	}

}
