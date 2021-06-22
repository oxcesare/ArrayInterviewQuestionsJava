package com.mx.interview.question12;

import java.math.BigInteger;
import java.security.MessageDigest;

public class CreateHash {

	
	
	public static void main(String[] args) {
		
		
		String inputValue = "this is an example";

		// With the java libraries
		String sha256 = getSHA256(inputValue);

		System.out.println("The SHA-256 of \"" + inputValue + "\" is:");
		System.out.println(sha256);
		System.out.println();
		
		
		
	}
	
	
	 public static String getSHA256(String input){

			String toReturn = null;
			try {
			    MessageDigest digest = MessageDigest.getInstance("SHA-256");
			    digest.reset();
			    digest.update(input.getBytes("utf8"));
			    toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
			} catch (Exception e) {
			    e.printStackTrace();
			}
			
			return toReturn;
		    }

		    public static String getSHA512(String input){

			String toReturn = null;
			try {
			    MessageDigest digest = MessageDigest.getInstance("SHA-512");
			    digest.reset();
			    digest.update(input.getBytes("utf8"));
			    toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
			} catch (Exception e) {
			    e.printStackTrace();
			}
			
			return toReturn;
		    }
		    
		    
}
