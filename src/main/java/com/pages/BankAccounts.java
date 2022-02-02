package com.pages;

import org.openqa.selenium.By;

import com.qa.util.Basepage;
/**
 * base
 */
public class BankAccounts extends Basepage{

	By username         =   By.xpath("//span[@class='userTitle']");
	By yourbankaccounts =   By.xpath("//h5[normalize-space()='Your bank accounts']");
	By AddAccount		= By.xpath("//button[normalize-space()='+ Add account']");
	By BankName = By.xpath("//img[@alt='BNP Paribas']");
	
	By FirstIcons = By.xpath("(//span[@class='icon-dots'])[1]");
	By Edit = By.xpath("//div[contains(@class,'rightPanel bodyContainer')]//li[4]");
	By Gotowebsite =By.xpath("//div[contains(@class,'rightPanel bodyContainer')]//li[3]");
	By Delete = By.xpath("//div[contains(@class,'rightPanel bodyContainer')]//li[5]");
	
	By save =By.xpath("//button[normalize-space()='Save']");
	
	
	public void AddbankAccount()
	{
		click(username);
		waitforvisibility(yourbankaccounts);
		click(yourbankaccounts);
		waitforElementclick(AddAccount);
		click(AddAccount);
		waitforElementclick(BankName);
		click(BankName);
		
	}
	public void Edit()
	{
		click(username);
		waitforvisibility(yourbankaccounts);
		click(yourbankaccounts);
		waitforvisibility(FirstIcons);
		click(FirstIcons);
		waitforvisibility(Edit);
		click(Edit);
		waitforvisibility(save);
		click(save);
		
	}
	public void Gotowebsite()
	{
		click(username);
		waitforvisibility(yourbankaccounts);
		click(yourbankaccounts);
		waitforvisibility(FirstIcons);
		click(FirstIcons);
		waitforvisibility(Gotowebsite);
		click(Gotowebsite);
		
	}

}
