package com.secondjavaprogram;

class Outer_Demo{
	 
	private class Inner_Demo{
		
		public void print()
		{
			System.out.println("This is an inner class");
		}
	}
	public void display_Inner() {
		
		Inner_Demo inClass = new Inner_Demo();
		inClass.print();
	}
}
public class InnerClasses{
	public static void main(String args[]) {
		
		Outer_Demo outClass = new Outer_Demo();
		outClass.display_Inner();
	}
}

