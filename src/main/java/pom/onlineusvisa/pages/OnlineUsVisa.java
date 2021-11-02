package pom.onlineusvisa.pages;

import pom.indianfrro.pages.IndianfrroRegistrationPage;
import wrappers.GenericWrappers;

public class OnlineUsVisa extends GenericWrappers {
	public OnlineUsVisa enterName(String name) {
		enterByXpath("//input[@id='app-given-names']", name);
		return this;	
	}
	public OnlineUsVisa enterSurName(String surname) {
		enterByXpath("//input[@id='app-surname']", surname);
		return this;	
	}
	public OnlineUsVisa enterFullName(String fullname) {
		enterByXpath("//input[@id='app-native-name']", fullname);
		return this;	
	}
	public OnlineUsVisa clickOnYes() {
		clickByXpath("//input[@id='other-names-used-Yes']");
		return this;	
	}
	public OnlineUsVisa enterOtherSurName(String othersurname) {
		enterByXpath("//input[@name='other-surname']", othersurname);
		return this;	
	}
	public OnlineUsVisa enterOtherName(String othername) {
		enterByXpath("//input[@name='other-given-names']", othername);
		return this;	
	}
	public OnlineUsVisa enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;	
	}
	public OnlineUsVisa enterConfirmEmail(String confirmemail) {
		enterByXpath("//input[@name='email-1']", confirmemail);
		return this;	
	}
	public OnlineUsVisa clickOnOtherEmailYes() {
		clickByXpath("//input[@id='additional-email-Yes']");
		return this;	
	}
	public OnlineUsVisa enterAdditionalEmail(String email) {
		enterByXpath("//input[@name='additional-email-detail']", email);
		return this;	
	}
	public OnlineUsVisa clickOnFemale() {
		clickByXpath("//input[@id='gender-Female']");
		return this;	
	}
	public OnlineUsVisa clickOnDateOfBirth() {
		clickByXpath("//input[@name='date-of-birth']");
		return this;	
	}
	public OnlineUsVisa selectYear(String year) {
		selectVisibileTextByXpath("//select[@aria-controls='date-of-birth_table'][1]", year);
		return this;	
	}
	public OnlineUsVisa selectMonth(String month) {
		selectVisibileTextByXpath("//select[@aria-controls='date-of-birth_table'][2]", month);
		return this;	
	}
	public OnlineUsVisa clickOnDay() {
		clickByXpath("//div[text()='15'][1]");
		return this;	
	}
	public OnlineUsVisa enterCity(String city) {
		enterByXpath("//input[@name='city-of-birth']", city);
		return this;	
	}
	public OnlineUsVisa enterState(String state) {
		enterByXpath("//input[@name='state-of-birth']", state);
		return this;	
	}
	public OnlineUsVisa selectCountry(String country) {
		selectVisibileTextByXpath("//select[@name='country-of-birth']", country);
		return this;	
	}
	public OnlineUsVisa selectNationality(String nationality) {
		selectVisibileTextByXpath("//select[@name='nationality']", nationality);
		return this;	
	}
	public OnlineUsVisa clickOnResidentNationality() {
		clickByXpath("//input[@id='select-perm-resident-other-country-Yes']");
		return this;	
	}
	public OnlineUsVisa selectResidentCountry(String residentcountry) {
		selectVisibileTextByXpath("//select[@id='perm-resident-other-country']", residentcountry);
		return this;	
	}
	public OnlineUsVisa waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return null;
	}
	public OnlineUsVisa scrollDown() {
  		pagedown();
  		return this;
  		
  	}
     
	
}
