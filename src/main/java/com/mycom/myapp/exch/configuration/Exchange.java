package com.mycom.myapp.exch.configuration;

import org.springframework.stereotype.Component;

@Component("EEE")
// @Component -> id 지정 x 그냥 calculator
public class Exchange {
	private static final double EXCHANGE_RATE = 0.00098;
	
	public double convertToAUD(int won) {
		return won * EXCHANGE_RATE;
	}
}
