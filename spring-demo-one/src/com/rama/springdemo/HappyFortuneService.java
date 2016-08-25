package com.rama.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a Happy Day for you!";
	}
} 
