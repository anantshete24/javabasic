package com.example;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X:");
		int x=scan.nextInt();
		System.out.println("Enter Y:");
		int y=scan.nextInt();
		
		try
		{
			int ans=x/y;
			System.out.println("Answer is"+ans);
		}
		catch(Exception e)
		{
			System.out.println("Error!"+e.getClass().toString());
		}
		scan.close();
	}

}
