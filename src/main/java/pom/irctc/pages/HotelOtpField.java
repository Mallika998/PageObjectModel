package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelOtpField extends GenericWrappers{
	public HotelOtpField clickOnVerifyOtp() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	public HotelOtpField VerifyOtp(String text) {
		verifyTextByXpath("/span[text()='otp is required.']", text);
		return this;
	}
	public HotelOtpField waitForElement(long time) {
		// TODO Auto-generated method stub
		waitForElement(time);
		return this;
	}
	
}
