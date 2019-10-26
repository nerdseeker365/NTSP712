package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		//Spring IOC container , it is Spring configuration file holding ,check xml file as valid and well formed or not
		factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));//BeanFactor is Lazy loading
		//Get Bean
		generator=(WishMessageGenerator)factory.getBean("wmg");//wmg is bean id
		//gather Results
		System.out.println(generator.GenerateWishMessage("Sankar"));
	}//main method
}//class
