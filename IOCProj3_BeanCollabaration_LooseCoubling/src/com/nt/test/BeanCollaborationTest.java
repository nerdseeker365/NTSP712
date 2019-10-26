package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Flipkart;

public class BeanCollaborationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null;
		//IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//Get target class object
		fpkt=factory.getBean("fkd",Flipkart.class);
		//invoke method
		System.out.println(fpkt.shopping(new String[] {"shirt,sweets,cake,crackers"},new float[]{1200,1000,100,1500}));
	}

}
