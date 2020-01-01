package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorInjectTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student st=null,st1=null;
		Marks mk=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean obj
		st=factory.getBean("st",Student.class);
		System.out.println(st);
		System.out.println(".........................");
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println("..................");
		st1=factory.getBean("st1",Student.class);
		System.out.println(st1);
	}
}
