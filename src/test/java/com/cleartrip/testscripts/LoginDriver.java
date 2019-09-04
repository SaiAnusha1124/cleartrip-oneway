package com.cleartrip.testscripts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginDriver 
{
	static WebDriver driver;
	@BeforeClass
	public void launchDriver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saianusha.podichervu\\eclipse-workspace\\KSRTC_Website\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
