package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.EnggCourse;

public class CollectionMergingTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EnggCourse course=null;
	   //create IOC container
		factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml"));
		//get Bean class obj
		course=factory.getBean("ece1stYear",EnggCourse.class);
		System.out.println(course);

	}

}
