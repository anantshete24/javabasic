package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		List<List<Integer>> lines= new ArrayList<>();
		
		List<Integer>row1=new ArrayList<>(Arrays.asList(1,2,3));
		List<Integer>row2=new ArrayList<>(Arrays.asList(23,4,5,32,3));
		List<Integer>row3=new ArrayList<>(Arrays.asList(2223,43,2,2,4,22,0));
		
		lines.add(row1);
		lines.add(row2);
		lines.add(row3);
		
		System.out.println("Arrays"+lines);
		System.out.println("Enter line number");
		
		int l=scan.nextInt();
		System.out.println("Enter Index number");
		
		int i=scan.nextInt();
		
		try {
			System.out.println("numbers are :"+lines.get(l).get(i));
		}
		catch(Exception e)
		{
			System.out.println("Error!"+e);
		}
		
		
		
	}

}
