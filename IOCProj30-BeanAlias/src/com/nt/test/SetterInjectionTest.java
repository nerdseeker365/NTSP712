package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		 Resource res=null;
		 BeanFactory factory=null;
		 Object obj=null;
		 WishMessageGenerator generator=null;
		//Locate and hold Spring bean cfg file
		 res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		 //create BeanFactory IOC container
		 factory=new XmlBeanFactory(res);
		 //get Target Bean class object
		 generator=factory.getBean("msg1",WishMessageGenerator.class);
		 //invoke b.method
		 System.out.println("result:::"+generator.generateMessage("raja")); 
	}//main
}//class
