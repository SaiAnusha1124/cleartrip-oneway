package com.cleartrip.testscripts;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClearTripLoginPage1 extends LoginDriver {
	static Properties properties;
	FileInputStream fis;
	FileInputStream fos;
	static Properties properties1;

	@BeforeClass
	public void loadProperties() throws Exception {
		properties = new Properties();
		properties1 = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\saianusha.podichervu\\eclipse-workspace\\ClearTrip\\Resources\\testdata\\cleartripdata.properties");
		fos = new FileInputStream(
				"C:\\Users\\saianusha.podichervu\\eclipse-workspace\\ClearTrip\\Resources\\locators\\leartriplocators.properties");
		properties.load(fis);
		properties1.load(fos);
	}

	@Test(priority = 1)
	public void homepage() {
		String nurl = properties.getProperty("url");
		driver.get(nurl);
	}

	@Test(priority = 2)
	public void fromPlace() {
		String nFromPlace = properties1.getProperty("fromPlace");
		String nFromPlaceValue = properties1.getProperty("fromPlaceValue");
		driver.findElement(By.xpath(nFromPlace)).sendKeys(nFromPlaceValue);
		{
			WebElement element = driver.findElement(By.xpath(nFromPlace));
			Actions action = new Actions(driver);
			action.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		}
	}

	@Test(priority = 3)
	public void toPlace() throws Exception {
		String nToPlace = properties1.getProperty("toPlace");
		String ntoPlaceValue = properties1.getProperty("toPlaceValue");
		driver.findElement(By.xpath(nToPlace)).sendKeys(ntoPlaceValue);
		{
			WebElement element = driver.findElement(By.xpath(nToPlace));
			Thread.sleep(3000);
			Actions action = new Actions(driver);
			action.moveToElement(element).sendKeys(Keys.ENTER).build().perform();
		}
	}

	@Test(priority = 4)
	public void dateOfJourney() throws Exception {
		String nDateOfJourney = properties1.getProperty("dateOfJourney");
		String nDateOfJourneyValue = properties1.getProperty("dateOfJourneyValue");
		driver.findElement(By.xpath(nDateOfJourney)).click();
		driver.findElement(By.xpath(nDateOfJourneyValue)).click();
	}

	@Test(priority = 5)
	public void searchFlight() throws Exception {
		String nSearchFlight = properties1.getProperty("searchFlight");
		driver.findElement(By.xpath(nSearchFlight)).click();
	}

	@Test(priority = 6)
	public void selectFlight() throws InterruptedException {
		String nselectFlight = properties1.getProperty("selectFlight");
		driver.findElement(By.xpath(nselectFlight)).click();
	}
	
}
