package com.nt.test;

public class LeapYear {

	public static void main(String[] args) {
       int year=2020;
       if(((year%4==0)&&(year%100!=0)||(year%400==0))) {
    	   System.out.println("Leap Year :: "+year);
       }
    	   else { 
    		   System.out.println("Normal Year :: "+year);
    	   }
       }
	}


