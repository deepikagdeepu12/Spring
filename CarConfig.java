package com.tap.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.tap.spring")
@PropertySource("classpath:car.properties")
public class CarConfig 
{
	

}
