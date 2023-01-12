package com.secondjavaprogram;
import java.util.ArrayList;
public class Collection7
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//comparing the two arraylist by using equals method
		ArrayList<String> al = new ArrayList<>();
		al.add("banglore");
		al.add("hyderabad");
		al.add("chennai");
		al.add("mumbai");
		al.add("delhi");
		System.out.println("Arraylist:"+ al);
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("banglore");
		al1.add("hyderabad");
		al1.add("chennai");
		al1.add("mumbai");
		al1.add("delhi");
		//al1.add;
		System.out.println("Arraylist:" + al1);
		boolean bool = al.equals(al1);
		System.out.println(bool);
		al.add("kolkata");
		boolean bool1 = al.equals(al1);
		System.out.println(bool1);
	}

}
