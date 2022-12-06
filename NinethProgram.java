package com.secondjavaprogram;
import java.util.Scanner;
public class NinethProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stubS
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		int length = s.length();
		String rev="";
		for(int i=length-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		

	}

}
