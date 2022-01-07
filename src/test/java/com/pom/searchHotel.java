package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class searchHotel  extends BaseClass{
	public searchHotel() {
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
WebElement dDnLocation;

@FindBy(id="hotels")
WebElement dDnHotels;

@FindBy(id="room_type")
WebElement dDnRoomType;

@FindBy(id="room_nos")
WebElement dDnNoOfRooms;

@FindBy(id="datepick_in")
WebElement txtDateIn;

@FindBy(id="datepick_out")
WebElement txtDateOut;

@FindBy(id="adult_room")
WebElement dDnAdultRoom;

@FindBy(id="child_room")
WebElement dDnChildRoom;

@FindBy(id="Submit")
WebElement clkSubmit;

public WebElement getClkSubmit() {
	return clkSubmit;
}

public WebElement getdDnLocation() {
	return dDnLocation;
}

public WebElement getdDnHotels() {
	return dDnHotels;
}

public WebElement getdDnRoomType() {
	return dDnRoomType;
}

public WebElement getdDnNoOfRooms() {
	return dDnNoOfRooms;
}

public WebElement getTxtDateIn() {
	return txtDateIn;
}

public WebElement getTxtDateOut() {
	return txtDateOut;
}

public WebElement getdDnAdultRoom() {
	return dDnAdultRoom;
}

public WebElement getdDnChildRoom() {
	return dDnChildRoom;
}

public void searchhotel(String location, String hotels, String roomType, String roomNos, String checkInDate, String checkOutDate,String adultRoom,String childRoom) {
	selectByVisibleText(getdDnLocation(),location );
    selectByVisibleText(getdDnHotels(), hotels);
    selectByVisibleText(getdDnRoomType(), roomType);
    selectByVisibleText(getdDnNoOfRooms(), roomNos);
    type(getTxtDateIn(), checkInDate);
    type(getTxtDateOut(), checkOutDate);
    selectByVisibleText(getdDnAdultRoom(), adultRoom);
    selectByVisibleText(getdDnChildRoom(), childRoom);
    Click(getClkSubmit());
    
    
}



}
