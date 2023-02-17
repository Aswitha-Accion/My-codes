package com.secondjavaprogram;

public class BuilderClient 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Beverage tea  = HotelWaiter.takeOrder("tea");
		System.out.println("tea");
		
		Beverage coffee = HotelWaiter.takeOrder("coffee");
		System.out.println("coffee");

	}

}
