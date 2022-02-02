package com.pages;

import org.openqa.selenium.By;

import com.qa.util.Basepage;

public class Usermanagement extends Basepage{
	By username = By.xpath("//span[@class='userTitle']");
	By usermanagement=By.xpath("//h5[normalize-space()='User management']");
	By createnewuser =By.xpath("//button[normalize-space()='+ Create new user']");
	By Userdetails =By.xpath("//input[@name='name']");
	By Emailid =By.xpath("//input[@name='email']");
	By NationalID=By.xpath("//input[@name='nationalId']");
	
	
	
	public void Createnewuser()
	{
		waitforElementclick(username);
		click(username);
		
		click(usermanagement);
		waitforElementclick(createnewuser);
		click(createnewuser);
		waitforElementclick(Userdetails);
		type(Userdetails, "Arif");
type(Emailid, "pashamda@gmail.com");
type(NationalID, "895985984s");
	}

}
