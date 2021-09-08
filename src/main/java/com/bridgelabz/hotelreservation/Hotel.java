package com.bridgelabz.hotelreservation;

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
}
