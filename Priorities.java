package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {


	public List<Student2> getStudent(List<String> events) {

		PriorityQueue<Student2>queue=new PriorityQueue<>();
		for(String event: events)
		{
			String [] parts=event.split(" ");
			if(parts[0].equals("ENTER"))
			{
				String name=parts[1];
				double cgpa=Double.parseDouble(parts[2]);
				int id=Integer.parseInt(parts[3]);
				
				queue.add(new Student2(id,name,cgpa));
				
			}
			else if(parts[0].equals("SERVED"))
			{
				queue.poll();
			}
		}
		
		//convert remaining student in priority order to a list
		
		List<Student2> remainingStudents= new ArrayList<>();
		
		while(!queue.isEmpty())
		{
			remainingStudents.add(queue.poll());
		}
		return remainingStudents;
	}

}
