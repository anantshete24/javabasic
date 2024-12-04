package com.example;

import java.util.Scanner;

public class EodDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		while(scan.hasNextLine())
		{
			String str = scan.nextLine();
			if(str.equals("EOF") || str.equals("End Of File"))
			{
				break;
			}
			System.out.println("Your entered input"+str);
		}
			scan.close();
		
			System.out.println("Program terminated !");
	}

}
