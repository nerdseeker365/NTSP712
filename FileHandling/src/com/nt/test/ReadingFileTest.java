package com.nt.test;

import java.io.File;
import java.util.Scanner;

public class ReadingFileTest {

	public static void main(String[] args) {
		try {
		File f=new File("E://Angel.txt");
		Scanner s=new Scanner(f);
		while(s.hasNextLine()) {
			String d=s.nextLine();
			System.out.println(d);
		}
		s.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
