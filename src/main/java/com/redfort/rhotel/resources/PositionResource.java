package com.redfort.rhotel.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfort.rhotel.entities.Position;
import com.redfort.rhotel.services.PositionService;

@RestController
@RequestMapping(value = "/positions")
public class PositionResource {
	
	@Autowired
	private PositionService service;
	
	@GetMapping
	public ResponseEntity<List<Position>> findAll(){
		List<Position> positions = service.findAll();
		return ResponseEntity.ok().body(positions);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Position> findById(@PathVariable Long id) {
		Position position = service.findById(id);
		return ResponseEntity.ok().body(position);
	}

}
