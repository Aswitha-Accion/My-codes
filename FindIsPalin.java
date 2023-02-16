package com.secondjavaprogram;
import java.util.Scanner;
public class FindIsPalin 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev=0,n1=n;
		while(n!=0)
		{
			int rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		if(n1==rev )
		{
			System.out.println("It is a palin");
		}
		else
		{
			System.out.println("It is not a palin");
		}
	}
}
