package com.nt.test;

import java.util.Stack;

public class SackTest {

	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		s.push("5");
		s.push("4");
		s.push(3);
		s.push("2");
		s.push("top :: "+"1");
		System.out.println(s.search(new Integer(3)));
		System.out.println(s.peek());//means top most value
		System.out.println(s.empty());
	}

}
