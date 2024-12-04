package com.example;

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {
		int t=0;
		Scanner scan = new Scanner(System.in);
		
		t=scan.nextInt();
		for(int i=0; i < t; i++)
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			int n=scan.nextInt();
			
			for(int j=0;j<n;j++)
			{
				a+=b;
				if(j>0)
				{
						System.out.println(" ");
						System.out.println(a);
						b=b*2;
				}
				System.out.println(" ");
			}
		}
		scan.close();
	}
}
