package com.digitek.exception;

public class IfElseExample2 {
	
	public static void main(String[] args) {
	int  marks = 70 ;

	
    if (marks > 35 & marks <= 60) {
 
        System.out.println("result:" + "passed in Grade D");
 
    } else if (marks > 60 & marks <= 70) {
 
        System.out.println("result:" + "passed in Grade C");
 
    } else if (marks > 70 & marks <= 80) {
 
        System.out.println("result:" + "passed in Grade B");
 
    } else if (marks > 80 & marks <= 100) {
 
        System.out.println("result:" + "passed in Grade A");
 
    } else {
 
        System.out.println("result:" + "fail");
 
    }
  }
}	