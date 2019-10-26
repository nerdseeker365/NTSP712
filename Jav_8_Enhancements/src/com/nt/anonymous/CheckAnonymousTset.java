package com.nt.anonymous;

public class CheckAnonymousTset {

	public static void main(String[] args) {
		//Anonymous Inner class
		AnonymousCheck ac=new AnonymousCheck() {
			@Override
			public String verify() {
				return "Verified....";
			}

			@Override
			
			public String satify() {
				
				return "sure.....";
			}
		};
		System.out.println(ac.verify());
		System.out.println(ac.satify());
	}

}
