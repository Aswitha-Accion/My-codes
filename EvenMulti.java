package com.secondjavaprogram;

public class EvenMulti extends Thread 
{
	String s;
	void A(String name)
	{
		s = name;
	}
	public void run()
	{
		System.out.println("the thread ");
	    int n;
		for(int i=0;i<n;i++)
	   {
		if(i%2==0)
		{
			System.out.println(i);
		}
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}
}

