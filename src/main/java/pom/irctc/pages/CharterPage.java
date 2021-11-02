package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	public EnquiryPage clickOnEnquiryForm() {
		clickByXpath("//a[text()='Enquiry Form']");
		return new EnquiryPage();
	}
	public CharterPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public CharterPage scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}
	public CharterPage  switchToCharterWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	
}
