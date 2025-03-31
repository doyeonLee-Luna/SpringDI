package com.mycom.myapp.exch.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// xml , annotation 문서를 대체한다
@Configuration
public class ExchConfiguration {
	// 메소드로 DI  표현
	@Bean
	public Exchange exchange() { // method 이름으로 DI
		return new Exchange();
	}
}
