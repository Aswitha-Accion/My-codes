package com.secondjavaprogram;
import java.util.Scanner;
public class FindOddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter the lower value");
		int lower = sc.nextInt();
		System.out.println("Enter the high value");
		int higher = sc.nextInt();
		int count=0;
		for(int i= lower; i<=higher; i++)
		{
			if(i%2!=0)
			{
				count++;
			}
		}
		System.out.println("Number of odd numbers:" + count);
	}
}
