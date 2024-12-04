package com.example;

import java.util.Scanner;

public class IntToStringDemo {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			int i=scan.nextInt();
			if(i<=-100 || i<=100)
			{
				String str=String.valueOf(i);
				System.out.println("Good Job"+str);
			}
			else
			{
				System.out.println("Please enter number range in the range of -100 to 100");
			}
		}
	}

}
