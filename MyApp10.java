package com.tap.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp10 {

	public static void main(String[] args) {

		// Load application context

				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anotationApplicationContext.xml");

//				Get Bean

				Car car1 = context.getBean("bmw", Car.class);
				Car car2=context.getBean("bmw" ,Car.class);

//				Call getCarDetails()

				
				
				System.out.println(car1);
				System.out.println(car2);

//		      Close context object

				context.close();


	}

}
