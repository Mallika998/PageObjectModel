package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelsLoginPopPage extends GenericWrappers {
	public HotelsLoginPopPage clickOnGuestUserLogin() {
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
	}
	public HotelsLoginPopPage enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	public HotelsLoginPopPage enterMobile(String mobile) {
		enterByXpath("//input[@name='mobileNo']", mobile);
		return this;
	}
	public HotelsPage clickOnClickOnSubmit() {
		clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
		return new HotelsPage();
	}
	public HotelsLoginPopPage waitForElement(long time) {
		// TODO Auto-generated method stub
		waitproperty(time);
		return this;
	}
	
}
