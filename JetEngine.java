package com.tap.spring;

import org.springframework.stereotype.Component;

@Component("jetEngine")
public class JetEngine implements Engine {

	@Override
	public String getEngineDetail() {
		
		return "Jet Engine is amazing";
	}

}
