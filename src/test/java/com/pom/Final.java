package com.pom;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sample.BaseClass;

public class Final extends BaseClass{
	String path="D:\\\\JayaPrasath\\\\Hotel Booking.xlsx";
	@BeforeClass
	public static  void BeforeClass() {
	getDriver();
	maximize();
	getUrl("http://adactinhotelapp.com/");
	}
	
	@Test
public void test() throws IOException, InterruptedException {
	Login login = new Login();
	login.login(GetValueInExcel("Sheet1", 1, 0), GetValueInExcel("Sheet1", 1, 1));

	
	searchHotel searchhotel = new searchHotel();
	searchhotel.searchhotel(GetValueInExcel("Sheet1", 1,2), GetValueInExcel("Sheet1", 1, 3), 
	GetValueInExcel("Sheet1", 1, 4), GetValueInExcel("Sheet1", 1, 5), GetValueInExcel("Sheet1", 1, 6),
	GetValueInExcel("Sheet1", 1, 7), GetValueInExcel("Sheet1", 1, 8), GetValueInExcel("Sheet1", 1, 9));
	
	SelectHotel selectHotel = new SelectHotel();
	selectHotel.selectHotel();
	
	BookAHotel bookAHotel = new BookAHotel();
	bookAHotel.bookHotel(GetValueInExcel("Sheet1", 1, 10), GetValueInExcel("Sheet1", 1, 11), GetValueInExcel("Sheet1", 1, 12), GetValueInExcel("Sheet1", 1, 13), GetValueInExcel("Sheet1", 1, 14), GetValueInExcel("Sheet1", 1, 15), GetValueInExcel("Sheet1", 1, 16), GetValueInExcel("Sheet1", 1, 17));
	
	BookingConfirmation Booking = new BookingConfirmation();
	Booking.orderNumber();
	
	}


}
