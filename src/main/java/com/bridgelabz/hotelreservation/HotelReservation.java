package com.bridgelabz.hotelreservation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HotelReservation 
{
	List<Hotel> hotel;
	static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("ddMMMyyyy");
	
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

	public String findCheapestHotel(CustomerType type, String startDate, String endDate) 
	{
		int weekDay=0,weekEnd=0;
		int cheapestRate=0;
		String name = null;
		LocalDate startLocalDate=LocalDate.parse(startDate, FORMATTER);
		LocalDate endLocalDate=LocalDate.parse(endDate, FORMATTER);
		
    	for (LocalDate date = startLocalDate; date.isBefore(endLocalDate.plusDays(1)); date = date.plusDays(1))
		{
    		DayOfWeek day = DayOfWeek.of(date.get(ChronoField.DAY_OF_WEEK));
    	      switch(day) 
    	      {
    	         case SATURDAY:
    	                     weekEnd++;
    	                     break;
    	         case SUNDAY:
    	        	        weekEnd++;
    	        	        break;
    	         default:
    	        	       weekDay++;
    	        	       break;
    	      }
		}
    	
		Iterator<Hotel> itr=hotel.iterator();
		while(itr.hasNext())
		{
			Hotel getHotel=itr.next();
			Map<CustomerType,Rate> rate=getHotel.getRate();
			for(Map.Entry<CustomerType,Rate> entry:rate.entrySet())
			{
				if(entry.getKey().equals(type))
				{
					Rate cost=entry.getValue();
					int total=weekDay*cost.getWeekdayRate()+weekEnd*cost.getWeekendRate();
					if(cheapestRate==0)
					{
						cheapestRate=total;
						name=getHotel.getName();
					}
					if(total<cheapestRate)
					{
						cheapestRate=total;
						name=getHotel.getName();
					}
				}
			}
		}
		return name+" "+cheapestRate;
	}
}
