package com.nt.test;

public class MultiDimenssionalArray {

	public static void main(String[] args) {
			int n[][]=new int[2][2];
			n[0][0]=1;
			n[0][1]=2;
			n[1][0]=3;
			n[1][1]=4;
			for(int i=1;i<=n.length-1;i++) {
				for(int j=1;j<n.length;j++) {
					System.out.println(n[i][j]);
				}
			}
	}

}
