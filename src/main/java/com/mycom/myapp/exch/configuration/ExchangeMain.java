package com.mycom.myapp.exch.configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.myapp.exch.hasa.Exchange;


public class ExchangeMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/hasa-exch-annotation.xml");
	
		Exchange exchange = (Exchange)context.getBean("exchange"); 
		
		
		int wonAmount = 10000;
		double audAmount = exchange.convertToAUD(wonAmount);
		System.out.println(wonAmount + " KRW = " + audAmount + " AUD");
		
		context.close();

	}

}
