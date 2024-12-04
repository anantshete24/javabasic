package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AccessControlDemo {

	public static void main(String[] args) throws Exception{
		
		DoNotTerminate.forbidExit();
		
		try {
			BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
			
			int num=Integer.parseInt(br.readLine().trim());
			AccessControlDemo.inner inner=new AccessControlDemo.inner();
			AccessControlDemo.inner.Private innerPrivate =inner.new Private();
			Object o=innerPrivate;
			String result=innerPrivate.powerof2(num);
			System.out.println(result);
			System.out.println("An instance of Class "+o.getClass().getCanonicalName());
			
		}
		catch(DoNotTerminate.ExitTrappedException e){
			
			System.out.println("Unsucessful Termination!!");
			
		}
		}
		
		static class inner{
			
			private class Private{
				
				private String powerof2(int num)
				{
					return ((num&(num-1))==0)?"Power of 2 ":"Not a power of 2";
				}
			}
		}
	

}