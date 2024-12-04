package com.example;

import java.util.Scanner;

public class ScanIf {

	public static void main(String[] args) {
		
		int i;
		Scanner scan=new Scanner(System.in);
		i=scan.nextInt();
		scan.close();
		if(i>0 && i<=2)
		{
			if(i%2==0)
			{
				System.out.println(" in first if"+"  "+ "Weird");
			}
			else
			{
				System.out.println("In First "+"Not Weird");
				
			}
		}
		if(i>2 && i<=5)
		{
			if(i%2==0)
			{
				System.out.println("In second if" +"Not Weird");
			}
			else
			{
				System.out.println("In second else" +" " + "Weird");
			}
			
		}
		if(i>=6 && i<=20)
		{
			if(i%2==0)
			{
				System.out.println("In 6 if " +"even Weird");
			}
			else
			{
				System.out.println("In 6 if " +" odd Weird");
			}
		
		}
		if(i>20)
		{
			System.out.println("In last If"+ " " +"Not Weird");
		}
	}

}
