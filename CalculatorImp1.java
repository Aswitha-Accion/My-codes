package com.secondjavaprogram;

interface Module{
	void switchOn();
}

public class CalculatorImp1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Module module = () -> {
			System.out.println("switch on");
		};
		module.switchOn();
	}
}
