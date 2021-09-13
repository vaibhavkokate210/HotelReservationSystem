package com.bridgelabz.hotelreservation;

public class Rate
{
	private int weekdayRate;
	private int weekendRate;
	
	public Rate(int weekdayRate, int weekendRate) 
	{
		super();
		this.weekdayRate = weekdayRate;
		this.weekendRate = weekendRate;
	}

	public int getWeekdayRate() {
		return weekdayRate;
	}

	public void setWeekdayRate(int weekdayRate) {
		this.weekdayRate = weekdayRate;
	}

	public int getWeekendRate() {
		return weekendRate;
	}

	public void setWeekendRate(int weekendRate) {
		this.weekendRate = weekendRate;
	}
	
	
}
