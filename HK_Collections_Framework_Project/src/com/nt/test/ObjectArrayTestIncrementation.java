package com.nt.test;

public class ObjectArrayTestIncrementation {
	public static void main(String args[]) {
		// Creating Object Array
		Object obj[] = new Object[5];

		// Adding Elements
		obj[0] = 1;
		obj[1] = 2;
		obj[2] = 3;
		obj[3] = 4;
		obj[4] = 5;

		// Creating Dummy another array
		Object tempobj[] = new Object[10];

		// Storing Object Array into int Variable
		int n = obj.length;

		// Copy first Object Array Value into Second Object Array
		int i = 0;
		for (; i < n; i++) {
			tempobj[i] = obj[i];
		}
		// Adding Elements to Second Object array
		tempobj[i] = 6;
		tempobj[i] = 7;
		tempobj[i] = 8;
		tempobj[i] = 9;
		tempobj[i] = 10;

		// Copy First Object Array Value To second Object Array
		obj = tempobj;

		// Iterating for loop ......Display Elements of Object Array

		for (i = 0; i < obj.length; i++) {
			System.out.println("elements values:: " + obj[i]);

		}

	}
}
