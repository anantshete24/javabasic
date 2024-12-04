package com.example;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
/*
 Cryptographic hash functions are mathematical operations run on digital data; by comparing the computed hash (i.e., the output produced by executing a hashing algorithm) to a known and expected hash value, a person can determine the data's integrity. For example, computing the hash of a downloaded file and comparing the result to a previously published hash result can show whether the download has been modified or tampered with. In addition, cryptographic hash functions are extremely collision-resistant; in other words, 
 it should be extremely difficult to produce the same hash output from two different input values using a cryptographic hash function.
 */

public class MD5EncryptionDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		try
		{
			String md5Hash=getMD5(input);
			System.out.println(md5Hash);
		}
		catch(NoSuchAlgorithmException e)
		{
			
		}
	}

	public static String getMD5(String input) throws NoSuchAlgorithmException{
		//get an instance of MD5
		
		MessageDigest md =MessageDigest.getInstance("MD5");
		//compute the hash
		byte[] messageDigest=md.digest(input.getBytes());
		
		//convert Byte Array to hexadecimal representation
		
		BigInteger no=new BigInteger(1,messageDigest);
		String hashText=no.toString(16);
		
		while(hashText.length()<32)
		{
			hashText="0"+hashText;
		}
		return hashText;
	}

}
