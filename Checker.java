package com.example;
//Helping class for ComparatorDemo

import java.util.Comparator;

public class Checker implements Comparator<Player>{


/* approach 1
	@Override
	public int compare(Player o1, Player o2) {

		//if 2 players have the same score
		if(o1.score==o2.score)
		{
			//order alphabetically by name
			if(o1.name.compareTo(o2.name)<0)
			{
				return -1;
			}
			else if(o1.name.compareTo(o2.name)>0)
			{
				return 1;
			}
			else 
				return 0;
		}
		else if(o1.score<o2.score)
		{
			return 1;
		}
		return 0;
	}

		//otherwise order higher score first
	
*/
	
//approach 2
	
	public int compare(Player a, Player b)
	{
		//if 2 players have the same score
		if(a.score==b.score)
		{
			return a.name.compareTo(b.name);
		}
		return ((Integer)b.score).compareTo(a.score);
	}
}

