package com.mycom.myapp.exch.all;

public interface AllExchange {
    double EXCHANGE_RATE = 0.00098;  // static final 변수는 생략 가능

    // 기본 구현을 제공하는 default 메서드
    default double convertToAUD(int won) {
        return won * EXCHANGE_RATE;
    }
}
