package com.bridgelabz.hotelreservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HotelReservation 
{
	List<Hotel> hotel;
	static final DateTimeFormatter FRMATTER = DateTimeFormatter.ofPattern("ddMMMyyyy");
	
	public HotelReservation() 
	{
		this.hotel=new ArrayList<>();
	}
	
	public boolean addHotel(Hotel hotel)
	{
		return this.hotel.add(hotel);
	}

	public int sizeOfList() 
	{
		return this.hotel.size();	
	}
}
