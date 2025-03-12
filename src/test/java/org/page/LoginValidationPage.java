package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.ParaBankBase;

public class LoginValidationPage extends ParaBankBase {

	public LoginValidationPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	private WebElement User;

	public WebElement getUser() {
		return User;
	}

	@FindBy(xpath = "//input[@name='password']")
	private WebElement pass;

	public WebElement getPass() {
		return pass;

	}

	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
