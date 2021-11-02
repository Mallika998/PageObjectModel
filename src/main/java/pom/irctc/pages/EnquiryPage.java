package pom.irctc.pages;

import wrappers.GenericWrappers;

public class EnquiryPage extends GenericWrappers {
	public EnquiryPage enterName(String name) {
		enterByXpath("//input[@name='name']", name);
		return this;
	}
	public EnquiryPage enterOrganisation(String organisation) {
		enterByXpath("//input[@name='organization']", organisation);
		return this;
	}
	public EnquiryPage enterAddress(String address) {
		enterByXpath("//input[@name='address']", address);
		return this;
	}
	public EnquiryPage enterMobileNumber(String mobilenumber) {
		enterByXpath("//input[@name='mobile']", mobilenumber);
		return this;
	}
	public EnquiryPage enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	public EnquiryPage selectCharter(String charter) {
		selectVisibileTextByXpath("//select[@name='requestFor']", charter);
		return this;
	}
	public EnquiryPage enterCharterPurpose(String charterpurpose) {
		enterByXpath("//input[@name='email']", charterpurpose);
		return this;
	}
	public EnquiryPage enterOriginStation(String originstation) {
		enterByXpath("//input[@name='originStation']", originstation);
		return this;
	}
	public EnquiryPage enterDestinationStation(String destinationstation) {
		enterByXpath("//input[@name='destnStation']", destinationstation);
		return this;
	}
	public EnquiryPage clickOnCheckInDate() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	
	public EnquiryPage clickOnmonth() {
		clickByXpath("//th[text()='Oct 2021 ']");
		return this;
	}
	public EnquiryPage clickOnDay() {
		clickByXpath("//span[text()='28']");
		return this;
	}
	public EnquiryPage clickOnCheckOutDate() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	public EnquiryPage clickOnmonthYear() {
		clickByXpath("//th[text()='Oct 2021 ']");
		return this;
	}
	public EnquiryPage clickOnDayChekout() {
		clickByXpath("//span[text()='31']");
		return this;
	}
	public EnquiryPage enterDuration(String duration) {
		enterByXpath("//input[@name='durationPeriod']", duration);
		return this;
	}
	public EnquiryPage enterTypeOfCoach(String coach) {
		enterByXpath("//input[@name='coachDetails']", coach);
		return this;
	}
	public EnquiryPage enterNumberOfPassengers(String passenger) {
		enterByXpath("//input[@name='numPassenger']", passenger);
		return this;
	}
	public EnquiryPage enterService(String service) {
		enterByXpath("//textarea[@name='services']", service);
		return this;
	}
	public EnquiryPage clickOnSubmit() {
		clickByXpath("//button[text()='Submit ']");
		return this;
	}
	public EnquiryPage verifyInformation() {
		String text = getTextByXpath("//span[text()='Mobile no. not valid']");
		verifyTextByXpath("//span[text()='Mobile no. not valid']", text);
		return this;
	}
	public EnquiryPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	public EnquiryPage scrollDown() {
		// TODO Auto-generated method stub
		pagedown();
		return this;
	}

}
