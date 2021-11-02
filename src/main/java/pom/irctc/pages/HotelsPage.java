package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsPage extends GenericWrappers {
	
	public HotelsLoginPopPage clickOnLogin() {
		clickByXpath("//a[text()='Login']");
		return new HotelsLoginPopPage();
	}
	public HotelsPage clickOnEnterCity() {
		clickByXpath("//input[@id='filterText']");
		return this;
	}
	public HotelsPage enterCityText(String city) {
		enterByXpath("//input[@id='filterText']", city);
		return this;
	}
	
	public HotelsPage clickOnSelectcity() {
		clickByXpath("//*[@id=\"scroll\"]/div[2]/div/app-hotelmodify/form/div[1]/searchbox/div/ul/li[2]/a/div[1]/span");
		return this;
	}
	public HotelsPage clickOnCheckInDate() {
		clickByXpath("//input[@placeholder='Check-in Date']");
		return this;
	}
	public HotelsPage clickOnSelectCheckInDate() {
		clickByXpath("//span[text()='8']");
		return this;
	}
	public HotelsPage clickOnCheckOutDate() {
		clickByXpath("//input[@placeholder='Check-out Date']");
		return this;
	}
	public HotelsPage clickOnSelectCheckOutDate() {
		clickByXpath("//span[text()='11']");
		return this;
	}
	public HotelsPage clickOnGuest() {
		clickByXpath("//input[@name='guest']");
		return this;
	}
	public HotelsPage selectRoom() {
		selectVisibileTextByXpath("//select[@name='hotelRoom']", "1");
		return this;
	}
	public HotelsPage selectAdult() {
		selectVisibileTextByXpath("//select[@name='hotelAdult']", "3");
		return this;
	}
	public HotelsPage clickOnDone() {
		clickByXpath("//button[text()='Done']");
		return this;
	}
	public HotelBookPage clickOnFindHotel() {
		clickByXpath("//button[text()='Find Hotel ']");
		return new HotelBookPage();
	}
	public HotelsPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public HotelsPage scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}
	public HotelsPage  switchToHotelsWindow() {
		switchToLastWindow();
		return this;
	}
	public HotelsPage  switchToHotelsBackWindow() {
		switchToParentWindow();
		return this;
	}
	
}
