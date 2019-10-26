package com.nt.car;

import com.nt.tyre.CarTyre;

public class BalenoCar implements SuzukiCar {
     private CarTyre tyre=null;
      public BalenoCar(CarTyre tyre) {
		System.out.println("BalenoCar-1 param Constructor)");
      this.tyre=tyre;
      }
	
	@Override
	public String specifications() {
		
		return "EngineCC::1300->FuelType::Diel->Model::Hatchback ";
	}

	@Override
	public String drive() {
		
		return "driving 5+1 gare system BalenoCar with Tyres\t"+tyre.dimensions();
	}

}
