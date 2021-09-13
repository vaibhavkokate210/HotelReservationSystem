package com.bridgelabz.hotelreservationtest;
import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bridgelabz.hotelreservation.CustomerType;
import com.bridgelabz.hotelreservation.Hotel;
import com.bridgelabz.hotelreservation.HotelReservation;
import com.bridgelabz.hotelreservation.Rate;


public class HotelReservationTest 
{
	HotelReservation hotelReservation;
	Hotel lakewood;
	Hotel bridgewood;
	Hotel ridgewood;
	
	@Before
	public void add_HotelIn_HotelReservationSystem()
	{
		hotelReservation=new HotelReservation();
		
		int size=hotelReservation.sizeOfList();
		Assert.assertEquals(0, size);
		
		HashMap<CustomerType,Rate> customerTypeMap=new HashMap<>();
		customerTypeMap.put(CustomerType.REGULAR, new Rate(110,90));
		customerTypeMap.put(CustomerType.REWARD, new Rate(80,80));
		lakewood=new Hotel("Lakewood",3,customerTypeMap);
		
		customerTypeMap=new HashMap<>();
		customerTypeMap.put(CustomerType.REGULAR, new Rate(160,60));
		customerTypeMap.put(CustomerType.REWARD, new Rate(110,50));
		bridgewood=new Hotel("Bridgewood",4,customerTypeMap);
		
		customerTypeMap=new HashMap<>();
		customerTypeMap.put(CustomerType.REGULAR, new Rate(210,150));
		customerTypeMap.put(CustomerType.REWARD, new Rate(100,40));
		ridgewood=new Hotel("Ridgewood",4,customerTypeMap);
		
		hotelReservation.addHotel(lakewood);
		hotelReservation.addHotel(bridgewood);
		hotelReservation.addHotel(ridgewood);
		
		size=hotelReservation.sizeOfList();
		Assert.assertEquals(3, size);
	}
	
	@Test
	public void find_CheapestHotel_ForGivenDate()
	{
		String cheapHotel=hotelReservation.findCheapestHotel(CustomerType.REGULAR,"11Sep2020","12Sep2020");
		Assert.assertEquals("Lakewood 200", cheapHotel);
		System.out.println(cheapHotel);
	}
	@Test
	public void find_Cheapest_BestRated_Hotel_ForGivenDate()
	{
		String cheaperHotel=hotelReservation.findCheapestTopRatedHotel(CustomerType.REGULAR,"11Sep2020","12Sep2020");
		Assert.assertEquals("Bridgewood 220 4", cheaperHotel);
		System.out.println(cheaperHotel);
	}
	
	@Test
	public void find_BestRated_Hotel_ForGivenDate()
	{
		String cheapHotel=hotelReservation.BestRatedHotel();
		Assert.assertEquals("Ridgewood 5", cheapHotel);
		System.out.println(cheapHotel);
	}
	@Test
	public void find_Cheapest_BestRated_Hotel_ForGivenDate_Reward()
	{
		String cheapHotel=hotelReservation.findCheapestTopRatedHotel(CustomerType.REWARD,"11Sep2020","12Sep2020");
		Assert.assertEquals("Ridgewood 140 4", cheapHotel);
		System.out.println(cheapHotel);
	}
}