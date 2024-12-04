package com.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalDemo {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String []s=new String[num+2];
		for(int i=0;i<num;i++)
		{
			s[i]=scan.next();
		}
		scan.close();
		
		for(int i=0;i<num;i++)
		{
			BigDecimal max=new BigDecimal(s[i]);
			int idx=i;
			
			for(int j=i+1;j<num;j++)
			{
				BigDecimal cur=new BigDecimal(s[i]);
				
				if(cur.compareTo(max)==1)
				{
					max=cur;
					idx=j;
				}
			}
				
			String temp=s[i];
			s[i]=s[idx];
			s[idx]=temp;
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(s[i]);
		}
	}

}
