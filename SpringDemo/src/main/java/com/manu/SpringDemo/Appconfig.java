package com.manu.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig 
{
	@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}

}
