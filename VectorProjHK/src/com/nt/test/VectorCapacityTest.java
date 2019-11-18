package com.nt.test;

import java.util.Vector;

public class VectorCapacityTest {

	public static void main(String[] args) {
		Vector<Object> v=new Vector<>();
		v.addElement("Sankar");
		v.addElement("sita");
		v.addElement("geetha");
		v.addElement("rama");
		v.addElement("uma");
		v.addElement("ravi");
		v.addElement("ram");
		v.addElement("sai");
		v.addElement("yeswanth");
		v.addElement("bhavana");
		v.addElement("venkatesh");
		System.out.println("----------------default  values----------------");
		System.out.println("Total capacity:: "+v.capacity());//after filling 10 elements increase capacity double(100%) 
		System.out.println("existing elements:: "+v.size());
		System.out.println("-----------------Custom Capacity------------------");
		Vector<Object> v1=new Vector<>(50);
		v1.addElement("Pawan Kalyan");
		v1.add("Chiranjeevi");
		v1.addElement("All Arjun");
		v1.add("Ram Charan");
		System.out.println("Capacity:: "+v1.capacity());
		System.out.println("existing elements:: "+v1.size());
		
	}

}
