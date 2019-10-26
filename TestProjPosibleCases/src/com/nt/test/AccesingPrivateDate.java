package com.nt.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AccesingPrivateDate {

	public static void main(String[] args) throws Exception, SecurityException  {
		//Load Class dynamically at runtime
		Class c=Class.forName("com.nt.basics.PrivateMenmbers");
		//Accessing private Constructors zro and one param using reflection API
		Constructor cons[]=c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		cons[1].setAccessible(true);
		Object obj=cons[0].newInstance();
		Object obj1=cons[1].newInstance("name");
		//Accessing Private Fields Using Reflection API
		Field f[]=c.getDeclaredFields();
		f[0].setAccessible(true);
		Object obj2=f[0].getModifiers();
		System.out.println(obj2);
		//Accessing Private Methods Using Reflection API
		Method m=c.getDeclaredMethod("satify",null);
		m.setAccessible(true);
		Object obj3=m.getName();
		System.out.println(obj3);

	}

}
