package com.example;

import java.util.Scanner;

public class InterfaceDemo implements AdvancedArithmetic{

	public static void main(String[] args) {

		InterfaceDemo inter=new InterfaceDemo();
		Scanner scan = new Scanner(System.in);
		int ans=inter.divisor_sum(scan.nextInt());
		
		System.out.println("I implemented"+" " +ans);
		
	}

	@Override
	public int divisor_sum(int n) {

		int sum=0;
		for(int i=1; i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
