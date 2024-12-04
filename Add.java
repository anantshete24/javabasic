package com.example;

import java.util.Arrays;

public class Add {
	
	public void add(int... numbers)
	{
		int sum=0;
		StringBuilder sb= new StringBuilder();
		
		for(int number: numbers)
		{
			System.out.println("before Number:"+number);
			System.out.println("before Numbers:"+Arrays.toString(numbers));
			System.out.println("before sum:"+sum);
			
			sum=sum+number;
			sb.append(number).append("+");			
			System.out.println("after Number:"+number);
			System.out.println("after Numbers:"+Arrays.toString(numbers));
			System.out.println("after sum:"+sum);
		}
			sb.deleteCharAt(sb.length()-1).append("=").append(sum);
			System.out.println(sb.toString());
	}

	
}
