package com.secondjavaprogram;
import java.util.Arrays;
import java.util.Scanner;
public class Ninetheen 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int n = sc.nextInt();
		int a[] = new int[n];
		int i=0;
		System.out.println("Enter array elements");
		for(int i=1;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println(a[i]);
	}
}
