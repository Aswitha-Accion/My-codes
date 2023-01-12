package com.secondjavaprogram;
import java.util.ArrayList;
import java.util.List;
public class Collection5
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Traversing the list
		List<String> list = new ArrayList<>();
		list.add("abc");
		list.add("cde");
		list.add("efg");
		System.out.println("Traversing list");
		for(String fruits : list)
		{
			System.out.println(fruits);
		}

	}

}
