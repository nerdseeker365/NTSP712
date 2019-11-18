package com.nt.test;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Object> list = new Vector<>();
		for (int i = 1; i <=10; i++) {
			list.addElement(i * 10);
		}
		System.out.println("Initial Elements::" + list);
		list.removeElementAt(0);
		list.removeElementAt(8);
		System.out.println("\n Elements Ofter Removing:: "+list);
	}

}
