package com.digitek.dao;

public class WeekdayStringExample {

	public static void main(String[] args) {
		
		
		int week = 5;
		String weekstring;
		switch(week) {
		      case 1: weekstring = "Mon";
		break;
		      case 2: weekstring = "Tue";
		break;
		      case 3: weekstring = "Wed";
		break;
		      case 4: weekstring = "Thr";
		break;
		      case 5: weekstring = "Fri";
		break;
		      case 6: weekstring = "Sat";
		break; 
		      case 7: weekstring = "Sun";
		break;  
		default: weekstring = "Invalid day";
		break;
		}
	
		System.out.println(weekstring);

	}

}
