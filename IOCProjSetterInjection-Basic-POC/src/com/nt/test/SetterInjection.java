package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjection {
	public static void main(String[] args) {
		//collect file path
		Resource res=null;
		BeanFactory factory=null;
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//String IOC Container
		factory=new XmlBeanFactory(res);
		//Get Bean
		Object obj=factory.getBean("wmg");
		System.out.println("SetterInjection.main()");
		WishMessageGenerator result=(WishMessageGenerator)obj;
		System.out.println(result.generateMessage("Sankar"));
	}

}
