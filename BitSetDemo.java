package com.example;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BitSetDemo {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		BitSet b1 = new BitSet(n);
		BitSet b2= new BitSet(n);
		
		Map<Integer,BitSet> bitSetMap= new HashMap<>();
		bitSetMap.put(1, b1);
		bitSetMap.put(2, b2);
		for(int i=0;i<m;i++)
		{
			String operation = scan.next();
			int x=scan.nextInt();
			int y=scan.nextInt();
			
			switch(operation)
			{
			case "AND":
				bitSetMap.get(x).and(bitSetMap.get(y));
				break;
				
			case "OR":
				bitSetMap.get(x).or(bitSetMap.get(y));
				break;
				
			case "XOR":
				bitSetMap.get(x).xor(bitSetMap.get(y));
				break;
			case "FLIP":
				bitSetMap.get(x).flip((y));
				break;
				
			case "SET":
				bitSetMap.get(x).set(y);
				break;
			}
			
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		scan.close();
	}

}
