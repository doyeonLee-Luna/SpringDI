package com.mycom.myapp.exch.all;

import org.springframework.stereotype.Component;

@Component("aaa")
public class AllExchangeImpl implements AllExchange{

    @Override
    public double convertToAUD(int wonAmount) {
        System.out.println("AllCalculatorImpl1 convertToAUD()");
        return wonAmount * 0.00098;  // 예시로 환율을 계산하는 방식
    }

}
