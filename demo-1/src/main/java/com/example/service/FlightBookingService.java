package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.FlightBookingAcknowledgement;
import com.example.dto.FlightBookingRequest;
import com.example.entity.PassengerInfo;
import com.example.entity.PaymentInfo;
import com.example.repository.PassengerInfoRepository;
import com.example.repository.PaymentInfoRepository;
import com.example.utils.PaymentUtils;

@Service
@Transactional
public class FlightBookingService {
	
	@Autowired
	private PassengerInfoRepository passengerInfoRepository;
	
	@Autowired
	private PaymentInfoRepository paymentInfoRepository;
	
	public FlightBookingAcknowledgement bookTicket(FlightBookingRequest flightBookingRequest) {
		
 		
		PassengerInfo passengerInfo=flightBookingRequest.getPassengerInfo();
		passengerInfo=passengerInfoRepository.save(passengerInfo);
		
		PaymentInfo paymentInfo=flightBookingRequest.getPaymentInfo();
		
		PaymentUtils.validateAmount(paymentInfo.getAccountNo(), passengerInfo.getFare()); 
		
		paymentInfo.setPassengerId(passengerInfo.getPid());
		paymentInfo.setAmount(passengerInfo.getFare());
		
		
 		paymentInfoRepository.save(paymentInfo);
		
		return new FlightBookingAcknowledgement("Success",passengerInfo.getFare(),UUID.randomUUID().toString().split("_")[0],passengerInfo);
		
	}
	
	public List<PassengerInfo> getInfo()
	{
		return passengerInfoRepository.findAll();
	}
	
	public Optional<PassengerInfo> getPassengerAndPaymentInfo(String name,String accNo)
	{
		return passengerInfoRepository.queryBy(name,accNo);	}

}
