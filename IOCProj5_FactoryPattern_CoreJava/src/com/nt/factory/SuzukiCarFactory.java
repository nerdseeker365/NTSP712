package com.nt.factory;

import com.nt.car.BalenoCar;
import com.nt.car.CiazCar;
import com.nt.car.SuzukiCar;
import com.nt.car.SwiftCar;
import com.nt.tyre.CEAT;
import com.nt.tyre.CarTyre;
import com.nt.tyre.MRF;
import com.nt.tyre.Michelin;

public class SuzukiCarFactory {
	
	public static SuzukiCar getInstance(String cartype,String cartyre) {
		CarTyre tyre=null;
		SuzukiCar type=null;

		if(cartyre.equalsIgnoreCase("MRF")) 
			tyre=new MRF();
			else if(cartyre.equalsIgnoreCase("CEAT"))
			tyre=new CEAT();
			else if(cartyre.equalsIgnoreCase("Michelin"))
				tyre=new Michelin();
			else 
				throw new IllegalArgumentException("Invalid tyre");
		
		if(cartype.equalsIgnoreCase("SwiftCar")) 
			type=new SwiftCar(tyre);
			else if(cartype.equalsIgnoreCase("BalenoCar"))
			type=new BalenoCar(tyre);
			else if(cartype.equalsIgnoreCase("CiazCar"))
				type=new CiazCar(tyre);
			else 
				throw new IllegalArgumentException("Invalid Selection");
		return type;
	}

}
