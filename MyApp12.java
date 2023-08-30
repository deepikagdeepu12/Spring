package com.tap.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp12 {

	public static void main(String[] args) {

		// Load application context

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(CarConfig.class);
//		Get Bean

		
		Car car = context.getBean("audi", Car.class);

//		Call getCarDetails()
		System.out.println(car);

//      Close context object

		context.close();

	}

}
