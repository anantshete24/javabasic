package com.example;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringPatternChecker {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int testCases=scan.nextInt();
		while(testCases>0)
		{
			String pattern=scan.nextLine();
			testCases--;
			
			try
			{
				Pattern.compile(pattern);
				System.out.println("Valid");
				
			}
			catch(PatternSyntaxException e)
			{
				System.out.println("Invalid");
			}
		
		}
		scan.close();
		
	}

}
