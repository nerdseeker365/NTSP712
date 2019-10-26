package com.nt.basics;

public class Test3 {
	  public int x,y;
	public Test3() {
		System.out.println("Test:: 0-param constructor");
	}
	
	public Test3(int x,int y) {
		System.out.println("Test:: 2-param constructor");
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

		
	

}
