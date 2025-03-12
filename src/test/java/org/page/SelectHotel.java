package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.ParaBankBase;

public class SelectHotel extends ParaBankBase{
	
	public SelectHotel() {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement validation3;

	public WebElement getValidation3() {
		return  validation3;
	}
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement click3;

	public WebElement getClich3() {
		return click3;
	}

	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue3;

	public WebElement getContinue3() {
		return  continue3;
	}
}
