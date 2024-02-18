package com.gentech.workingWithExcle;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWithPoi {
	static void readContent() {
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try {
			fin = new FileInputStream("C:\\Users\\preet\\OneDrive\\Documents\\SG_Development_Course\\GitDevRepository\\CurrentWorkspace\\FullStackDevelopmentRepo\\SamplePracticeProgram\\Documents\\Test.xlsx");
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet("Sheet1");
			int rc = sh.getPhysicalNumberOfRows();
			for(int r=0; r<rc; r++) {
				row=sh.getRow(r);
				int col = row.getPhysicalNumberOfCells();
				for(int c=0; c<col; c++) {
					cell = row.getCell(c);
					System.out.printf("%-12s",cell.getStringCellValue()+" ");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fin.close();
				wb.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readContent();
	}

}
