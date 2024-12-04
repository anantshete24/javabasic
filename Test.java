package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Test {



	public static void main(String[] args) 
	{
		Stack <Character> stack= new Stack<>();
		
		stack.add('a');
		stack.add('b');
		stack.add('c');
		System.out.println(stack.pop());
		System.out.println(stack);
		
		Singleton s= new Singleton();
		s.getSingleInstance();
		
	}

}
