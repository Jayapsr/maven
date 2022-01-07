package org.testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
@Parameters({"browser"})
@Test
private void test(String browser) {
	
	if (browser.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	else if (browser.equals("FireFox")) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	
}


}
