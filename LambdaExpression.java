package com.secondjavaprogram;

public class LambdaExpression 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int width = 10;
		Drawable d = () -> {
			System.out.println("drawable of the width:"+ width);
		};
		d.drawable();
	}
}
	
