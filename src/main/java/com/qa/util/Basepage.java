package com.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;

public class Basepage {
	

	WebDriverWait wait;
	
	public void type(By locator,String text)
	{
		DriverFactory.getDriver().findElement(locator).sendKeys(text);
	}
	
	public void click(By locator)
	{
		DriverFactory.getDriver().findElement(locator).click();
	}
	
	public void listitems(By locator,String Text)
	{
		List<WebElement> li =DriverFactory.getDriver().findElements(locator);
		for (int i = 0; i < li.size(); i++) {
			
			if(li.get(i).getText().equals(Text))
			{
				li.get(i).click();
			}
			
		}
	}
	

	public void waitforvisibility(By locator)
	{
		wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	public void waitforElementclick(By locator)
	{
		wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public String gettext(By locator,String text)
	{
		DriverFactory.getDriver().findElement(locator).getText();
		return text;
	}
	
	public WebElement getElementbasedontext(String Text)
	{
		return DriverFactory.getDriver().findElement(By.xpath("//*[contains(text(),'"+Text+"']"));
	}

}
