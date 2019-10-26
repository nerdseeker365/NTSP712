package com.nt.factory;

import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Vehicle;
import com.nt.comp.WaterEngine;

public class VehicleFactory {
	public static Vehicle getInstance(String engineType) {
		Engine engine=null;
		Vehicle vehicle = null;
		//Create Dependent class object
		if(engineType.equalsIgnoreCase("Diesel"))
			engine=new DieselEngine();
		else if(engineType.equalsIgnoreCase("Petrol"))
			engine=new PetrolEngine();
		else if(engineType.equalsIgnoreCase("Water"))
			engine=new WaterEngine();
		else
			throw new IllegalArgumentException("Invalid Engine Type");
		
		//create Target class Object
		vehicle=new Vehicle();
		vehicle.setEngine(engine);
		return vehicle;
	}

}
