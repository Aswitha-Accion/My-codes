package com.secondjavaprogram;
import java.util.ArrayList;
import java.util.Collections;
public class Collection8
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("mango");
		al.add("banana");
		al.add("orange");
		al.add("pineapple");
		al.add("apple");
		System.out.println("Arraylist:" + al);
		Collections.reverse(al);
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("monkey");
		al1.add("cow");
		al1.add("dog");
		al1.add("cat");
		al1.add("zebra");
		System.out.println("Arraylist:" + al1);
		Collections.reverse(al1);
		System.out.println(al1);


	}

}

