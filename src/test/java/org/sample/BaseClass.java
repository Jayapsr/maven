package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static File file;

	// Get Driver
	public static void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// To Maximize the browser
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// To get Url
	public static void getUrl(String url) {
		driver.get(url);
	}

	// To find the Element ID
	public static WebElement findElementById(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}

	// To Find the Element Name
	public static WebElement findElementByName(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}

	// To Find the Element ClassName
	public static WebElement findElementByClassName(String attributevalue) {
		WebElement findElement = driver.findElement(By.id(attributevalue));
		return findElement;
	}

	// To Find The Element By Xpath

	public static WebElement findElementByXpath(String attributevalue) {
		WebElement findElement = driver.findElement(By.xpath(attributevalue));
		return findElement;
	}

	// To send values
	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	// To Click Button
	public static void Click(WebElement element) {
		element.click();
	}

	// Select By Visible text
	public static void selectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	// Select by Value
	public static void selectByvalue(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByValue(data);
	}

	// Select By Index
	public static void selectByIndex(WebElement element, int data) {
		Select select = new Select(element);
		select.selectByIndex(data);
	}

	// Excel Sheet Path
	public String GetValueInExcel(String SheetName, int rowValue, int cellValue) throws IOException {
		String data1 = null;
		file = new File("D:\\JayaPrasath\\Hotel Booking.xlsx");
		FileInputStream Stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(Stream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowValue);
		Cell cell = row.getCell(cellValue);
		int type = cell.getCellType();
		if (type == 1) {
			data1 = cell.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
				data1 = dateformat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long) numericCellValue;
				data1 = String.valueOf(l);
			}
		}
		return data1;
	}

	// Insert Value in Excel
	public static void insertValueInExcel(String location, String sheetName, int rowNo, int cellNo, String Value)
			throws IOException {
		File file = new File(location);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNo);
		Cell createCell = row.createCell(cellNo);
		createCell.setCellValue(Value);
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	// Get text
	public String gettext(WebElement element) {
		String text = element.getText();
		return text;
	}

	// Implicit Wait
	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);

	}

	public void Acceptalert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissalert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

public String getAttributeValue(WebElement element) {
 String attribute = element.getAttribute("value");
 return attribute;

}
public void close() {
	driver.close();

}

}

