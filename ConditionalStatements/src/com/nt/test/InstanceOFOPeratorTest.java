package com.nt.test;

public class InstanceOFOPeratorTest {

	public static void main(String[] args) {
		InstanceOFOPeratorTest t=new InstanceOFOPeratorTest();
		if(t instanceof InstanceOFOPeratorTest) {
			System.out.println(t.getClass());
		}
	}

}
