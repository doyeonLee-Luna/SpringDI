package com.mycom.myapp.exch.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExchangeMain {

	public static void main(String[] args) {
		
		// Spring DI 를 이용한 객체 생성
		// main() 에서 Spring Framework 의 환경
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/exch-annotation.xml"); // 설정 xml 문서 
//		Exchange exchange = context.getBean(Exchange.class); // id 와 무관하게 객체를DI
		Exchange exchange = (Exchange)context.getBean("EEE"); // id 기준 객체를 DI
//		Exchange exchange = (Exchange)context.getBean("exchange"); // class 이름 기준 객체를 DI
		
		
		int wonAmount = 10000;
		double audAmount = exchange.convertToAUD(wonAmount);
		System.out.println(wonAmount + " KRW = " + audAmount + " AUD");
		
		context.close();

	}

}
