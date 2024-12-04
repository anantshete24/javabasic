package com.example;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [][] arr = new int [6][6];
		
		System.out.println("Enter the 6*6 array elements:");
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("The 6*6 array is:");
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				System.out.println(arr[i][j]+ " ");
			}
			System.out.println();
		}
			
		//calculate Hourglass sum
		
		int maxHourglassSum=Integer.MIN_VALUE;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				//calculate hourglass sum
				int sum= arr[i][j] +arr[i][j+1]+arr[i][j+2]
						+ arr[i+1][j+1]
						+ arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				
				maxHourglassSum=Math.max(maxHourglassSum, sum);
			}
		}
		
		System.out.println("The Maximum Hourgrlass sum is:"+maxHourglassSum);
		
	}
}
