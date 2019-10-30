package com.nt.factory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.nt.comp.Engine;
import com.nt.comp.Vehicle;

public class VehicleFactory {

	private static Properties props = null;
	static {
		// Locate and read from Properties
		try {
			InputStream is = new FileInputStream("src/com/nt/commons/App.properties");
			// Store intojava.util.properties obj
			props = new Properties();
			props.load(is);
		} catch (IOException e) {
			System.out.println("internal error");
			e.printStackTrace();
		}
	}

	public static Vehicle getInstance() throws Exception {

		Engine engine = null;
		Vehicle vehicle = null;
		// Create Dependent class object
		engine =(Engine) Engine.class.forName(props.getProperty("dependent.class")).newInstance();
		// create Target class Object
		vehicle = (Vehicle) Vehicle.class.forName(props.getProperty("target.class")).newInstance();
		vehicle = new Vehicle();
		// Set dependent object to target class object
		vehicle.setEngine(engine);
		return vehicle;
	}

}
