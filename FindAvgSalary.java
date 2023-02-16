package com.secondjavaprogram;
import java.util.Arrays;
import java.util.Scanner;
public class FindAvgSalary 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int n = sc.nextInt();
		int[] salaries = new int[n];
		System.out.println("Enter the salaries");
		for(int i=0; i< n; i++)
		{
			salaries[i] = sc.nextInt();
		}
		int min = salaries[0];
		int max = salaries[0];
		for(int i=0; i<salaries.length; i++)
		{
			if(min > salaries[i])
			{
				min = salaries[i];
			}
			if(max < salaries[i])
			{
				max = salaries[i];
			}
		}
		int sum =0;
		for(int i=0; i<salaries.length; i++)
		{
			sum = sum + salaries[i];
		}
		int c = min+max;
		int a1 = sum-c;
		int d = salaries.length-2;
		double avg = a1/d;
		System.out.println("min value:"+ min);
		System.out.println("max value:" + max);
		System.out.println("averages the values:" + avg);
	}
}
		
	
		
		
		




		
		
