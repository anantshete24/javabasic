package com.example;

public class Singleton {
	
	private static Singleton instance;
	public static String str="Hello World";
	Singleton()
	{
	
		
	}
	static Singleton getSingleInstance()
	{

		if(instance==null)
		{
			instance=new Singleton();
		}
		System.out.println(str);
		return instance;
	}	

}
