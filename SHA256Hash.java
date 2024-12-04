package com.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Hash {

	public static void main(String[] args)throws NoSuchAlgorithmException {

		Scanner scan = new Scanner(System.in);
		String input =scan.nextLine();
		scan.close();
		
		try
		{
			String sha256Hash=getSHA256(input);
			System.out.println(sha256Hash);
		}
		catch(NoSuchAlgorithmException e)
		{
			System.out.println("Error: Unable to Compute SHA-256 Hash");
		}
	}
		public static String getSHA256(String input)throws NoSuchAlgorithmException
		{
			MessageDigest md=MessageDigest.getInstance("SHA-256");
			
			byte[] hashBytes=md.digest(input.getBytes());
			
			StringBuilder hexString= new StringBuilder();
			
			for(byte b: hashBytes)
			{
				String hex=Integer.toHexString(0xff & b);
				
				if(hex.length()==1)
				{
					hexString.append('0');
					
				}
				
				hexString.append(hex);
			}
			
			return hexString.toString();
		}
	}


