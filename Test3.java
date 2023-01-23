package com.secondjavaprogram;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ArrayList<Integer> marks = ArrayList<Integer>();
		marks.add(30);
		marks.add(50);
		marks.add(70);
		marks.add(100);
		marks.add(80);
		marks.add(90);
		marks.add(85);
		
		System.out.prinltn("marks of the student:"+ marks);
		
		List<Stream> updateMarks = marks.stream(). map(i->i+10).collect(Collectorts.tosort());
		
		System.out.println("marks of the students after updating:"+ marks);
		

	}

}
