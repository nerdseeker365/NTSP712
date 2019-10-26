package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class ConstructorTest {
	public static void main(String args[]) {
		//location of Spring Bean Configuration file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		
		//Activate BeanFactoryContainer
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get Bean class object
		WishMessageGenerator bean=factory.getBean("wmg",WishMessageGenerator.class);
		String result=bean.GeneraetWishMessage();
		//call business logic
		System.out.println(result);
	}//main method

}//class
