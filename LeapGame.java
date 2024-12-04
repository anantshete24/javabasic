package com.example;

import java.util.Scanner;

public class LeapGame {

	public static boolean canWin(int leap, int [] game)
	{

		return isSolvable(leap,game,0);
	}
	public static boolean isSolvable(int leap, int []game, int i)
	{
		//base case you win if you move past the last index
		if(i>=game.length)
		{
			return true;
		}
		if(i<0 || game[i]==1)
		{
			return false;
		}
		
		//mark the current index as visited
		game[i]=1;
		
		//recursive checks for each valid move
		return isSolvable(leap, game, i+leap) ||
				isSolvable(leap,game, i+1) ||
				isSolvable(leap, game, i-1);
		
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter for Querries:");
		int q=scan.nextInt();
		while(q-->0)
		{
			int n=scan.nextInt(); //scan of the array
			int leap=scan.nextInt(); //leap distance
			int game[]=new int[n];
			 
			for(int i=0;i<n;i++)
			{
				game[i]=scan.nextInt();
			}
			System.out.println((canWin(leap,game))? "Yes":"No");
		}
		scan.close();
	}

}
