package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class InstanceOfDemo {
	
	static String count(ArrayList myList)
	{
		int a=0, b=0, c=0;
		
		for(int i=0;i<myList.size();i++)
		{
			Object element =myList.get(i);

			if(element instanceof Students)
			{
				a++;
			}
			if(element instanceof Rockstar)
			{	
				b++;
			}
			
			if(element instanceof Hacker)
			{ 
				c++;
			}
			
		}
			String ret=Integer.toString(a)+ " " +Integer.toString(b)+ " " +Integer.toString(c);
			System.out.println("In main"+ret+" "+a);
			return ret;
	}

	public static void main(String[] args) {

		
		ArrayList<Object> myList= new ArrayList<>();
		Scanner scan= new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0;i<t;i++)
		{
			String s = scan.next();
			if(s.equals("Students"))myList.add(new Students());
			if(s.equals("Rockstar"))myList.add(new Rockstar());
			if(s.equals("Hacker"))myList.add(new Hacker());
		}
		System.out.println(count(myList));
	}

}
