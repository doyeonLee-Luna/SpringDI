package com.mycom.myapp.exch.xml;

public class Exchange {
	private static final double EXCHANGE_RATE = 0.00098;
	
	public double convertToAUD(int won) {
		return won * EXCHANGE_RATE;
	}
}
