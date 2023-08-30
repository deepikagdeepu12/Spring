package com.tap.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp9 {

	public static void main(String[] args) {

		// Load application context

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anotationApplicationContext.xml");

//		Get Bean

		Audi car = context.getBean("audi", Audi.class);

//		Call getCarDetails()

		
		System.out.println(car.getEngineDetail());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());

//      Close context object

		context.close();

	}

}
