package com.springmanu.MyFirstSpring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	public void drive()
	{
		System.out.println("I can ride the bike");
	}

}
