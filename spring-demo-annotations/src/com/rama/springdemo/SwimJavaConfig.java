package com.rama.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:person.properties")
public class SwimJavaConfig {

	// add support to resolve ${...} properties
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	// define bean for our sad fortune service
	private FortuneService sadFortuneService() {
		return new SadFortuneService();
	}

	@Bean 
	public Coach swimCoach() {
		SwimCoach mySwinCoach = new SwimCoach(sadFortuneService());
		return mySwinCoach;
	}

}
