package com.nt.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;      
 

public class LinkedHashMapTest {
//not allowed duplicate keys
	//follows insertion order
	public static void main(String[] args) {
		LinkedHashMap<String,Object> map=new LinkedHashMap<>();
		map.put("sno  ",1);
		map.put("sname","Sankar");
		map.put("saddr","appanaramunilanka");
		Set s=map.keySet();
		Iterator<Object> it=s.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			String str=(String)obj;
			System.out.println(str+"   :"+map.get(str));
		}
	}

}
