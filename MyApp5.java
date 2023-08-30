package com.tap.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyApp5 {

	public static void main(String[] args) {
		
		//Load application context
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		
		
//		Get Bean
		
		//both are showing same object so is called as Singleton design pattern
		Car car=(Car) context.getBean("audi");
		Car car1=(Car) context.getBean("audi");
		
		
//		Call getCarDetails()
		
		System.out.println(car);
		System.out.println(car1);
 		
		
		
		
		
//		Close context object

		context.close();
	}

}
