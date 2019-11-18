package com.nt.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iterator_With_Instanceof_OperatorTest {

	public static void main(String[] args) {
		LinkedHashSet<Object> set=new LinkedHashSet<>();
		//Retrieving and printing String Objects as UpperCase
		set.add("apple");
		set.add("mango");
		set.add("banana");
		Iterator<Object> it=set.iterator();
		while(it.hasNext()) {
			Object s=it.next();
			if(s instanceof String) {
				String s1=((String) s).toUpperCase();
				System.out.println("Modified String :: "+s1);
			}
			else {
				System.out.println("Object"+s);
			}
			
		}
		
	}

}
