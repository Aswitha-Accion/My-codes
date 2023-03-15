package com.secondjavaprogram;

public class FunctionalInterface1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Runnable myThread  = () -> { Thread.currentThread().setName("myThread");
		System.out.println(Thread.currentThread().getName() + "is running");
		};
		
		Thread run = new Thread(myThread);
		run.start();

	}

}
