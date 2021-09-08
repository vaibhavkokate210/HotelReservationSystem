package com.bridgelabz.hotelreservation;

public class Rate
{
	private int weekday;
	private int weekend;
	public Rate(int weekday, int weekend) {
		super();
		this.weekday = weekday;
		this.weekend = weekend;
	}
	public int getWeekday() {
		return weekday;
	}
	public void setWeekday(int weekday) {
		this.weekday = weekday;
	}
	public int getWeekend() {
		return weekend;
	}
	public void setWeekend(int weekend) {
		this.weekend = weekend;
	}
	
}
