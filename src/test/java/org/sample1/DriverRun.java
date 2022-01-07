package org.sample1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverRun {

	
	@Parameters({"browser"})
	@Test
	private void method(String browser) {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
	}
	
}
