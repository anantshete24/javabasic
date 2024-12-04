package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) throws IOException {

		try 
		{	/*Scanner scan = new Scanner(System.in);
			int a =scan.nextInt();
	
			int  b =scan.nextInt();
			 
			int c =scan.nextInt();

			String myString =scan.next();
					
			scan.close();
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);;
			System.out.println("My String"+" " +myString);
			*/
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int str=br.read();
			System.out.println(str);
		}
		finally
		{
			
		}
}
}
