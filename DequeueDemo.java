package com.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DequeueDemo {

	private static int findMaxUnique(int[] arr, int k) {
		
		Deque <Integer>deque= new ArrayDeque<Integer>();
		Set <Integer> uniqueSet= new HashSet<>();
		int maxUnique=0;
	
		for(int i=0;i<arr.length;i++)
		{
			deque.addLast(arr[i]);
			uniqueSet.add(arr[i]);
		
			if(deque.size()>k)
			{
				int removed=deque.removeFirst();
				if(!deque.contains(removed))
				{
					uniqueSet.remove(removed);
				}
			}
			if(deque.size()==k)
			{
				maxUnique=Math.max(maxUnique,uniqueSet.size());
			}
		}
		return maxUnique;
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter number of elements:");
		int n=scan.nextInt();
		System.out.println("Enter size of subarray (k):");
		int k =scan.nextInt();
		//insert the array 
		int [] arr = new int[n];

		
		for(int i=0;i<n;i++)
		{

			arr[i]=scan.nextInt();
		}

		int maxunique =findMaxUnique(arr,k);
				
		System.out.println("Maximum number of unique integers in any subarray of size "+maxunique);
		scan.close();
	}
}

	

