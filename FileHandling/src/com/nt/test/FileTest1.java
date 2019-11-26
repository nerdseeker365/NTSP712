package com.nt.test;

import java.io.File;

public class FileTest1 {

	public static void main(String[] args)throws Exception {
		File f=new File("D:\\Angel.txt");
		f.createNewFile();
		if(f.exists()) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
	}

}
