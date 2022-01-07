package com.pom;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class BookingConfirmation extends BaseClass {
	public BookingConfirmation() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
@FindBy(id="order_no")
private WebElement orderNumber;

public WebElement getOrderNumber() {
	return orderNumber;
}

public void orderNumber() throws IOException {
String bookID = getAttributeValue(getOrderNumber());
insertValueInExcel("D:\\JayaPrasath\\Hotel Booking.Xlsx", "Sheet1", 1, 20, bookID);




}


}
