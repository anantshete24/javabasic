package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortDemo {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numer of students ");
		int num=scan.nextInt();
		Student st;
		List<Student> list=new ArrayList<Student>();
		while(num>0)
		{
			System.out.println("Please enter student id :");
			int id=scan.nextInt();
			System.out.println("Please enter student name :");
			String fname=scan.next();
			System.out.println("Please enter CGPA score:");
			double cgpa=scan.nextDouble();
			st = new Student(id,fname,cgpa);
			
			list.add(st);
			num--;
		}

		list.sort(Comparator
				.comparingDouble(Student::getCgpa).reversed()
				.thenComparing(Student::getFname)
				.thenComparing(Student::getId));
			
			list.forEach(System.out::println);
			// above line is equivalent to students.forEach(student -> System.out.println(student));
	}
}


