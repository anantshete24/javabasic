package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of Pairs:");
		int n=scan.nextInt();
		scan.nextLine();
		
		HashSet <String> uniquePairs=new HashSet<>();
		
	

		System.out.println("Enter the pairs :");
		
		for(int i=0; i<n;i++)
		{
			String first = scan.next();
			String second = scan.next();
			scan.nextLine();
			
			uniquePairs.add(first +","+second);
			
			System.out.println("Unique pairs count :"+uniquePairs.size());
			
			System.out.println(uniquePairs);
			
			uniquePairs.add("839293kk");
			System.out.println(uniquePairs);
			
		}
		scan.close();
	}

}
