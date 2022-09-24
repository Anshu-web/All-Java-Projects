package com.example.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.exception.InsufficientException;

public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();

	static {
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc1", 13000.0);
		paymentMap.put("acc1", 14000.0);
		paymentMap.put("acc1", 18000.0);

	}
	
	public static boolean validateAmount(String accNo,double paidAmount) {
		
		if(paidAmount>paymentMap.get(accNo)) {
			throw new InsufficientException(" Please pass valid amount ...!!!!");
		}
		else {
			return true;
		}
		
	}

}
