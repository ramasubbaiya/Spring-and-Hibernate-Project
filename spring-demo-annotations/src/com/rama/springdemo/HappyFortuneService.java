package com.rama.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a Happy day for you! Just Kidding. No its not.";
	}

}