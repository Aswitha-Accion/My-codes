package com.secondjavaprogram;

public class Egg2
{
	static int a = 10;
	static int b;
	
	static
	{
		System.out.println("static block initialized");
		b = a * 100;
	}
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		System.out.println(" value of a :" + a);
		System.out.println(" value of b :" + b);
	}
}


