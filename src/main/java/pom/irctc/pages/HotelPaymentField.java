package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPaymentField extends GenericWrappers{
	public HotelPaymentField clickOnCheckMark() {
		clickByXpath("//span[@class='checkmark']");
		return this;
	}
	public HotelOtpField clickOnMakePayment() {
		clickByXpath("//button[@type='button'][2]");
		return new HotelOtpField();
	}
	public void verifyGsttext(String string) {
		// TODO Auto-generated method stub
		
	}
	public HotelPaymentField waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	
}
