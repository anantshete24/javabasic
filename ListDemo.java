package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		List<Integer> arr=new ArrayList<Integer>();
		
		System.out.println("Please enter lenght of Array:");
		int l =scan.nextInt();
		System.out.println("Please enter index of Array:");
		int in=scan.nextInt();
		System.out.println("Please enter number to be inserted:");
		int num=scan.nextInt();
		
		System.out.println("Please enter index to be deleted:");
		int del=scan.nextInt();
		
		for(int i=0;i<l;i++)
		{
			arr.add(scan.nextInt());
		}
		System.out.println("Performing Insertion:");
		arr.add(in, num);
		System.out.println("Performing removal");
		arr.remove(del);
		
		System.out.println(arr);
		scan.close();
	}
	

}
