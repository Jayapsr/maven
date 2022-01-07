package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	 @FindBy(id = "radiobutton_0")
	private WebElement btnRadio;

	 @FindBy(id="continue")
	private WebElement clkSearch;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getClkSearch() {
		return clkSearch;
	}
	
	public void selectHotel() {
	Click(getBtnRadio());
	Click(getClkSearch());

	}
	
}
