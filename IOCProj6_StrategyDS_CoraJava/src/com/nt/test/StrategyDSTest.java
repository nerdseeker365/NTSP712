package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDSTest {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		//get Vehicle class Object
		vehicle=VehicleFactory.getInstance("Diesel");
		vehicle=VehicleFactory.getInstance("Petrol");
		vehicle=VehicleFactory.getInstance("Water");
		//Invoke the Method
		vehicle.journey("hyd","goa");

	}

}
