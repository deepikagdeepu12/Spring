package com.tap.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp8 {

	public static void main(String[] args) {

		
		
		// Load application context

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anotationApplicationContext.xml");

//				Get Bean

		Car car = context.getBean("audi", Car.class);

		
//				Call getCarDetails()

		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetail());

		
		// Close context object

		context.close();

	}

}
