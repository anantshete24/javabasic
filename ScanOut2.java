package com.example;

import java.util.Scanner;

public class ScanOut2 {

	public static void main(String[] args) 
	{
		int str1;
		double d;
		String str;
		
		Scanner scan = new Scanner(System.in);
		
		str1=scan.nextInt();
		d = scan.nextDouble();
		str = scan.nextLine();
		
	
		
		scan.close();
		
		System.out.println(str1);
		System.out.println(str);
		System.out.println(d);
		
	}
}
