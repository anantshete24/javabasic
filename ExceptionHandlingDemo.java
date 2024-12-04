package com.example;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static long power(long i, long p) throws Exception
	{

		if(i<0 || p<0 )
		{
			throw new Exception("n or p should not be negative");
		}
		if(i==0 && p==0)
		{
			throw new Exception("n or p should not be 0");
		}
		
		return (long) Math.pow(i, p);
	}
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N:");
		long n = scan.nextLong();
		System.out.println("Enter P:");
		long p=scan.nextLong();
		
		try
		{
			System.out.println(power(n,p));
		}
		catch(Exception e)
		{
			System.out.println("Exception!"+e.getMessage());
		}
		finally
		{
			scan.close();
		}
		
	}

}
