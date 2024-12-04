package com.example;

public class InheritanceDemo2 {

	public static void main(String[] args) {


		Adder a = new Adder();
		//print name of the super class
		System.out.println(a.getClass().getSuperclass().getName());
		//call adders method
		System.out.println(a.add(10,30)+ " "+ a.add(3,20) + " " + a.add(20,30));
	}

}
