package com.nt.test;
import java.io.FileWriter;
public class FileWriterTest {

	public static void main(String[] args) throws Exception{
		FileWriter f=new FileWriter("e://Angel.txt");
		f.write("Sankar");
		System.out.println("Successfuly executed ");
		f.close();

	}

}
