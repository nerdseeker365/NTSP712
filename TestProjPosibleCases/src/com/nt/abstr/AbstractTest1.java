package com.nt.abstr;

public abstract class AbstractTest1 {
	//reference variables
	int a;//in abstract class create reference variables 
	//Constructor
	public AbstractTest1() {
		// TODO Auto-generated constructor stub
		//call this constructor in sub class 
	}
//An Abstract class can contain main method it can be executed..
	public static void main(String[] args) {
		System.out.println("AbstractTest1.main()");

	}
//Every class in java,either predefined or user defined , either abstract or concrete will be sub class of Object class either directly or indirectly.
}
//Every class in java,either abstract class or concrete class will contain a constructor whether we specify or not.
//The constrcutor of the abstract class cannot be  executed directly,it can be executed indirectly by creating an object of its child class 