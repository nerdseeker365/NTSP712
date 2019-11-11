package com.nt.bean;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProj {

	public static  
	void main(String[] args) {
		List<Student> list=new LinkedList<>();
		list.add(new Student(23));
		//or
		Student s=new Student(50);
		list.add(s);//here adding object
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
