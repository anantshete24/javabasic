package com.example;

public class MyMath {
	

	@FunctionalInterface
	interface PerformOperation
	{
		boolean check(int a);
		
	}
	
	public static PerformOperation isOdd()
	{
		return a-> a%2!=0;
	}
	
	public static PerformOperation isPrime()
	{
		return a-> {
			
		if(a<2) return false;
		
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0) return false;
		}
			
			return true;
		};
	
	}
	public static PerformOperation isPalindrome()
	{
		return a->{
			
			String str=String.valueOf(a);
			return str.equals(new StringBuilder(str).reverse().toString());
			
		};
	}
	
	public static boolean checker(PerformOperation p, int num)
	{
		return p.check(num);
	}


}



