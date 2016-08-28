package com.rama.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a Sad day for you! Just Kidding. No its not. Be Happy";
	}

}
