package com.secondjavaprogram;
import java.util.Scanner;
public class Fifteen 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int digit,sum=0;
		for(int i=0;i<=n;i++)
		{
			digit = n%10;
			sum = sum+digit;
			n=n/10;
		}
		System.out.println("sum of digits of a number: " + sum);
			

	}

}
