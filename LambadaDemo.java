package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.example.MyMath.PerformOperation;

public class LambadaDemo {
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {

		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());


		while(t-->0)
		{
			String [] input =br.readLine().split(" ");
	
			int choice =Integer.parseInt(input[0]);
			int number = Integer.parseInt(input[1]);
			PerformOperation operation;
			boolean result;
			
			switch(choice)
			{
			case 1: operation=MyMath.isOdd();
					result=MyMath.checker(operation, number);
					System.out.println(result? "ODD" : "EVEN");
					break;
			
			case 2:
					operation=MyMath.isPrime();
					result=MyMath.checker(operation,number);
					System.out.println(result? "PRIME" :"COMPOSITE");
					break;
				
			case 3:
					operation=MyMath.isPalindrome();
					result=MyMath.checker(operation, number);
					System.out.println(result? "PALINDORME" :"NOT PALINDROME");
					break;
					
			default :
					System.out.println("Invalid choice!");
			}
			
		}

}

}