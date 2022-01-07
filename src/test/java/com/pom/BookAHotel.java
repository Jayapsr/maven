package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class BookAHotel  extends BaseClass{
	public BookAHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="first_name")
	WebElement txtFirstName;
	
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNumber() {
		return txtCreditCardNumber;
	}

	public WebElement getdDnCreditCardType() {
		return dDnCreditCardType;
	}

	public WebElement getdDnExpireMonth() {
		return dDnExpireMonth;
	}

	public WebElement getdDnExpireYear() {
		return dDnExpireYear;
	}

	public WebElement getTxtCvv() {
		return txtCvv;
	}

	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtAddress;
	
	@FindBy(id="cc_num")
	private  WebElement txtCreditCardNumber;
	
	@FindBy(id="cc_type")
	private  WebElement dDnCreditCardType;
	
	@FindBy(id="cc_exp_month")
	private  WebElement dDnExpireMonth;
	
	@FindBy(id="cc_exp_year")
	private  WebElement dDnExpireYear;
	
	@FindBy(id="cc_cvv")
	private	WebElement txtCvv;

	@FindBy(id="book_now")
	private WebElement clkBookNow;
	
	
	public WebElement getClkBookNow() {
		return clkBookNow;
	}

	public void bookHotel(String firstname, String lastName, String billingAddress, 
			String creditCardNumber, String creditCardType, String expiryMonth, String expiryYear, String CvvNumber) throws InterruptedException {
	
		type(getTxtFirstName(), firstname);
        type(getTxtLastName(), lastName);
        type(getTxtAddress(), billingAddress);
        type(getTxtCreditCardNumber(), creditCardNumber);
        type(getdDnCreditCardType(),creditCardType);
        type(getdDnExpireMonth(), expiryMonth);
        type(getdDnExpireMonth(), expiryMonth);
        type(getdDnExpireYear(), expiryYear);
        type(getTxtCvv(), CvvNumber);
        Click(getClkBookNow());
        Thread.sleep(7000);
	}
	
	
}





