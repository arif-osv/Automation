package com.qa.util;

import org.openqa.selenium.WebElement;

public class AssertionMethods {
	
	public void assertElementIsDisplayed(WebElement element,String message)
	{
		boolean elementFound =false;
		try
		{
			//elementFound=WaitFunctions.waitForElement(element).isDisplayed();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
