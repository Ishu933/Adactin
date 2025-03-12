package org.page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.ParaBankBase;

public class BookingConfirmation extends ParaBankBase {

	public BookingConfirmation() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement validation4;

	public WebElement getValidation4() {
		return validation4;
	}

	@FindBy(xpath = "(//input[@type='button'])[2]")
	private WebElement mylitnarypage;

	public WebElement getMylitnarypage() {
		return mylitnarypage;
	}

	@FindBy(xpath = "//td[text()='Booked Itinerary']")
	private WebElement bookedIt;

	public WebElement getBookedIt() {
		return bookedIt;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkBox;

	public WebElement getCheckBox() {
		return checkBox;
	}

	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
	
	@FindBy(xpath = "//input[@name='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}
	
}
