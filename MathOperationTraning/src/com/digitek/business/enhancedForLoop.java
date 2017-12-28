package com.digitek.business;

public class enhancedForLoop {

	  public static void enhancedForLoop() {

	        

	        int[] arrayValues = {1,2,3,4,5};

	        int sumOfAllElements = 0;

	        

	            for (int eachArrayValue : arrayValues) {

	                sumOfAllElements += eachArrayValue; // same as: sumOfAllElements =  sumOfAllElements+ eachArrayValue;

	        }

	            

	            System.out.println("sum:" + sumOfAllElements);

	    }
}