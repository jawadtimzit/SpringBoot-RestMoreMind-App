package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Payment;
import com.example.demo.repository.PaymentRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1")  
public class PaymentController {
	@Autowired
	private PaymentRepository payRepository;
	@PostMapping("/savePayment") 
	public Payment savePayment(@RequestBody Payment payment){
		return payRepository.save(payment);  
		//return pay;
		//System.out.println(payment.getAmount());
	}
}
