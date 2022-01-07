package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws IOException {

  WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
  driver.get("http://demo.automationtesting.in/Register.html");
  driver.manage().window().maximize();
  WebElement DdnCountries = driver.findElement(By.xpath("//select[@class='select2-hidden-accessible']"));
	Select select = new Select(DdnCountries);
	List<WebElement> options = select.getOptions();
	int size = options.size();
	
	
	//File file = new File("C:\\Users\\admin\\eclipse-workspace\\maven1\\Excel Sheet\\Sample.xlsx");
	
	Workbook workbook = new XSSFWorkbook();
	Sheet createSheet = workbook.createSheet("Test");
	
	
	
	for (int i = 1; i < size; i++) {
		WebElement element = options.get(i);
		String text = element.getText();
		System.out.println(text);
		Row createRow = createSheet.createRow(i-1);	
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue(text);
	}
	
	FileOutputStream fileOut = new FileOutputStream(new File("C:\\Users\\admin\\eclipse-workspace\\maven1\\Excel Sheet\\Sample.xlsx"));
	workbook.write(fileOut);
	fileOut.close();
	}

}
