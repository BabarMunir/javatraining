package com.digitek.dao;


public class TernaryOperator {
 
    public static void main(String[] args) {
 
        ternaryOperator(60);
 
    }
    public static void ternaryOperator(int marks) {
 
        String result = (marks > 35)?"pass":"fail";
 
        System.out.println("result:"+ result);
       // marksUsingIfElse(marks);
    }
}
