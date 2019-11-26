package com.nt.verf;

public class DemoApp {
static {
	System.out.println("sdemo");
}
	public static void main(String[] args)throws Exception {
		System.out.println("main");
		Test t=new Test();
		Test t2=new Test();
		Class.forName("com.nt.verf.Demo");
		Class.forName("com.nt.verf.Demo");
	}

}
