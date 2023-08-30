package com.tap.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp6 {

	public static void main(String[] args) {

		
		// Load application context

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
//				Get Bean

		Car car = (Car) context.getBean("audi");

//		Call getCarDetails()

		System.out.println(car);

		// Close context object

		context.close();
		
		

	}

}
