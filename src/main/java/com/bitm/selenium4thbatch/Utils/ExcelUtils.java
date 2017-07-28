package com.bitm.selenium4thbatch.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;

	private static Sheet getSheet(int sheetNo) throws IOException{
		inputStream = new FileInputStream(new File("E:\\newtours.xlsx"));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = (Sheet) workbook.getSheetAt(sheetNo);
		return sheet;
	}

}