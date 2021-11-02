package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPersonalDetails extends GenericWrappers {
	public HotelPersonalDetails selectTitle(String title) {
		selectVisibileTextByXpath("//select[@name='title']", title);
		return this;
	}
	public HotelPersonalDetails enterFirstName(String firstname) {
		enterByXpath("//input[@name='firstName']", firstname);
		return this;
	}
	public HotelPersonalDetails enterLastName(String lastname) {
		enterByXpath("//input[@name='lastName']", lastname);
		return this;
	}
	public HotelPersonalDetails selectCountry(String country) {
		selectVisibileTextByXpath("//select[@name='country']", country);
		return this;
	}
	public HotelPersonalDetails selectState(String state) {
		selectVisibileTextByXpath("//select[@name='state']", state);
		return this;
	}
	public HotelPersonalDetails selectGst() {
		clickByXpath("//option[text()='No']");
		return this;
	}
	public HotelPersonalDetails verifyHotelName() {
		String text1=getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[1]/div/h5");
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong", text1);
		return this;
	}
	public HotelPersonalDetails verifyHotelPrice() {
		String text2=getTextByXpath("/html/body/app-root/app-fulllayout/app-hoteldetail/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div/div[2]/strong");
		verifyTextByXpath("/html/body/app-root/app-fulllayout/app-paxdetail/div[2]/div/div/div[2]/div[2]/div/div/div[3]/strong", text2);
		return this;
	}
	public HotelPaymentField clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
		return new HotelPaymentField();
	}
	public HotelPersonalDetails selectGstAsYes() {
		clickByXpath("//option[text()='Yes']");
		return this;
	}
	public HotelPersonalDetails enterCompanyName(String companyname) {
		enterByXpath("//input[@name='companyName']", companyname);
		return this;
	}
	public HotelPersonalDetails enterCompanyAddress(String companyaddress) {
		enterByXpath("//input[@name='companyAddress']", companyaddress);
		return this;
	}
	public HotelPersonalDetails verifyGsttext(String text) {
		verifyTextByXpath("//span[text()='gstNumber is required.']", text);
		return this;
	}
	public HotelPersonalDetails waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public HotelPersonalDetails scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}
}
