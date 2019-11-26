package com.nt.test;

public class StaticTest {
	public StaticTest(){
		System.out.println("constructor");
	}
	 {
			System.out.println("s");
		}
	static {
		System.out.println("static");
	}
	

	public static void main(String[] args) {
		System.out.println("main");
					StaticTest t=new StaticTest();
	}
	static {
		System.out.println("static1");
	}
	
}
