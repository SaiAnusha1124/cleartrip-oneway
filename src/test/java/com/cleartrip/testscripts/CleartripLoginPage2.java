package com.cleartrip.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CleartripLoginPage2 extends ClearTripLoginPage1 {
	@Test(priority = 7)
	public static void accepttermsCheckbox() throws InterruptedException {
		String naccepttermCheckbox = properties1.getProperty("accepttermsCheckbox");
		Thread.sleep(5000);
		driver.findElement(By.xpath(naccepttermCheckbox)).click();
	}
	
	@Test(priority = 8)
	public static void continueBooking() throws InterruptedException {
		String ncontinueBooking = properties1.getProperty("continueBooking");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ncontinueBooking)).click();
	}
	
}
