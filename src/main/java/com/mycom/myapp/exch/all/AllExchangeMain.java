package com.mycom.myapp.exch.all;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.myapp.exch.hasa.HasaExchange;

public class AllExchangeMain {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/all-exch-annotation.xml"); // 설정 xml 문서 

		AllHasaExchange allhasaExchange = (AllHasaExchange)context.getBean("allhasaExchange"); 

		
		
		int wonAmount = 10000;
		double audAmount = allhasaExchange.convertToAUD(wonAmount);
		System.out.println(wonAmount + " KRW = " + audAmount + " AUD");
		
		context.close();

	
	}

}
