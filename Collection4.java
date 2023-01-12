package com.secondjavaprogram;
import java.util.ArrayList;
import java.util.Collections;
public class Collection4
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//sorting the list by using sort method
		ArrayList<String> al = new ArrayList<>();
		al.add("cat");
		al.add("dog");
		al.add("ant");
		al.add("eagle");
		al.add("peacock");
		Collections.sort(al);
		for(String animals:al)
		{
			System.out.println(animals);
		}
	}

}
