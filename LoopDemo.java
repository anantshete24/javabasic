package com.example;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args) {

			int i=0;
			Scanner scan= new Scanner(System.in);
			i=scan.nextInt();
			for(int y=1; y<=10;y++)
			{	
				System.out.println(i+"*"+y+ "=" +i*y);
				
			}
					
	}

}
