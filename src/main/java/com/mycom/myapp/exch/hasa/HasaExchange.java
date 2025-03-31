package com.mycom.myapp.exch.hasa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class HasaExchange {
	
//	Exchange exchane = new Exchange();
	
    // Spring DI #1 field Injection
//	@Autowired 
//	Exchange exchage;


    // Spring DI #2 setter Injection
//  Exchange exchange;
//
//    @Autowired
//    public void setExchange(Exchange exchange) {
//        this.exchange = exchange;
//    }

    // Spring DI #3 constructor Injection (추천)
    // @Autowired는 필요없음 (생성자 주입은 스프링에서 자동으로 주입됨)
    Exchange exchange;

    // @Autowired
    public HasaExchange(Exchange exchange) {
        super();
        this.exchange = exchange;
    }

    // 원화 -> 호주 달러 환전
    public double convertToAUD(int wonAmount) {
        System.out.println("HasaExchange convertToAUD()");
        return exchange.convertToAUD(wonAmount);
    }
}
