package com.easytrack.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	/**
	 * This is the generic method reading the data from property file	
	 * @param key
	 * @return
	 * @throws IOException
	 */
		
		
		public String getPropertyData(String key) throws IOException {
			FileInputStream fis=new FileInputStream("./data/commondata.property");
			Properties p=new Properties();
			p.load(fis);
			String data = p.getProperty(key);
			return data;
		}
		
	/**
	 * This is the generic method reading the data from excel file 	
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public String getCreateTaskExceldata(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./data/CustomerInfo.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			return data;
			
		}
		public String getCreateUserExceldata(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./data/UserInfo.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			return data;
		}
		
	/**
	 * This is the generic method to write data into the excel file	
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public String getExceldata(String sheetName, int row, int cell, String data) throws EncryptedDocumentException, IOException{
			FileInputStream fis= new FileInputStream("./data/apache.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(data);
			FileOutputStream fos=new FileOutputStream("./data/apache.xlsx");
			wb.write(fos);
			wb.close();
			return data;
			
		}

}
