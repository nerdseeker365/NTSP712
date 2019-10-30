package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDSTest {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		//get Vehicle class Object
		try {
			vehicle=VehicleFactory.getInstance();
		} catch (Exception e) {
			System.out.println("Internal Problem");
			e.printStackTrace();
		}
		//Invoke the Method
		vehicle.journey("hyd","goa");

	}

}
