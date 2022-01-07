package org.sample;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Junit extends BaseClass {

	@BeforeClass
	public static void beforeClass() {
		getDriver();
		//maximize();
	
	}

	@Test
	public void test1() throws IOException {
		getUrl("http://adactinhotelapp.com/");
		WebElement txtUsername = findElementById("username");
		String data = GetValueInExcel("Sheet1", 1, 0);
		type(txtUsername, data);
		WebElement txtPassword = findElementById("password");
		String getValueInExcel = GetValueInExcel("Sheet1", 1, 1);
		type(txtPassword, getValueInExcel);
		WebElement btnLogin = findElementById("login");
		Click(btnLogin);
		WebElement txtSearchHotel = findElementByXpath("//td[text()='Search Hotel ']");
		String gettext = gettext(txtSearchHotel);
		Assert.assertEquals("verify", "Search Hotel (Fields marked with Red asterix (*) are mandatory)", gettext);
		System.out.println(gettext);
		WebElement findElementById = findElementById("location");
		String dDnLocation = GetValueInExcel("Sheet1", 1, 2);
		type(findElementById, dDnLocation);

		WebElement dDnHotels = findElementById("hotels");
		String getValueInExcel2 = GetValueInExcel("Sheet1", 1, 3);
		type(dDnHotels, getValueInExcel2);

		WebElement dDnRoomType = findElementById("room_type");
		String getValueInExcel3 = GetValueInExcel("Sheet1", 1, 4);
		type(dDnRoomType, getValueInExcel3);

		WebElement dDnNoOfRooms = findElementById("room_nos");
		String getValueInExcel4 = GetValueInExcel("Sheet1", 1, 5);
		type(dDnNoOfRooms, getValueInExcel4);

		WebElement txtCheckInDate = findElementById("datepick_in");
		String getValueInExcel5 = GetValueInExcel("Sheet1", 1, 6);
		type(txtCheckInDate, getValueInExcel5);

		WebElement txtCheckOutDate = findElementById("datepick_out");
		String getValueInExcel6 = GetValueInExcel("Sheet1", 1, 7);
		type(txtCheckOutDate, getValueInExcel6);

		WebElement dDnAdult = findElementById("adult_room");
		String getValueInExcel7 = GetValueInExcel("Sheet1", 1, 8);
		type(dDnAdult, getValueInExcel7);

		WebElement dDnChild = findElementById("child_room");
		String getValueInExcel8 = GetValueInExcel("Sheet1", 1, 9);
		type(dDnChild, getValueInExcel8);

		WebElement btnSearch = findElementById("Submit");
		Click(btnSearch);

		WebElement txtSearch = findElementByXpath("//td[text()='Select Hotel ']");
		String text = txtSearch.getText();
		Assert.assertEquals("Verify", "Select Hotel", text);
		System.out.println(text);

		WebElement btnRadio = findElementById("radiobutton_0");
		Click(btnRadio);

		WebElement clkSearch = findElementById("continue");
		Click(clkSearch);

		WebElement txtBookAHotel = findElementByXpath("//td[text()='Book A Hotel ']");
		String text2 = txtBookAHotel.getText();
		Assert.assertEquals("Verify", "Book A Hotel", text2);
		System.out.println(text2);

		WebElement txtFirstName = findElementById("first_name");
        String getValueInExcel9 = GetValueInExcel("Sheet1", 1, 10);
        type(txtFirstName, getValueInExcel9);
        
        WebElement txtLastName = findElementById("last_name");
		String getValueInExcel10 = GetValueInExcel("Sheet1", 1, 11);
		type(txtLastName, getValueInExcel10);
		
		WebElement txtAddress = findElementById("address");
		String getValueInExcel11 = GetValueInExcel("Sheet1", 1, 12);
		type(txtAddress, getValueInExcel11);
		
		WebElement txtCreditCardNumber = findElementById("cc_num");
		String getValueInExcel12 = GetValueInExcel("Sheet1", 1, 13);
		type(txtCreditCardNumber, getValueInExcel12);
		
		WebElement dDnCreditCardType = findElementById("cc_type");
		String getValueInExcel13 = GetValueInExcel("Sheet1", 1, 14);
		selectByVisibleText(dDnCreditCardType, getValueInExcel13);
		
		
		WebElement dDnExpiryMonth = findElementById("cc_exp_month");
		String getValueInExcel14 = GetValueInExcel("Sheet1", 1, 15);
		selectByVisibleText(dDnExpiryMonth, getValueInExcel14);
		
		WebElement dDnExpireYear = findElementById("cc_exp_year");
		String getValueInExcel15 = GetValueInExcel("Sheet1", 1, 16);
		selectByVisibleText(dDnExpireYear, getValueInExcel15);
		
		WebElement txtCvv = findElementById("cc_cvv");
		String getValueInExcel16 = GetValueInExcel("Sheet1", 1, 17);
		type(txtCvv, getValueInExcel16);
		
		WebElement clkBookNow = findElementById("book_now");
		Click(clkBookNow);
		
		implicitWait(30);
		
		WebElement txtBookingConformation = findElementByXpath("//td[text()='Booking Confirmation ']");
		String text3 = txtBookingConformation.getText();
		//Assert.assertEquals("Verify", "Booking Confirmation", txtBookingConformation);
		//System.out.println(text3);
		
		WebElement txtOrderNumber = findElementById("order_no");
		String orderNum = txtOrderNumber.getAttribute("Value");
		insertValueInExcel("D:\\JayaPrasath\\Hotel Booking.xlsx", "Sheet1", 1, 18, orderNum);
		
		implicitWait(10);
		
		WebElement clkBookedItinerary = findElementByXpath("//a[text()='Booked Itinerary']");
		Click(clkBookedItinerary);
		
		WebElement txtSearchOrder = findElementById("order_id_text");
		String getValueInExcel17 = GetValueInExcel("Sheet1", 1, 18);
		type(txtSearchOrder, getValueInExcel17);
		
		WebElement clkGo = findElementById("search_hotel_id");
		Click(clkGo);
		
		WebElement btnRadioCancel = findElementByXpath("(//input[@type='checkbox'])[1]");
		Click(btnRadioCancel);
		
		WebElement ClkCancel = findElementByXpath("(//input[@type='button'])[1]");
		Click(ClkCancel);
		
		Acceptalert();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
