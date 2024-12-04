package com.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatterDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double payment=scan.nextDouble();
	
		NumberFormat frenchFormat=NumberFormat.getCurrencyInstance(Locale.FRENCH);
		NumberFormat usFormat=NumberFormat.getCurrencyInstance(Locale.US);
		String france=frenchFormat.format(payment);
		String usa=usFormat.format(payment);
		
		System.out.println("Formated number in French "+france);
		System.out.println("Formated number in USA "+usa);
		scan.close();
	}

}
