package pom.irctc.pages;

import wrappers.GenericWrappers;

public class LoungePage extends GenericWrappers {
	
	public LoungePage switchToLoungeWindow() {
		switchToLastWindow();
		return this;
	}
	
	public LoungePage clickOnMenu() {
		clickByXpath("//i[@class='fas fa-align-left']");
		return this;
	}
	public CoachBookPage clickOnBookYourCoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new CoachBookPage();
	}
	public CharterPage clickOnCharter() {
		clickByXpath("//a[text()='Charter']");
		return new CharterPage();
	}
	public HotelsPage clickOnHotelsIcon() {
		clickByXpath("//span[text()='Hotels']");
		return  new HotelsPage();
	}
	public LoungePage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return null;
	}
	
	

}
