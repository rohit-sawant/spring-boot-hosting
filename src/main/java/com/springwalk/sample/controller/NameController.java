package com.springwalk.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springwalk.sample.entities.Name;
import com.springwalk.sample.repository.CustomerRepository;

@RestController
public class NameController {

	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("names")
	public List<Name> getNames(){
		List<Name> names = null;
		names =  (List<Name>) customerRepository.findAll();
		return names;
		
	}
	@PostMapping("names")
	public Name addName(@RequestBody Name name) {
		return customerRepository.save(name);
	}
}
