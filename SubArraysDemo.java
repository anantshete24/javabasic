package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class SubArraysDemo {

	public static void main(String[] args) {

		/*
		int [][][] arr=new int[2][2][2];
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		//retrieve value
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		//iterate for sum
		
		
		for(int i=0; i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					sum=sum+arr[i][j][k];
					if(sum<0)
					{
						System.out.println("sum is negative");
					}
					else
					{
						System.out.println("Sum is positive");
					}
					System.out.println();
				}
			}
		}
*/
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []a=new int[n];
		
		for(int i=0; i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		scan.close();
		
		int numNegative=0;
		
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i; j<n; j++)
			{
				
				sum=sum+a[j];
				//debug statement to print subarray and its sum
				 System.out.println("Subarray: " + Arrays.copyOfRange(a, sum, j) +"Sum" +sum);
				 //Arrays.toString(Arrays.copyOfRange(a, i, j + 1)) + " Sum: " + sum);
			}
			if(sum<0)
			{
				numNegative++;
			}
			
		}
		
		System.out.println(numNegative);
	}
	

}
