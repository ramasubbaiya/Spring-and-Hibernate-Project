package com.rama.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] randomFortune = {
			"See Horoscope today",
			"Drive carefully",
			"Play carefully",
			"Eat carefully"
	};
	
	Random random = new Random();
	
	@Override
	public String getFortune() {
		return randomFortune[random.nextInt(randomFortune.length)];
	}

}
