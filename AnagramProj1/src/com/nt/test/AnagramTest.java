package com.nt.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class AnagramTest {

	public static void main(String[] args) throws Exception {
		File file =new File("C:\\Users\\admin\\Desktop\\Dictionary.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String s;
		while((s=br.readLine()) !=null){
			System.out.println(s+" : " );
		}
		}
//-----------------------------------------------------------------------------//
}
