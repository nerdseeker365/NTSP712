package com.nt.test;
//Write a program to swap two variables without using third.
public class SwapTest {
										   // 8  4  2  1
	public static void main(String[] args) {//1  1  1  1
		int n=1;//001
		int n1=2;//010
		//^-->Caret Symbol
		//XOR 11-->0
		//    01-->1
		//    10-->1
		//    00-->0
		n=n^n1;//001 XOR 010 ==011-->3
		n1=n^n1;// 011 XOR 010 ==001-->1
		n=n^n1;//011 XOR 001==010-->2
		System.out.println("n-->"+n+" n1-->"+n1);
	}

}
