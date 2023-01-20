package com.secondjavaprogram;

public class Geeks 
{
	public void m1()
	{
		System.out.println("Accion labs");
	}
}
class ExtendingThread extends Geeks implements Runnable
{
	public void run()
	{
		System.out.println("Accion labs in sigma soft tech park");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExtendingThread t = new ExtendingThread();
		t.m1();
		Thread t1 = new Thread();
		t1.start();
		System.out.println("sigma tech park");

	}

}
