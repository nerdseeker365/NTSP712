package com.nt.test;

import java.io.File;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args)throws Exception {
		File f=new File("E://Angel.txt");
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			String data=s.nextLine();
			System.out.println(data);
		}
			s.close();
	}

}
