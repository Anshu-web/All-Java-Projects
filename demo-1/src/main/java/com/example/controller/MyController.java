package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.FlightBookingAcknowledgement;
import com.example.dto.FlightBookingRequest;
import com.example.entity.PassengerInfo;
import com.example.service.FlightBookingService;

@RestController
@RequestMapping(path = "/travel")
public class MyController {

	@Autowired
	private FlightBookingService flightBookingService;

	@RequestMapping(path = "/bookTicket")
	public FlightBookingAcknowledgement bookTicket(@RequestBody FlightBookingRequest flightBookingRequest) {

		return flightBookingService.bookTicket(flightBookingRequest);
	}
	
	@GetMapping(path = "/getInfo")
	public List<PassengerInfo> getPassengerInfo()
	{
		return flightBookingService.getInfo();
	}
	
	@GetMapping(path = "/getJoinInfo")
	public List<PassengerInfo> getPassengerAndPaymentInfo()
	{
		return flightBookingService.getInfo();
	}

}
