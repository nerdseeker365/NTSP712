package com.nt.supe;
//super keyword is used to accessing super class variables and methods..
public class SuperTest {
	public SuperTest() {
		System.out.println("SuperTest.SuperTest()");
	}
	int a;
	public String add() {
		return "super boss";
	}

}
//The super keyword can be specified either in child class constructor or child class instance methods.


//the super keyword cannot be specified in child class static methods.