package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class ComparatorDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		Player[] player = new Player[n];
		
		Checker checker = new Checker();
		
		for(int i=0;i<n;i++)
		{
			player[i]=new Player(scan.next(),scan.nextInt());
		}
		scan.close();
		
		Arrays.sort(player,checker);
		
		for(int k=0; k<player.length;k++)
		{
			System.out.printf("%s %s\n",player[k].name,player[k].score);
		}
	}
	

}
