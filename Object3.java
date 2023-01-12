package com.secondjavaprogram;

public class Object3 implements Cloneable {

	private char[] name;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	    
	    String name = "GeeksForGeeks";

	        Object3 obj1 = new Object3();
	 
	        try 
	        {
	            Object3 obj2 = (Object3)obj1.clone();
	            System.out.println(obj2.name);
	        }
	        catch (CloneNotSupportedException e) 
	        {
	        	e.printStackTrace();
	        }
	 

	}

}
