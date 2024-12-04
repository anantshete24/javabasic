package com.example;

import java.util.Scanner;


public class StringUserNameDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		while(n--!=0)
		{
			String userName =scan.nextLine();
			if(userName.matches(UserNameValidator.regularExpression))
			{
				/*
				Pattern p = Pattern.compile(UserNameValidator.regularExpression);
				Matcher m=p.matcher(userName);
				*/
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		scan.close();
	}

}
