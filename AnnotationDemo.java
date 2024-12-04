package com.example;

import java.lang.reflect.Method;
import java.util.Scanner;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int testCases=scan.nextInt();
		while(testCases>0)
		{
			String role=scan.next();
			int spend=scan.nextInt();
			
			try
			{
				Class <FamilyMember>annotatedClass=FamilyMember.class;
				Method[] methods=annotatedClass.getMethods();
				
				for(Method method:methods)
				{
					if(method.isAnnotationPresent(FamilyBudget.class))
					{
						FamilyBudget family=method.getAnnotation(FamilyBudget.class);
						String userRole =family.userRole();
						int budgetLimit =family.budgetLimit();
						
						if(userRole.equals(role))
						{
							
							if(spend<=budgetLimit)
							{
								method.invoke(annotatedClass.getDeclaredConstructor().newInstance(),budgetLimit, spend);
							}
							else
							{
								System.out.println("Budget limit over");
							}
						}
					}
					
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			testCases--;
			System.out.println("test"+testCases);
		}

		
	}

}
