package com.tap.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nano")	
public class Nano implements Car
{
//	private RocketEngine rocketEngine;

	
	private Engine engine;
	
	
	@Autowired
public Nano() {
	super();
	this.engine = engine;
}

//	public Nano() {
//		// TODO Auto-generated constructor stub
//	}
//	
	
//	public Nano(RocketEngine rocketEngine) {
//		super();
//		this.rocketEngine = rocketEngine;
//	}

	@Override
	public String getCarDetails() {
		
		return "Nano";
	}

//	@Override
//	public String getEngineDetail() {
//		
//		return rocketEngine.getEngineDetail();
//	}
	
	@Override
	public String getEngineDetail() {
		
		return engine.getEngineDetail();
	}

	

}
