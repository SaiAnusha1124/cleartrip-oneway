package com.cleartrip.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ClearTripLoginPage3 extends CleartripLoginPage2 {
	@Test(priority = 9)
	public void emailAddress() throws Exception {
		String nemailAddress = properties1.getProperty("emailAddress");
		String nemailId = properties.getProperty("emailId");
		Thread.sleep(5000);
		driver.findElement(By.xpath(nemailAddress)).sendKeys(nemailId);
	}

	@Test(priority = 10)
	public void emailAddressContinue() throws Exception {
		String nemailAddressContinue = properties1.getProperty("emailAddressContinue");
		driver.findElement(By.xpath(nemailAddressContinue)).click();
	}

}
