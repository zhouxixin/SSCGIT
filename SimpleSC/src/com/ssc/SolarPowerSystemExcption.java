package com.ssc;

@SuppressWarnings("serial")
public class SolarPowerSystemExcption extends Exception {
	
	public SolarPowerSystemExcption() {
		super();
	}
	
	public SolarPowerSystemExcption(String message) {
		super("Solar Power System Excption: " + message);
		
	}
}
