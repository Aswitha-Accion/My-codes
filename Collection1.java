package com.secondjavaprogram;
import java.util.ArrayList;
public class Collection1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//By using get and set methods
		ArrayList<String> al = new ArrayList<>();
		al.add("mango");
		al.add("banana");
		al.add("orange");
		al.add("pineapple");
		al.add("cucumber");
		System.out.println("returning element:" + al.get(4));
		al.set(1, "Apple");
		System.out.println("Accessing element:"+ al.set(1, "apple"));
		for(String fruits : al)
		{
			System.out.println(fruits);
		}
	}
}
