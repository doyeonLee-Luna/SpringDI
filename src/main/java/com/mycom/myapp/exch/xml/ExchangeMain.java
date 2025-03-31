package com.mycom.myapp.exch.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.myapp.exch.xml.Exchange;

public class ExchangeMain {

	public static void main(String[] args) {
		// 개발자가 직접 객체 생성
//		Calculator calculator = new Calculator(); // 생성된 객체 의존성
//		System.out.println(calculator.add(3, 7));
		
		// Spring DI 를 이용한 객체 생성
		// main() 에서 Spring Framework 의 환경
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml/exch-xml.xml"); // 설정 xml 문서 
		Exchange exchange = (Exchange) context.getBean("exchange");
		
		
		int wonAmount = 10000;
		double audAmount = exchange.convertToAUD(wonAmount);
		System.out.println(wonAmount + " KRW = " + audAmount + " AUD");
		
		context.close();


	}

}
