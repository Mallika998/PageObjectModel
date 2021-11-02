package pom.indianfrro.pages;


import wrappers.GenericWrappers;

public class Indianfrro extends GenericWrappers {
	public IndianfrroRegistrationPage clickOnRegistration() {
		clickByXpath("//a[text()='Sign Up (Registration)']");
		return new IndianfrroRegistrationPage();
	}
	
}
