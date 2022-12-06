package com.secondjavaprogram;
import java.util.Scanner;
public class Fourteen 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements you want to store");
		int n = sc.nextInt();
		int a[] = new int[5];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(" No of elements present in the array:"+ a.length);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	

	}

}
