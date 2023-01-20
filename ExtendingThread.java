package com.secondjavaprogram;

public class ExtendingThread extends Thread
{
	public void run()
	{
		System.out.println("This is my pc");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExtendingThread t = new ExtendingThread();
		t.start();
		System.out.println("Banglore is the biggest city in india");

	}

}
