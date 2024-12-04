package com.example;

import java.util.Scanner;

class AbstractDemo{
	
	
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		String title=scan.nextLine();
		MyBook newNovel= new MyBook();
		newNovel.setTitle(title);
		System.out.println("title is:"+newNovel.getTitle());
		scan.close();
	}



}
