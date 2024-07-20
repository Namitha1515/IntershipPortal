package org.ict.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		
	driver=new ChromeDriver();
	driver.get("https://quiet-dasik-c4c3a7.netlify.app/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	
	}
	@AfterMethod
	public void quit() {
		driver.quit();
		   
	}
	
}
