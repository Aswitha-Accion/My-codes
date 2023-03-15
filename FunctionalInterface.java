package com.secondjavaprogram;

public class FunctionalInterface 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Calculator c = (i,j) -> System.out.println("sum:"+(i+j));
		c.add(200,300);
		c.add(400,500);
	}
}
