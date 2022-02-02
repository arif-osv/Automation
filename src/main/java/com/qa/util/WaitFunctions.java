package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFunctions  {
	private WebDriver driver;
	
	public WebElement waitForElement(WebElement element)
	{
		driver=	DriverFactory.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15, 500);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		return element;
		
	}

	public WebElement waitForElement(WebElement element,int durationInSeconds)
	{
		driver=	DriverFactory.getDriver();
		WebDriverWait wait = new WebDriverWait(driver, durationInSeconds, 500);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		return element;
		
	}
	public WebElement Elementtobeclickabe(WebElement element)
	{
		 WebDriverWait wait = new WebDriverWait(driver, 15);
		     wait.until(ExpectedConditions.elementToBeClickable(element));

		  return element;
	}
}
