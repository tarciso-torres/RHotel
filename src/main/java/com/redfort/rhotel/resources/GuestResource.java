package com.redfort.rhotel.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfort.rhotel.entities.Guest;
import com.redfort.rhotel.services.GuestService;

@RestController
@RequestMapping(value = "/guests")
public class GuestResource {
	
	@Autowired
	private GuestService service;
	
	@GetMapping
	public ResponseEntity<List<Guest>> findAll(){
		List<Guest> guests = service.findAll();
		return ResponseEntity.ok().body(guests);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Guest> findById(@PathVariable Long id) {
		Guest guest = service.findById(id);
		return ResponseEntity.ok().body(guest);
	}

}
