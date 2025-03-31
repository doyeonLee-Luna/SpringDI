package com.mycom.myapp.exch.hasa;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExchangeMain {

	public static void main(String[] args) {
		

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/hasa-exch-annotation.xml"); // 설정 xml 문서 

		HasaExchange hasaExchange = (HasaExchange)context.getBean("hasaExchange"); 

		
		
		int wonAmount = 10000;
		double audAmount = hasaExchange.convertToAUD(wonAmount);
		System.out.println(wonAmount + " KRW = " + audAmount + " AUD");
		
		context.close();

	}

}
