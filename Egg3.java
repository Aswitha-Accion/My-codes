package com.secondjavaprogram;

public class Egg3 
{
	static int n;
	static int j = n();
	
	static
	{
		System.out.println("Inside the static block");
	}
	static int n()
	{
		System.out.println("fom n");
		return 20;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("value of j:" + j);
		System.out.println("Inside main block");

	}

}
