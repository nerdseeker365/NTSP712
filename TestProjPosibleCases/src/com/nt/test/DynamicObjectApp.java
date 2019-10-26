package com.nt.test;

public class DynamicObjectApp {

	public static void main(String[] args) throws Exception {
		Class c1=null,c2=null;
		Object obj1=null,obj2=null;
		
			//Load Test,Date classes dynamically at runtime
			c1=Class.forName("com.nt.basics.Test");
			c2=Class.forName("java.util.Date");
			//create Objects dynamically using newInstance() method
			obj1=c1.newInstance();
			obj2=c2.newInstance();
			//invoke method
			System.out.println("Test--->"+obj1.toString());
			System.out.println("Date--->"+obj2.toString());
		

	}//main
}//class
