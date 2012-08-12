package com.ssc;

public class SolarPowerSystem {
	
	private double averageDailyHoursOfSunlight;
	private double efficiencyLossNorthRoof;
	private double efficiencyLossWestRoof;
	private double percentageOnWestRoof;
	private double percentageOnNorthRoof;
	private double panelEfficiency;	
	private double systemSize;	
	private double inverterEfficiency;
	
	
	public SolarPowerSystem() {
		this.averageDailyHoursOfSunlight = 0.0;
		this.efficiencyLossNorthRoof = 0.0;
		this.efficiencyLossWestRoof = 0.0;
		this.percentageOnWestRoof = 0.0;
		this.percentageOnNorthRoof = 0.0;
		this.panelEfficiency = 0.0;	
		this.systemSize = 0.0;	
		this.inverterEfficiency = 0.0;		
	}
	
	public void setSystemSize(double input) {
		this.systemSize = input;		
	}
	
	public void setAverageDailyHoursOfSunlight(double input) {
		this.averageDailyHoursOfSunlight = input;		
	}
	
	public void setEfficiencyLossNorthRoof(double input) {
		this.efficiencyLossNorthRoof = input;		
	}
	
	public void setEfficiencyLossWestRoof(double input) {
		this.efficiencyLossWestRoof = input;		
	}
	
	public void setInverterEfficiency(double input) {
		this.inverterEfficiency = input;		
	}
	
	public void setPercentageOnNorthRoof(double input) {
		this.percentageOnNorthRoof = input;		
	}
	
	public void setPercentageOnWestRoof(double input) {
		this.percentageOnWestRoof = input;		
	}
	
	public void setPanelEfficiencye(double input) {
		this.panelEfficiency = input;		
	}
	
	public double getAverageDailySolarGeneration() {
		
		double averageDailySolarGeneration = 0.0;
		
		averageDailySolarGeneration = this.systemSize *
				(this.percentageOnNorthRoof * (1 - this.efficiencyLossNorthRoof) +
				 this.percentageOnWestRoof * (1 - this.efficiencyLossWestRoof)) *
				 this.panelEfficiency * this.inverterEfficiency * this.averageDailyHoursOfSunlight;
		
		return averageDailySolarGeneration;		
	}
	
	
	
}
