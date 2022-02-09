package com.example.demo.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ViewModel.VMReservation;
import com.example.demo.ViewModel.VMReservation;
import com.example.demo.model.Reservation;
import com.example.demo.model.User;
import com.example.demo.repository.ReservationRepository;
import com.example.demo.repository.UserRepository;


@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/v1") 
public class ReservationController {
	
	@Autowired
	private ReservationRepository reservation;
	@Autowired
	private UserRepository userRepo;
	@PostMapping("/saveReservation")
	public Reservation saveReservations(@RequestBody Reservation reserve)
	{
		return reservation.save(reserve);
	}
	@GetMapping("/getValidatedDate")
    public int getValidatedDate(@RequestParam Date StartDate,@RequestParam Date EndDate,@RequestParam int treehouseID)
    {
    	return reservation.getReserveDateValidation(StartDate, EndDate, treehouseID);   	
    }
	@GetMapping("/activeReservation")
	public int activeReservation(@RequestParam Long paymentId,@RequestParam Long reservationId)
	{
		return reservation.setActiveReservation(paymentId, reservationId);
	  //return 0;	
	}

}
