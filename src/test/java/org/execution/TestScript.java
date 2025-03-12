package org.execution;

import org.junit.After;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.page.BookHotel;
import org.page.BookingConfirmation;
import org.page.LoginValidationPage;
import org.page.SearchPage;
import org.page.SelectHotel;
import org.sample.ParaBankBase;

public class TestScript extends ParaBankBase {

	public static ParaBankBase paraBankBase = new ParaBankBase();
	public static LoginValidationPage loginValidationPage;

	public static SearchPage searchPage;
	public static SelectHotel selectHotel;
	public static BookHotel BookHotel;
	public static BookingConfirmation bookingConfirmation;

	@Before
	public void secondPage() {
		loginValidationPage = new LoginValidationPage();
		WebElement user = loginValidationPage.getUser();
		paraBankBase.sendkeysByJava(user, "antonykutty");

		WebElement pass = loginValidationPage.getPass();
		paraBankBase.sendkeysByJava(pass, "123456");

		WebElement login = loginValidationPage.getLogin();
		paraBankBase.ClickByJava(login);
		
//		paraBankBase.ScreenCature2();
//		paraBankBase.ScreenType("loginHotelimage");
//		paraBankBase.ScreenCature2();
		System.out.println("screen capture1");
		
		System.out.println("login successfully");

	}

	@Test
	public void thirdPage() {
		searchPage = new SearchPage();
		WebElement location = searchPage.getLocation();
		paraBankBase.sendkeysByJava(location, "Sydney");

		WebElement hotel = searchPage.getHotel();
		paraBankBase.sendkeysByJava(hotel, "Hotel Sunshine");

		WebElement room = searchPage.getRoom();
		paraBankBase.sendkeysByJava(room, "Deluxe");

		WebElement roomnum = searchPage.getRoomnum();
		paraBankBase.sendkeysByJava(roomnum, "1");

		WebElement datein = searchPage.getDatein();
		paraBankBase.SendKeysByJSE(datein, "12/12/2024");

		WebElement dateout = searchPage.getDateout();
		paraBankBase.sendkeysByJava(dateout, "29/12/2024");

		WebElement adult = searchPage.getAdult();
		// paraBankBase.SendKeysByJSE(adult, "2");
		paraBankBase.SelectBy(adult, "2", "value");

		WebElement child = searchPage.getChild();
		// paraBankBase.SendKeysByJSE(child, "2");
		paraBankBase.SelectBy(child, "3 - Three", "text");

		WebElement search = searchPage.getSearch();
		paraBankBase.ClickByJava(search);

//		paraBankBase.ScreenCature2();

		System.out.println("login successfully0");

	}

	@After
	public void fourthPage() {
		selectHotel = new SelectHotel();

		if (selectHotel.getValidation3().isDisplayed()) {
			System.out.println("validation 3 is successfully");
		}

		WebElement clich3 = selectHotel.getClich3();
		paraBankBase.ClickByJava(clich3);

		WebElement continue3 = selectHotel.getContinue3();
		paraBankBase.ClickByJava(continue3);

		System.out.println("login successfully");

		BookHotel = new BookHotel();
		WebElement firstname = BookHotel.getFirstname();
		paraBankBase.SendKeysByJSE(firstname, "Ishu");

		WebElement lastname = BookHotel.getLastname();
		paraBankBase.SendKeysByJSE(lastname, "ishu");

		WebElement address = BookHotel.getAddress();
		paraBankBase.sendkeysByJava(address, "erode");
		// paraBankBase.sendkeysByJava(address, "23,puthu colony,Erode,638002");
		WebElement ccnum = BookHotel.getCcnum();
		paraBankBase.SendKeysByJSE(ccnum, "8766767654654656");

		WebElement cctype = BookHotel.getCctype();
		paraBankBase.SelectBy(cctype, "Master Card", "text");

		WebElement ccmonth = BookHotel.getCcmonth();
		paraBankBase.SelectBy(ccmonth, "April", "text");

		WebElement ccyear = BookHotel.getCcyear();
		paraBankBase.SelectBy(ccyear, "2014", "value");

		WebElement cvv = BookHotel.getCvv();
		paraBankBase.SendKeysByJSE(cvv, "786");

		WebElement booknow = BookHotel.getBooknow();
		paraBankBase.ClickByJava(booknow);
		
//		paraBankBase.ScreenCature2();


		System.out.println("text2");

		try {
			Thread.sleep(5000);

		} catch (Exception e) {
		}
		
		
	
	
		
//		WebElement mylitnarypage = bookingConfirmation.getMylitnarypage();
	//	paraBankBase.ClickByJSE(mylitnarypage);
//		mylitnarypage.click();
	}

	@AfterClass
	public static void fifthPage() {
		bookingConfirmation = new BookingConfirmation();

		if (bookingConfirmation.getValidation4().isDisplayed()) {
			System.out.println("validation 5");

		}
		
		WebElement mylitnarypage = bookingConfirmation.getMylitnarypage();
		paraBankBase.ClickByJava(mylitnarypage);
		System.out.println("login successfully3");

		
		if (bookingConfirmation.getBookedIt().isDisplayed()) {
			System.out.println("bookit success");
			
		}
		
		WebElement checkBox = bookingConfirmation.getCheckBox();
		paraBankBase.ClickByJava(checkBox);
		
		WebElement cancel = bookingConfirmation.getCancel();
		paraBankBase.ClickByJava(cancel);
		
		driver.switchTo().alert().accept();
		
		WebElement logout = bookingConfirmation.getLogout();
		paraBankBase.ClickByJava(logout);
		
//		paraBankBase.ScreenCature2();

		
	}
}
