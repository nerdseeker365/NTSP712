package com.nt.test;

import java.util.ArrayList;
import java.util.ListIterator;

public class Using_Instaceof_In_Collections_Framework {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add("Hari krishna");
		list.add("sudhakar l");
		list.add("naveen sangam");
		list.add("Nataraj");
		System.out.println("All elements before iteratting:: " + list);
		int count = 1;
		ListIterator<Object> lt = list.listIterator();
		while (lt.hasNext()) {
			Object o = lt.next();
			System.out.println("Current Element:" + o);
			if (o instanceof String) {
				String s = ((String) o);
				lt.set(s.toUpperCase());

			} else if (o instanceof Integer) {
				if (count == 1) {
					lt.add("ravi");
					count++;
				}
			} // else if

		} // while
		System.out.println("All Elements after iterating:: " + list);
		// Retrieving Elements in reverse order
		while (lt.hasPrevious()) {
			Object o1 = lt.previous();
			System.out.println(o1);
		}
	}

}
