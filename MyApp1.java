package com.tap.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp1 {

	public static void main(String[] args) {
		
		//Load application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
//		Get bean
		
		 Car car=(Car) context.getBean("nano");
		
//		Call getDetails()
		System.out.println(car.getCarDetails());
		
//		close context object
		
context.close();
	}

}
