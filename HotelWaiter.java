package com.secondjavaprogram;

public class HotelWaiter
{
	public static Beverage takeOrder(String BeverageType)
	{
		Beverage beverageBuilder = null;
		
		if(BeverageType.equalsIgnoreCase("tea"))
		{
			beverageBuilder = new Beverage();
		}
		else if(BeverageType.equalsIgnoreCase("coffee"))
		{
			beverageBuilder = new Beverage();
		}
		else
		{
			System.out.println("no order"+ BeverageType);
		}
		return beverageBuilder;
	}
}

	