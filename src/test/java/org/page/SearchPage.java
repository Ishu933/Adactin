package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.ParaBankBase;

public class SearchPage extends ParaBankBase{
	public SearchPage() {
		
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;

	public WebElement getHotel() {
		return hotel;
	}

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room;

	public WebElement getRoom() {
		return room;

	}

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement roomnum;

	public WebElement getRoomnum() {
		return roomnum;
	}

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datein;

	public WebElement getDatein() {
		return datein;
	}

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement dateout;

	public WebElement getDateout() {
		return dateout;
	}
	
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult;

	public WebElement getAdult() {
		return adult;
	}

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;

	public WebElement getChild() {
		return child;
	}

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	
	


}
