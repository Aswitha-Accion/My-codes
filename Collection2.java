package com.secondjavaprogram;
import java.util.ArrayList;
import java.util.Iterator;
public class Collection2
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<>();
		  list.add("Mango");
		  list.add("Apple");
		  list.add("Banana");
		  list.add("Grapes");
		  //Traversing list through Iterator
		  Iterator itr=list.iterator();//getting the Iterator
		  while(itr.hasNext())
		  {
		       System.out.println(itr.next());
		  }
	}
}
