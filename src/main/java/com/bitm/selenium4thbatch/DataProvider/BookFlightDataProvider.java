package com.bitm.selenium4thbatch.DataProvider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.selenium4thbatch.Utils.ExcelUtils;

public class BookFlightDataProvider {
	
	@DataProvider(name = "bookflightdataprovider")
	public static Object[][] getBookFlightData() {
		try {
			return new Object[][] { { ExcelUtils.getBookFlightData() }, };
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
