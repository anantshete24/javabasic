package com.example;

import java.util.Scanner;

public class FactoryPatternDemo {

	
	public static void main(String[] args) {

		Do_Not_Terminate.forbidExit();
		try
		{
			Scanner scan = new Scanner(System.in);
			FoodFactory foodfactory = new FoodFactory();


			
			Food food = foodfactory.getFood(scan.nextLine());
	
			if(food!=null)
			{
			System.out.println("The Facotry Returned "+food.getClass().getName());
			System.out.println(food.getType());
			}
			else
			{
				System.out.println("Invalid order");
			}
		}
		catch(Do_Not_Terminate.ExitTrappedException e)
		{
			System.out.println("Unsucessful Termination!");
		}
	}

}
