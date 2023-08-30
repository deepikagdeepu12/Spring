package com.tap.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bmw")
@Scope("prototype")
public class Bmw implements Car
{
//	private RocketEngine rocketEngine;

	
	private Engine engine;
	

	@Override
	public String getCarDetails() {
		
		return "BMW";
	}

//	public Bmw(RocketEngine rocketEngine) {
//		super();
//		this.rocketEngine = rocketEngine;
//	}
	
	

//	@Override
//	public String getEngineDetail() {
//		
//		return  rocketEngine.getEngineDetail();
//	}

	
	
	@Autowired
	public Bmw(@Qualifier("jetEngine") Engine engine) {
		super();
		this.engine = engine;
	}
	
	
	
public String getEngineDetail() {
		
		return  engine.getEngineDetail();
	}

}
