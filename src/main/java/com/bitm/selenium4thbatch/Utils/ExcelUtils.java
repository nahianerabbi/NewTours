package com.bitm.selenium4thbatch.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.selenium4thbatch.DTO.BookFlightDto;
import com.bitm.selenium4thbatch.DTO.FlightFinderDto;
import com.bitm.selenium4thbatch.DTO.LoginDto;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;

	private  static Sheet getSheet(int sheetNo) throws IOException{
		// change the file location as per your computer
		File f = new File("src/main/java");
		File fs = new File(f,"abc.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(sheetNo);
        return sheet;
	}
	
	
	/*	inputStream = new FileInputStream(new File("E:\\newtours.xlsx"));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = (Sheet) workbook.getSheetAt(sheetNo);*/
	//LOGIN DTO
	public static List<LoginDto> getLoginData() throws IOException{
		List<LoginDto> logins=new ArrayList<LoginDto>();
		
		//login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            LoginDto logindata=new LoginDto();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					logindata.setUsername(cell.getStringCellValue());
					cellCounter++;
					break;
				case 1:
					logindata.setPassword(cell.getStringCellValue());
					break;
				default:
					break;
				}               
                 
            }
            logins.add(logindata);
        }
        close();
		return logins;
}
	
	
	
	public static List<FlightFinderDto> getFlightFinderData() throws IOException{
		List<FlightFinderDto> flightfinders=new ArrayList<FlightFinderDto>();
		
		//flight finder is the second sheet in excel so getSheet parameter set to 1
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            FlightFinderDto flightfinderdata=new FlightFinderDto();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					flightfinderdata.setPassengers(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					flightfinderdata.setDepartingFrom(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					flightfinderdata.setDepartingMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					flightfinderdata.setDepartingDate(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					flightfinderdata.setArrivingIn(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					flightfinderdata.setReturningMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					flightfinderdata.setReturningDate(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					flightfinderdata.setAirline(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}               
                 
            }
            flightfinders.add(flightfinderdata);
        }
        close();
		return flightfinders;
	}		

	
	public static List<BookFlightDto> getBookFlightData() throws IOException{
		List<BookFlightDto> bookflights=new ArrayList<BookFlightDto>();
		
		//book flight is the third sheet in excel so getSheet parameter set to 2
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> iterator = ExcelUtils.getSheet(2).iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
            BookFlightDto bookflightdata=new BookFlightDto();
            byte cellCounter=0;
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cellCounter) {
				case 0:
					bookflightdata.setFirstName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					bookflightdata.setLastName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					bookflightdata.setMeal(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					bookflightdata.setCardType(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					bookflightdata.setCardNumber(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					bookflightdata.setCardExpirationMonth(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					bookflightdata.setCardExpirationDate(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					bookflightdata.setCardFirstName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 8:
					bookflightdata.setCardMiddleName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 9:
					bookflightdata.setCardLastName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 10:
					bookflightdata.setBillingAddressLine1(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 11:
					bookflightdata.setBillingAddressLine2(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 12:
					bookflightdata.setBillingCity(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 13:
					bookflightdata.setBillingState(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 14:
					bookflightdata.setBillingPostalCode(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 15:
					bookflightdata.setBillingCountry(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 16:
					bookflightdata.setDeliveryAddressLine1(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 17:
					bookflightdata.setDeliveryAddressline2(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 18:
					bookflightdata.setDeliveryCity(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 19:
					bookflightdata.setDeliveryState(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 20:
					bookflightdata.setDeliveryPostalCode(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 21:
					bookflightdata.setDeliveryCountry(formatter.formatCellValue(cell));
					cellCounter++;
					break;
					
				default:
					break;
				}               
                 
            }
            bookflights.add(bookflightdata);
        }
        close();
		return bookflights;
	}	

	private static void close() throws IOException {
		// TODO Auto-generated method stub
		
		workbook.close();
		inputStream.close();
		
	}
	
	

}