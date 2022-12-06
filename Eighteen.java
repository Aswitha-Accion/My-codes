package com.secondjavaprogram;
import java.util.Scanner;
public class Eighteen 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		int n = sc.nextInt();
		int a[] = new int[6];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int tmp = 0;
		System.out.println("The array elemnts are");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			System.out.println("smallest:" + a[0]);
			System.out.println("second smallest:" + a[n-1]);
			System.out.println("largest:" + a[1]);
			System.out.println("second largest:" + a[n-2]);
		}
	}
}

