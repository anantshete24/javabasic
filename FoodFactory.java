package com.example;

public class FoodFactory {

	public static Food getFood(String order)
	{
		if(order.equalsIgnoreCase("pizza"))
		{
			return new Pizza();
		}
		else if(order.equalsIgnoreCase("cake"))
		{
			return new Cake();
		}
		else 
			return null;
	}
}
