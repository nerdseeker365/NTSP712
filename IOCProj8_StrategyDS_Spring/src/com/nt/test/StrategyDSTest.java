package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.comp.Vehicle;

public class StrategyDSTest {
	public static void main(String[] args) {
	BeanFactory factory=null;	
	Vehicle vehicle=null;
	//create IOC container
	factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	//get bean vehicle class obj
	vehicle=factory.getBean("v",Vehicle.class);
	//invoke method
	vehicle.journey("hyd","goa");
	}

}
