package com.nt.props;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class TestProps {
 
	public static void main(String[] args) throws Exception {
		Properties props=null;
		InputStream is=new FileInputStream("src/com/nt/commons/Output.properties");
			 props.load(is);
			 System.out.println(props);
	}

}
