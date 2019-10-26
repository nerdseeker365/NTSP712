package com.nt.test;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;
 
@SuppressWarnings("deprecation")
public class SetterInjectionTest {
	
	public static void main(String args[]) {
		//Location of the Spring Bean Configuration file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//activate BeanFactory container
		
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//Get Bean class Object
		WishMessageGenerator bean=factory.getBean("wmg",WishMessageGenerator.class);
		//call business method
		String result=bean.GenerateWishMessage();
		System.out.println(result);
	}//main

}//class
