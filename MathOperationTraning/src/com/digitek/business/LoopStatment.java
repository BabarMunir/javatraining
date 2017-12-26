package com.digitek.business;

public class LoopStatment {


	

	    

	    public static void main(String[] args) {

	        //printCounterUsingFor();

	        //printCounterUsingWhile();

	        printCounterUsingDoWhile();

	        

	    }

	    

	    public static void printCounterUsingFor() {

	        

	        //Req: Print value 1 till 10

	        //for(starting condition, ending condition, increment during each step)

	        

	        for (int counter = 1; counter <= 10; counter++)

	           {

	              System.out.println (counter);

	           } 

	        

	        //Req: Print value 1 till 10

	        //for(starting condition, ending condition, increment by 4 during each step)

	        for (int counter = 1; counter <= 10; counter+=4)

	           {

	              System.out.println (counter);

	           } 

	    }

	    

	    public static void printCounterUsingWhile() {

	        

	        int counter = 1;// Initialize the counter

	           while (counter <= 10)// Check the counter

	           {

	              System.out.println (counter);

	              counter++;// Update the counter

	           }

	    }

	    

	    public static void printCounterUsingDoWhile() {

	        

	        int value = 50;

	           do

	           {

	              System.out.print ("Enter an integer < 100: ");

	              value++;

	              //value = in.nextInt();

	           }

	           while (value >= 100);

	    }

	    

	}
