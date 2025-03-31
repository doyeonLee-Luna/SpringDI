package com.mycom.myapp.exch.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("allhasaExchange")
public class AllHasaExchange {
	

    AllExchange exchange;


    
    @Autowired
	public void setExchange(@Qualifier("bbb") AllExchange exchange) {
		this.exchange = exchange;
	}



	// 원화 -> 호주 달러 환전
    public double convertToAUD(int wonAmount) {
        System.out.println("HasaExchange convertToAUD()");
        return exchange.convertToAUD(wonAmount);
    }
}
