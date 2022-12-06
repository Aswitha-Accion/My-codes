package com.secondjavaprogram;
import java.util.Scanner;
public class Fifth
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number + "*" + i + "=" + (number*i));
		}
	}
}
