package com.nt.tyre;

public class CEAT implements CarTyre {

	public CEAT() {
		System.out.println("CEAT 0-param Constructor");
	}

	@Override
	public String dimensions() {

		return "Width::34-Height::14-grip::12";
	}

}
