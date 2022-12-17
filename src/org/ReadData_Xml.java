package org;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class ReadData_Xml {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file= new FileInputStream("D:\\Sankar_selenium\\ReadExcel.xls");
		
		Workbook wb=  Workbook.getWorkbook(file);
		
		Sheet s1 = wb.getSheet("Sheet1");
		
System.out.println(s1.getName());
		
	String	EmpID    =s1.getCell(0,1 ).getContents();
	String	EmpName  =s1.getCell(1,1 ).getContents();
	String	Empemail =s1.getCell(2,2 ).getContents();
	String	EmpSal   =s1.getCell(3,3 ).getContents();
		
		System.out.println(EmpID);
		System.out.println(EmpName);
		System.out.println(Empemail);
		System.out.println(EmpSal);
		
	}

}
