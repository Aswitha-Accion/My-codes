package com.secondjavaprogram;
import java.util.Scanner;
public class EigthProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.nextLine();
		System.out.println("enter second string");
		String s2 = sc.nextLine();
		int a = s1.compareTo(s2);
		if(a==0)
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	}

}
