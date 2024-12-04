package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumDemo {

	public static void main(String[] args) {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String  str=br.readLine();
			
			int num=Integer.parseInt(str);
			
			
			if(!(num%2==0))
			{
				System.out.println("Number is a prime number");
			}
			else
			{
				System.out.println("Number is not a prime number");
			}
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
	}

}
