package com.nt.tyre;

public class MRF implements CarTyre {
	public MRF() {
		System.out.println("MRF -0 param constructor");
	}

	@Override
	public String dimensions() {

		return "Width::32-Height::12-grip::10";
	}

}
