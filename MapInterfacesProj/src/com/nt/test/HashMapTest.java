package com.nt.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
//not follow insertion order
	//keys are unique
	public static void main(String[] args) {
		HashMap<String,Object> map=new HashMap<>();
		map.put("sno  ",158);
		map.put("sname","Sankar");
		map.put("saddr","appanaramunilanka");
		Set s=map.keySet();
		Iterator<Object> it=s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String str=(String)obj;
			System.out.println(str+"     :    "+map.get(str));
		}
	}

}
