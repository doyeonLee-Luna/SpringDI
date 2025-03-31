package com.mycom.myapp.exch.hasa;

import org.springframework.stereotype.Component;

@Component
public class Exchange {
	private static final double EXCHANGE_RATE = 0.00098;
	
	public double convertToAUD(int won) {
		return won * EXCHANGE_RATE;
	}
}
