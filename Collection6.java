package com.secondjavaprogram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Collection6
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(40, null);
		list.add(10, null);
		list.add(100, null);
		Collections.sort(list);
		for(Integer i : list)
		{
			System.out.println(i);
		}

	}

}
