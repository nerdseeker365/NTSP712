 package com.nt.supe;

public class Sub extends Test {
//Inheritance relation is-a
	//create child class obj access parent and child class members
	//first prefer to child class it is not available next search in parent class
	public void te(){
		System.out.println("Sub.te()");
	}

	public static void main(String[] args) {
		Sub s=new Sub();
		s.t(7);//first search child class and next search super class 

	}

}
