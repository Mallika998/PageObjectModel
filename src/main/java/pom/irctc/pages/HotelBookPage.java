package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelBookPage extends GenericWrappers{
	public HotelDisplayPage clickOnFirstHotel() {
		clickByXpath("//div[@class='filtersearch-packages ng-star-inserted'][1]");
		return new HotelDisplayPage();
	}
	public HotelBookPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public HotelBookPage scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}
	public HotelBookPage  switchToHotelDisplayWindow() {
		switchToLastWindow();
		return this;
	}

}
