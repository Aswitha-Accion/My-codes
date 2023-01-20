package com.secondjavaprogram;

import java.util.Vector;

public class Vector1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("scahin");
		v.add(new String("sweet"));
		v.add("kohli");
		v.add("dhoni");
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());

	}

}
