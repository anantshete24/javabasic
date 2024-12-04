package com.example;

import java.util.Scanner;

public class PrimeDemo {

	public static void primeCheck(int num)
	{
		for(int i=0;i<=num;i++)
		{
		//	System.out.println("in for i:"+i);
		if(!(i%2==0))
		{
			System.out.println("Prime Number:"+i);

			//System.out.println("in if i:"+i);
		}
		else
		{
			System.out.println(" ");
		}
		//System.out.println("after if i:"+i);
		}
	}
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num =scan.nextInt();
		primeCheck(num);
	}

}
