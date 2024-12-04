package com.example;

import java.util.Scanner;

public class DatatypesDemo {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++)
		{
			try
			{
				double x=scan.nextDouble();
				System.out.println(x+"Can be fitted anywhere");
				if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
				{System.out.println("*byte");
				
				}
				if(x>=-Short.MIN_VALUE && x<=Short.MAX_VALUE)
				{System.out.println("*short");
				
				}
				if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
				{System.out.println("*int");
				
				}
				if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
				{System.out.println("*long");
				
				}
				if(x>=Float.MIN_VALUE && x<=Float.MAX_VALUE)
				{System.out.println("*float");
					
				}
				if(x>=Double.MIN_VALUE  && x<=Double.MAX_VALUE) 
				{
					System.out.println("*double");
				}
				
			}
			catch(Exception e)
			{
				System.out.println(scan.next()+"Cant be fitted anywhere");
				
			}
		}
				
}

}
