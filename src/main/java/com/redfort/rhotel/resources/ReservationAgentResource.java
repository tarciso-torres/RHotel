package com.redfort.rhotel.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfort.rhotel.entities.ReservationAgent;
import com.redfort.rhotel.services.ReservationAgentService;

@RestController
@RequestMapping(value = "/reservaion-agents")
public class ReservationAgentResource {
	
	@Autowired
	private ReservationAgentService service;
	
	@GetMapping
	public ResponseEntity<List<ReservationAgent>> findAll(){
		List<ReservationAgent> reservationAgents = service.findAll();
		return ResponseEntity.ok().body(reservationAgents);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ReservationAgent> findById(@PathVariable Long id){
		ReservationAgent reservationAgent = service.findById(id);
		return ResponseEntity.ok().body(reservationAgent);
	}

}
