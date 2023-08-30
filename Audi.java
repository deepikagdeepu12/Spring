package com.tap.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("audi")
public class Audi implements Car
{
//	private RocketEngine rocketEngine;
	private Engine engine;
	private String color;
	private String price;

	@Override
	public String getCarDetails() {
		
		return "Audi";
	}

//	@Override
//public String getEngineDetail() {
//		
//		return rocketEngine.getEngineDetail();
//	}
	
public String getEngineDetail() {
		
		return engine.getEngineDetail();
	}

	
//	public RocketEngine getRocketEngine() {
//		return rocketEngine;
//	}
//
//	public void setRocketEngine(RocketEngine rocketEngine) {
//		this.rocketEngine = rocketEngine;
//	}


	
	public Engine getEngine() {
	return engine;
}

	
	@Autowired
public void setEngine(@Qualifier("jetEngine") Engine engine) {
	this.engine = engine;
}





	public String getColor() {
		return color;
	}

	@Value("${color}")
	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	@Value("${price}")
	public void setPrice(String price) {
		this.price = price;
	}

	@PostConstruct
	void myStartUp()
	{
		System.out.println("Bean Created");
	}
		
	@PreDestroy
	void myClosing()
	{
		System.out.println("Bean Destroyed");
	}
		
	
		void fun1()
		{
			System.out.println("default init called");
		}
		
		void fun2()
		{
			System.out.println("default destroy called");
		}
		
		
		
		

	}


