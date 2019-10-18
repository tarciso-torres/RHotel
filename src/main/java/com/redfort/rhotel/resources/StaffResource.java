package com.redfort.rhotel.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redfort.rhotel.entities.Staff;
import com.redfort.rhotel.services.StaffService;

@RestController
@RequestMapping(value = "/staffs")
public class StaffResource {
	
	@Autowired
	private StaffService service;
	
	@GetMapping
	public ResponseEntity<List<Staff>> findAll(){
		List<Staff> staffs = service.findAll();
		return ResponseEntity.ok().body(staffs);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Staff> findById(@PathVariable Long id) {
		Staff staff = service.findById(id);
		return ResponseEntity.ok().body(staff);
	}
	
	@PostMapping
	public ResponseEntity<Staff> save(@RequestBody Staff entity){
		Staff staff = service.save(entity);
		
		return ResponseEntity.ok().body(staff);
	}

}
