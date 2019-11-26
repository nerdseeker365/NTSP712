package com.nt.test;

import java.io.File;

public class FileTest {

	public static void main(String[] args)throws Exception {
		File f=new File("E:\\Angel.txt");
		if(f.createNewFile()) {
		System.out.println("Created...");	
		}
		else {
			System.out.println("File Alredy Exist...");
		}
		
	}

}
