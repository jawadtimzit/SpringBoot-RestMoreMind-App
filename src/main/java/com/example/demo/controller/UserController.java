package com.example.demo.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.TreeRepository;
import com.example.demo.repository.UserRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1") 
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository;
	@PostMapping("/saveUsers")
	public User createUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	@GetMapping("/Signin")
	public User signin(@RequestParam String email,@RequestParam int password)
	{
		return userRepository.siginIn(email, password);
	}



}
