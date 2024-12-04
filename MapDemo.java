package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {

	
		Scanner scan=new Scanner(System.in);
		
		HashMap <String,String> map= new HashMap<>();
		
		System.out.println("Enter numbers for loop:");
		int i=scan.nextInt();
	

		for(int k=0;k<i;k++)
		{
			System.out.println("Enter name");
			String name=scan.next();
			System.out.println("Enter number");
			String num=scan.next();
			map.put(name,num);
		}
		
		System.out.println("Enter name of a person :");
		String name=scan.next();


	
		while(true)
		{
		if(map.containsKey(name))
		{

			System.out.println(map.get(name));
			break;
		}
		else
		{
			System.out.println("Not Found");
			break;
			
		}
	}
		scan.close();
	
	/*	
		 Scanner scanner = new Scanner(System.in);
	        HashMap<String, String> phoneBook = new HashMap<>();

	        // Input the number of entries
	        System.out.println("Enter the number of entries in the phone book:");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // Consume the newline character

	        // Input phone book entries
	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter name:");
	            String name = scanner.nextLine();
	            System.out.println("Enter phone number:");
	            String phoneNumber = scanner.nextLine();
	            phoneBook.put(name, phoneNumber);
	        }

	        // Query the phone book
	        System.out.println("Enter names to query (type 'exit' to stop):");
	        while (true) {
	            String query = scanner.nextLine();
	            if (query.equalsIgnoreCase("exit")) {
	                break;
	            }
	            if (phoneBook.containsKey(query)) {
	                System.out.println(query + " = " + phoneBook.get(query));
	            } else {
	                System.out.println("Not found");
	            }
	        }

	        scanner.close();
	*/
		}

}
