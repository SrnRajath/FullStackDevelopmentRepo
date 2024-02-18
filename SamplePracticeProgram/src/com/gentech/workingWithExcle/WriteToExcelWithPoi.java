package com.gentech.workingWithExcle;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelWithPoi {
	
	static void writeContent() {
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try {
			fout = new FileOutputStream("C:\\Users\\preet\\OneDrive\\Documents\\SG_Development_Course\\GitDevRepository\\CurrentWorkspace\\FullStackDevelopmentRepo\\SamplePracticeProgram\\Documents\\Demo.xlsx");
			wb = new XSSFWorkbook();
			//First row
			sh = wb.createSheet("login Details");
			row = sh.createRow(0);
			cell = row.createCell(0);
			cell.setCellValue("UserName");
			cell = row.createCell(1);
			cell.setCellValue("Password");
			//second row
			row = sh.createRow(1);
			cell = row.createCell(0);
			cell.setCellValue("admin");
			cell=row.createCell(1);
			cell.setCellValue("Welcome123");
			wb.write(fout);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {	
				fout.close();
				wb.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeContent();

	}

}
