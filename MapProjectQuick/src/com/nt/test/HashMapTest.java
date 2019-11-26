package com.nt.test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
//A map Can't be Traversed ,so you need to 
	//Convert it into Set using keySet()  or entrySet() method
	public static void main(String[] args) {
			HashMap<Object,Object> map=new HashMap<>();
			//Adding Elements in map
			map.put("Hero    ","All Arjun");
			map.put("Heroine ","Pooja Hegde");
			map.put("Actor   ","Sunil");
			Set<Object> s=map.keySet();//Only Display Keys
			//System.out.println(s);
			Iterator<Object> it=s.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("-----------------------------------------------");
			Set<Map.Entry<Object,Object>> set=map.entrySet();//Display both Keys and Values
			//System.out.println(set);
			Iterator<Map.Entry<Object, Object>> it1=set.iterator();
			while(it1.hasNext()) {
				Map.Entry<Object,Object> entry=it1.next();
				System.out.println(entry.getKey()+"  =  "+entry.getValue());
			}
			System.out.println("-----------------------------------------------------");
			//Collection<Object> c=map.values();//Only Display Values
			//System.out.println(c);
			while(it1.hasNext()) {
				Map.Entry<Object,Object> entry=it1.next();
				System.out.println(entry.getValue());
			}
	}

}
