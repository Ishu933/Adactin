package org.sample;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaBankBase {

	public static WebDriver driver;
	public static JavascriptExecutor javascriptExecutor;
	public static TakesScreenshot takesScreenshot;
	public static Actions actions;
	public static ParaBankBase paraBankBase = new ParaBankBase();

	@BeforeClass
	public static void firstPage() {
		paraBankBase.initdriver("Chrome");
		paraBankBase.launchUrl("https://adactinhotelapp.com/");
		System.out.println("login successfully");

		paraBankBase.ScreenCature2();

	}

	public void initdriver(String browserType) {
		switch (browserType) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "Edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("invalid browser type");
			break;
		}
		driver.manage().window().maximize();
	}

	public void launchUrl(String Url) {
		driver.get(Url);

	}

	public void sendkeysByJava(WebElement element, String KeysToSend) {
		element.sendKeys(KeysToSend);

	}

	public void ClickByJava(WebElement element) {
		element.click();

	}

	public void SendKeysByJSE(WebElement element, String KeysToSend) {
		javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].setAttribute('value','" + KeysToSend + "')", element);

	}

	public void ClickByJSE(WebElement element) {
		javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].click", element);
	}

	public void ScrollType(WebElement element, String updown) {

		javascriptExecutor = (JavascriptExecutor) driver;
		switch (updown) {
		case "Up":
			javascriptExecutor.executeScript("arguments[0].scrollIntiView(false)", element);

			break;
		case "Down":
			javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", element);

			break;

		default:
			System.out.println("Invalid scrollType");
			break;
		}

	}

	public String getAttributeByJava(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public Object getAttributeByJSE(WebElement element) {
		javascriptExecutor = (JavascriptExecutor) driver;
		Object executeScript = javascriptExecutor.executeScript("arguments[0].getAttribute('value')", element);

		return executeScript;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public void ScreenType(String image) {
		try {
			takesScreenshot = (TakesScreenshot) driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File target = new File(
					"C:\\Users\\Admin\\eclipse-workspace\\AdactinProjectDemo\\ErrorImage\\" + image + ".png");
			FileUtils.copyFile(source, target);

		} catch (Exception e) {
		}
	}

	public void ScreenCature2() {
		try {
			takesScreenshot = (TakesScreenshot) driver;
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			File target = new File("C:\\Users\\Admin\\eclipse-workspace\\AdactinProjectDemo\\ErrorImage\\"
					+ System.currentTimeMillis() + ".png");
			FileUtils.copyFile(source, target);

		} catch (Exception e) {
		}

	}

	public void SelectBy(WebElement element, String Value, String SelectType) {
		Select select = new Select(element);
		switch (SelectType) {
		case "value":
			select.selectByValue(Value);

			break;
		case "text":
			select.selectByVisibleText(Value);

			break;

		default:
			break;
		}

	}

	public String windowsHandling(int requiredWindowsIndexNumber) {
		String currentwindowIwd = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();

		List<String> list = new LinkedList<String>();
		list.addAll(allwindowId);

		String requiredwindowsId = list.get(requiredWindowsIndexNumber);
		return requiredwindowsId;

	}

	public void SwitchToWindows(String requiredwindowsId) {
		driver.switchTo().window(requiredwindowsId);

	}

	// or

	public void windowsHandling2(int requiredWindowsIndexNumber) {
		String currentwindowId = driver.getWindowHandle();
		Set<String> allwindowId = driver.getWindowHandles();

		List<String> list = new LinkedList<String>();
		list.addAll(allwindowId);

		String requiredwindowID = list.get(requiredWindowsIndexNumber);
		driver.switchTo().window(requiredwindowID);
	}

	public void navigation(String commands) {
		switch (commands) {
		case "Forward":
			driver.navigate().forward();
			break;
		case "Back":
			driver.navigate().back();
			break;
		case "Refresh":
			driver.navigate().refresh();
			break;

		default:
			break;
		}

	}

	public void sleep(long millis) {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
		}

	}

	public void clear(WebElement element) {
		element.clear();

	}

	public void quiteAndClose(String quit_close) {
		switch (quit_close) {
		case "quit":
			driver.quit();

			break;
		case "close":
			driver.close();

			break;
		default:

			break;
		}

	}

	public void alert(String Accept_Dismiss) {
		switch (Accept_Dismiss) {
		case "Accept":
			driver.switchTo().alert().accept();

			break;
		case "Dismiss":
			driver.switchTo().alert().dismiss();
			break;

		default:
			break;
		}

	}

	public void promptAlert(String keysToSend, String Accept_dismiss) {
		driver.switchTo().alert().sendKeys(keysToSend);
		switch (Accept_dismiss) {
		case "Accept":
			driver.switchTo().alert().accept();

			break;
		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;

		default:
			break;
		}

	}

	public void dragAnddrop(WebElement sourceelement, WebElement targetelement) {
		actions = new Actions(driver);
		actions.dragAndDrop(sourceelement, targetelement).build().perform();

	}

	public void mouseoverActions(WebElement targetelement) {
		actions = new Actions(driver);
		actions.moveToElement(targetelement).build().perform();

	}

	public void switchToFrames(WebElement Fremerefelement) {
		driver.switchTo().frame(Fremerefelement);

	}

	public static String getDataFromWorkBook(String sheetName, int rownum, int columnnum) {
		String value = null;
		try {
			File file = new File("DataBase\\inputDatas.xlsx");
			FileInputStream fileinputStream = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(fileinputStream);
			Sheet sheet = book.getSheet(sheetName);
			Row row = sheet.getRow(rownum);
			Cell cell = row.getCell(columnnum);
			CellType cellType = cell.getCellType();

			switch (cellType) {
			case STRING:
				String stringCellValue = cell.getStringCellValue();

				break;
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {

					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
					String format = simpleDateFormat.format(dateCellValue);
					System.out.println("datecell is validated");
				} else {

					double numericCellValue = cell.getNumericCellValue();
					BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
					value = valueOf.toString();

				}

			default:
				break;
			}

		} catch (Exception e) {
		}
		return value;
	}

	public static String getDataFromProperties(String propertyKey) {
		String property = null;
		try {
			File file = new File("DataBase\\Config.properties");
			FileReader filereader = new FileReader(file);
			Properties properties = new Properties();
			properties.load(filereader);
			property = properties.getProperty(propertyKey);

		} catch (Exception e) {
		}
		return property;
	}

}
