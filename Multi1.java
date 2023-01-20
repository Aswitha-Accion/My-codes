package com.secondjavaprogram;

public class Multi1 extends Thread
{
	void add(String name)
	{
		System.out.println("this is thraed");
		
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}
class B 
{
	public static void main1(String args[])
	{
		Add o = new Add();
		o.start();
	}
}
