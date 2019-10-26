package com.nt.car;

import com.nt.tyre.CarTyre;

public class SwiftCar implements SuzukiCar {

	private CarTyre tyre=null;
    public SwiftCar(CarTyre tyre) {
		System.out.println("SwiftCar-1 param Constructor)");
    this.tyre=tyre;
    }
	
	@Override
	public String specifications() {
		
		return "EngineCC::1200->FuelType::Diel->Model::Hatchback";
	}

	@Override
	public String drive() {
		
		return "driving 5+1 gare system SwiftCar with Tyres\t"+tyre.dimensions();
	}

}
