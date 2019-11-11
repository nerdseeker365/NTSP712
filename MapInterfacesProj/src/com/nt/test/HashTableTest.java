package com.nt.test;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {
//keys are unique
	//Synchronized
	//At a time allow one thread
	//not follow insertion order
	public static void main(String[] args) {
		Hashtable<String,Object> map=new Hashtable<>();
		map.put("sno",1);
		map.put("sname","Sankar");
		map.put("saddr","appanaramunilanka");
		Set s=map.keySet();
		Iterator<Object> it=s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String str=(String)obj;
			System.out.println(str+"   :  "+map.get(str));
		}
		
	}

}
