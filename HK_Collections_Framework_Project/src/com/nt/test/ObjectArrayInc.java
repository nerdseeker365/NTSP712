package com.nt.test;

public class ObjectArrayInc {

	public static void main(String[] args) {
		//creating object array
		Object obj[]=new Object[5];
		
		//adding elements 
		obj[0]=1;
		obj[1]=2;
		obj[2]=3;
		obj[3]=4;
		obj[4]=5;
		
		//Creating Dummy Object
		Object tempobj[]=new Object[10];
		
		//Storing Object in int variable
		int o=obj.length;
		
		//i variable using entire class
		int i=0;
		
		//Copy First Object into Second object
		for( ;i<o;i++) {
			tempobj[i]=obj[i];
		}
		//Adding second Array elements
		tempobj[i]=6;
		tempobj[i]=7;
		
		
		//Assign First Object Into Second object
		obj=tempobj;
		
		//iterating for loop...Display elements 
		for(Object ob:obj) {
			System.out.println(ob);
		}
	}

}
