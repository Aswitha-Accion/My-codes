package com.secondjavaprogram;

public class Object2 
{
	String name = "Banglore is the one of the popular city";
	public static void main(String[] args) 
	{
		try
		{
			Class cls = Class.forName("Object2");
			Object2 obj = (Object2)cls.newInstance();
			System.out.println(obj.name);
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(IllegalAccessException ex)
		{
			ex.printStackTrace();
		}
		catch(InstantiationException ex)
		{
			ex.printStackTrace();
		}
		
	}

}
