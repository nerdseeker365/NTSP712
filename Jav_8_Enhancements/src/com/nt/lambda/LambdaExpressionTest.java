package com.nt.lambda;

public class LambdaExpressionTest {

	public static void main(String[] args) {
		
		
		//Function interface only  one interface method can be allowed
		//rather than Anonymous inner class  multiple methods can be allowed.
		LambdaInterface li=()->{
			System.out.println("--");
		};
		li.test();	
		

	}

}
