package com.example;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerDemo {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		BigInteger b1=scan.nextBigInteger();
		BigInteger b2=scan.nextBigInteger();
		
		BigInteger b3=b1.multiply(b2);
		
		System.out.println("Addition" +" "+ b1+b2);
		System.out.println("Multiplication" +" "+ b3);
		scan.close();
		
	}

}
