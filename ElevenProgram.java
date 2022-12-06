package com.secondjavaprogram;

import java.util.StringTokenizer;
public class ElevenProgram 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer("Welcome to java technologies");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
