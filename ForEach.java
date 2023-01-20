package com.secondjavaprogram;

import java.util.ArrayList;
import java.util.Collections;

public class ForEach 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList subList = new ArrayList<Integer>();
		subList.add(10);
		subList.add(20);
		subList.add(30);
		subList.add(40);
		
		subList.forEach(sub -> System.out.println(sub));
	}

}
