package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1")  
public class AddressController {
	@Autowired
	private AddressRepository addRepository;
	@GetMapping("/getCities") // whenevr we enter in local host /api/vs/treehouses we will get the list of trees
	public List<Object> getCities(){
		return addRepository.getCities();  // return the list of trees
	}
	
	
}
