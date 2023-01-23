package com.secondjavaprogram;
import java.util.*;
import java.util.stream.Collectors;
public class Lamda1 
{
	public static void main(String args[])
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(2);
		l.add(4);
		l.add(7);
		l.add(8);
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(1);
		List<Integer> l2 = l.stream().filter(i->i % 2==0).collect(Collectors.toList());
	}

}
