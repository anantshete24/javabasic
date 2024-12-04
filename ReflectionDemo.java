package com.example;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class ReflectionDemo {

	public static void main(String[] args) {
		
		Class<Student3> student=Student3.class;
		
		Method[] methods=student.getDeclaredMethods();
		ArrayList<String>methodList=new ArrayList<>();
		
		for(Method method:methods)
		{
			methodList.add(method.getName());
		}

		Collections.sort(methodList);
		
		for(String name:methodList)
		{
			System.out.println(name);
		}
	}	

}
