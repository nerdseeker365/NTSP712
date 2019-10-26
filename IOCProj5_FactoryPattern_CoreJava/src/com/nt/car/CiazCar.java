package com.nt.car;

import com.nt.tyre.CarTyre;

public class CiazCar implements SuzukiCar {

	private CarTyre tyre=null;
    public CiazCar(CarTyre tyre) {
		System.out.println("CiazCar-1 param Constructor)");
    this.tyre=tyre;
    }
	
	@Override
	public String specifications() {
		
		return "EngineCC::1400->FuelType::Diel->Model::Hatchback";
	}

	@Override
	public String drive() {
		
		return "driving 5+1 gare system CiazCar with Tyres\t"+tyre.dimensions();
	}

}
