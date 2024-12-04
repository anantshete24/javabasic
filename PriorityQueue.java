package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PriorityQueue {
	
	public static final Priorities priorities = new Priorities();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int totalEvents = scan.nextInt();
		List<String>events=new ArrayList<>();
		
		
		while(totalEvents--!=0)
		{
			String event=scan.nextLine();
			events.add(event);
		}
		
		List <Student2> students=priorities.getStudent(events);
		
		if(students.isEmpty())
		{
			System.out.println("Empty");
		}
		else
		{
			for(Student2 st:students)
			{
				System.out.println(st.getFname());
			}
		}


		scan.close();
	}

}
