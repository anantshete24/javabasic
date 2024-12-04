package com.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

	/*my code
		Scanner scan= new Scanner(System.in);
		List<Integer> arr= new ArrayList<>();

		System.out.println("enter number for Array");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
			arr.add(scan.nextInt());
		}
		
		System.out.println("array"+arr);
		System.out.println("enter number to find the position of x"+arr);
		int k=scan.nextInt();
		try {
		if(arr.contains(arr.get(k)))
		{
			System.out.println("Position contains"+arr.get(k));
		}
		else
		{
			System.out.println("There is no position contains in the Array");
		}
		}
		catch(Exception e)
		{
			System.out.println("Error"+e);
		}
*/
		
		Scanner scan = new Scanner(System.in);
		
		List<List<Integer>> lines =new ArrayList<>();
		
		System.out.println("Please Enter number of rows to be added");

		int n=scan.nextInt();

		for(int i=0;i<n;i++)
		{
			int k=scan.nextInt();
			List <Integer> line=new ArrayList<>();
			
			for(int j=0;j<k;j++)
			{
				line.add(scan.nextInt());
			}
			lines.add(line);

		}
		System.out.println("Input the number of Queries:");
		int q=scan.nextInt();
		
		//process each query
		
		for(int i=0;i<1;i++)
		{
			int x =scan.nextInt();
			int y=scan.nextInt();
			//check if the query is valid and print the result
			
			if(x>0 && x<=lines.size() && y>0 && y<=lines.get(x-1).size())
			{
				System.out.println(lines.get(x-1).get(y-1));
			}
			else
			{
				System.out.println("Error!!");
				
			}
			
		}
		scan.close();
		

	}

}
