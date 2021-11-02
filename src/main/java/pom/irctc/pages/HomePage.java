package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{
	public RegistrationPage clickOnRegister() {
		clickByXpath("//a[text()=' REGISTER ']");
		return new RegistrationPage();
		
	}
	public HomePage mouseHoverOnHolidays() {
		mousehoverbyxpath("//a[text()=' HOLIDAYS ']");
		return this;	
	}
	public HomePage mouseHoverOnStays() {
		mousehoverbyxpath("//a[@aria-label='Sub Menu of Holiday, Stays. Having sub menu']");
		return this;	
	}
	public LoungePage clickOnLounge() {
		clickByXpath("//a[@aria-label='Sub Menu of Stays, Lounge. Website will be opened in new tab']");
		return new LoungePage();
		
	}
	public HomePage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
}
