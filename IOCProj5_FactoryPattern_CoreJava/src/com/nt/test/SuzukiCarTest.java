package com.nt.test;
import com.nt.car.SuzukiCar;
import com.nt.factory.SuzukiCarFactory;


public class SuzukiCarTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hey I am Started Execution......");
		Thread t=new Thread();
		t.sleep(6000);
		System.out.println("I am on the way");
		t.sleep(6000);
		System.out.println("Begining execution");
		System.out.println("-------------------");
		t.sleep(6000);
		SuzukiCar car=null;
		car=SuzukiCarFactory.getInstance("SwiftCar","MRF");
		System.out.println(car.specifications());
		System.out.println(car.drive());
		
		System.out.println("----------------------");
	
		car=SuzukiCarFactory.getInstance("BalenoCar","CEAT");
		System.out.println(car.specifications());
		System.out.println(car.drive());
		
		System.out.println("-----------------------");
		
		car=SuzukiCarFactory.getInstance("CiazCar","Michelin");
		System.out.println(car.specifications());
		System.out.println(car.drive());
	}

}
