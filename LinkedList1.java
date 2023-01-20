package com.secondjavaprogram;

import java.util.LinkedList;

public class LinkedList1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.add("ashok");
		l1.add(40);
		l1.add(null);
		l1.add("ashokit");
		System.out.println(l1);
		l1.add(0,"java");
		System.out.println(l1);
		l1.set(0,"oracle");
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.addFirst("ashok");
		System.out.println(l1);
		
	}

}


