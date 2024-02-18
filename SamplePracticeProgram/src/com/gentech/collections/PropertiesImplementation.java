package com.gentech.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesImplementation {
	static String filePath = "../../../../ProgrammedDirectory";
	static void writeContent() {
		FileOutputStream fout = null;
		Properties prop=null;
		try {
			fout = new FileOutputStream(filePath+File.separator+"login.properties");
			prop = new Properties();
			prop.setProperty("usn", "demouser");
			prop.setProperty("pwd", "123pwd");
			prop.setProperty("pin", "1234");
			prop.store(fout, "Its for testing purpose");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				prop.clear();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void readContent() {
		Properties prop=null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(filePath+File.separator+"login.properties");
			prop = new Properties();
			prop.load(fin);
			System.out.println(prop.getProperty("usn"));
			System.out.println(prop.getProperty("pwd"));
			System.out.println(prop.getProperty("pin"));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				prop.clear();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeContent();
		readContent();

	}

}
