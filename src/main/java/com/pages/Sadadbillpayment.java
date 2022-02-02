package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.Basepage;

public class Sadadbillpayment extends Basepage {
	

	By payments = By.xpath("//ul[@class='flex']//a[contains(text(),'payments')]");
	By sadad = By.xpath("//div[@class='sideNavWrapper leftSideNavWidth']//nav//li/a");
	
	public void sadadpaymentclick()
	{
		click(sadad);
		listitems(sadad, "Sadad");
	}
	
}
