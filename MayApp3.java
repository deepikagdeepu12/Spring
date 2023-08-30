package com.tap.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MayApp3 {

	public static void main(String[] args) {

//Load application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
//		Get Bean
		Audi car = (Audi) context.getBean("audi");
		
		
		
//		Call getCarDetails()
		
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetail());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		
		
//		Close context object
		
		context.close();
		
		
		
	}

}
