package com.secondjavaprogram;

import java.util.ArrayList;

public class ForEach1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		
		emps.add(new Employee(101,"ajay"));
		emps.add(new Employee(102,"akash"));
		emps.add(new Employee(103,"arun"));
		
		
		for(Employee Employee : emps)
		{
			System.out.println(Employee.id +"-----"+ Employee.name);
		}
		

	}

}
