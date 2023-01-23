package com.secondjavaprogram;

interface Environment{
	void sum(int input1,int input2);
}
public class CalculatorImp2 
{
	public static void main(String args[])
	{
		 Environment environment = (int input1,int input2) -> {
			 System.out.println(input2 * input1);
			 System.out.println(input2 + input1);
			 System.out.println(input2 / input1);
			 
			 
		 };
		 environment.sum(20,30);
	}

}
