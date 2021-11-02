package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelDisplayPage extends GenericWrappers {
	public HotelDisplayPage getHotelName() {
		String text1=getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5");
		return this;
	}
	public HotelDisplayPage getHotelPrice() {
		String text2=getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		return this;
	}
	public HotelPersonalDetails clickOnContinueToBook() {
		clickByXpath("//b[text()='Continue to Book']");
		return new HotelPersonalDetails();
	}
	public HotelDisplayPage  switchToHotelDisplayWindow() {
		switchToLastWindow();
		return this;
	}
	public HotelDisplayPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public HotelDisplayPage scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}
}
