package com.cleartrip.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ClearTripLoginPage4 extends ClearTripLoginPage3 
{
	@Test(priority = 11)
	public void travellerNameTittle() throws Exception {
		String ntravellerNameTitle = properties1.getProperty("travellerNameTittle");
		String ntitle = properties.getProperty("title");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ntravellerNameTitle)).click();
		WebElement title = driver.findElement(By.xpath(ntravellerNameTitle));
		Select s = new Select(title);
		s.selectByValue(ntitle);
	}

	@Test(priority = 12)
	public void travellersFirstName() throws Exception {
		String ntravellersFirstName = properties1.getProperty("travellersFirstName");
		String nfirstName = properties.getProperty("firstname");
		Thread.sleep(5000);
		driver.findElement(By.xpath(ntravellersFirstName)).sendKeys(nfirstName);
	}

	@Test(priority = 13)
	public void travellersLastName() throws Exception {
		String ntravellersLastName = properties1.getProperty("travellersLastName");
		String nlastName = properties.getProperty("lastname");
		driver.findElement(By.xpath(ntravellersLastName)).sendKeys(nlastName);
	}

	@Test(priority = 14)
	public void travellersMobileNumber() throws Exception {
		String ntravellersMobileNumber = properties1.getProperty("travellersMobileNumber");
		String nmobileNumber = properties.getProperty("mobilenumber");
		driver.findElement(By.xpath(ntravellersMobileNumber)).sendKeys(nmobileNumber);
	}

	@Test(priority = 15)
	public void travellersContinuePayment() throws Exception {
		String ntravellersContinuePayment = properties1.getProperty("travellersContinuePayment");
		driver.findElement(By.xpath(ntravellersContinuePayment)).click();
	}
}
