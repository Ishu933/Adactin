package org.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.ParaBankBase;

public class BookHotel extends ParaBankBase{
	public BookHotel() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastname;
	public WebElement getLastname() {
		return lastname;
	}
	
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccnum;
	public WebElement getCcnum() {
		return ccnum;
	}
	
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement cctype;
	public WebElement getCctype() {
		return cctype;
	}
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement ccmonth;
	public WebElement getCcmonth() {
		return ccmonth;
	}
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement ccyear;
	public WebElement getCcyear() {
		return ccyear;
	}
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvv;
	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(xpath="//input[@class='reg_button']")
	private WebElement booknow;
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
