package com.gentech.collections;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesImplementation {
	static String filePath = "../../../../ProgrammedDirectory";
	static void writeContent() {
		Properties prop=null;
		try {
			
			prop = new Properties();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
	}
	
	static void readContent() {
		Properties prop=null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filePath+File.separator+"");
			prop = new Properties();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
