package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList <String>myList=new ArrayList();
		myList.add("Hello");
		myList.add("Java");
		myList.add("J a v a");
		
		Iterator ir=myList.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
	}

}
