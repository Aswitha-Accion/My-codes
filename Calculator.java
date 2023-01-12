package com.secondjavaprogram;

public class Calculator 
{
	
		// TODO Auto-generated method stub
		public void sum(int a, int b)
		{
			System.out.println("sum is : "+(a+b));
		}
		public void sum(float a, float b)
		{
			System.out.println("sum is:"+ (a+b));
		}
		
		public static void main(String[] args) 
		{
			Calculator cal = new Calculator();
			cal.sum(7, 8);
			cal.sum(3.4f,5.9f);
		}
}
//method overloading- having same method with different type of parameters.