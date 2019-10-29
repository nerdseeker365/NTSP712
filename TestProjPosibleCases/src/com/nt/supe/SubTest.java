package com.nt.supe;

public class SubTest extends SuperTest {
	int b;

	public SubTest() {
			
		super();
		System.out.println(a);
	}

	public void safity() {
		System.out.println(super.a);// parent class variable
		System.out.println(b);// sub class variable
		add();// parent class method
	}

	public static void main(String[] args) {
		SubTest st=new SubTest();
//note points::
		//child class constructor calls super class constructor in first statement(line) of child class constructor
		//Constructor can call  another constructor only.
		//super are designed for calling constructors from other Constructors.
	}

}
