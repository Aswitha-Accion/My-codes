package com.secondjavaprogram;

public class Calculator1 
{
	public void dog()
	{
		System.out.println("dog is barking");
		
	}
}
class Egg extends Calculator1
{
	public void dog()
	{
		System.out.println("dog will eat meat");
	}
	public static void main(String[] args) 
    {
		Calculator1 cal1 = new Calculator1();
		cal1.dog();
    }
}
