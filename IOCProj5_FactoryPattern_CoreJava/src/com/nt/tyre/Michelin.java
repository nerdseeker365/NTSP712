package com.nt.tyre;

public class Michelin implements CarTyre {

	public Michelin() {
		System.out.println("Michelin 0-param Constructor");
	}

	@Override
	public String dimensions() {

		return "Width::33-Height::13-grip::11";
	}

}
