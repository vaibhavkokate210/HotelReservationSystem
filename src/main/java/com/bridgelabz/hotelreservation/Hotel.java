package com.bridgelabz.hotelreservation;

import java.time.LocalDate;
import java.util.Map;

public class Hotel 
{
	private int rating;
	private String name;
	private Map<CustomerType,Rate> rate;
	
	public Hotel(String name,int rating,Map<CustomerType, Rate> rate) 
	{
		super();
		this.rating = rating;
		this.name = name;
		this.rate = rate;
	}
	
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<CustomerType, Rate> getRate() {
		return rate;
	}

	public void setRate(Map<CustomerType, Rate> rate) {
		this.rate = rate;
	}

	public int getTotalRate(CustomerType type,LocalDate start,LocalDate end)
	{
		
		return 0;
	}
}
