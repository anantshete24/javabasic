package com.example;

import java.util.Scanner;

//Java String Tokens
public class StringTokensDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine().trim();
		scan.close();
		if(str.length()==0)
		{
			System.out.println(0);
		}
		else if(str.isEmpty())
		{
			System.out.println(0);
		}
		else
		{
			String [] strings=str.split("\\p{Space}+");
			strings=str.split("[^\\p{Alpha}]+");
			System.out.println(strings.length);
			for(String str1:strings)
				System.out.println(str1);
		}
	}

}
