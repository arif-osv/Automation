package com.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import com.qa.util.Basepage;

public class userprofilepage extends Basepage {

	By username = By.xpath("//span[@class='userTitle']");
	By Profilename = By.xpath("//div[@class='email Cursor']//div");
	By usernameedit = By.xpath("(//button[@class='editBtn allUserPrflColor editClose'][normalize-space()='Edit'])[1]");
	By EmailEdit = By.xpath("(//button[@class='editBtn allUserPrflColor editClose'][normalize-space()='Edit'])[2]");
	By PasswordEdit = By.xpath("(//button[@class='editBtn allUserPrflColor editClose'][normalize-space()='Edit'])[3]");
	By Phonenumber = By.xpath("(//button[@class='editBtn allUserPrflColor editClose'][normalize-space()='Edit'])[4]");
	By savebutton = By.xpath("//button[normalize-space()='Save']");
	By errormsg = By.xpath("//div[@class='errorMessage']");
	By cancelbutton = By.xpath("//button[normalize-space()='Cancel']");
	By Conformemail = By.xpath("//input[@name='confirmEmail']");

	public void usernameedit() {
		waitforElementclick(username);
		click(username);
		waitforElementclick(Profilename);

		click(Profilename);
		waitforElementclick(usernameedit);
		click(usernameedit);
		waitforElementclick(savebutton);
		click(savebutton);
//gettext(errormsg, "Duplicate User");
//assertEquals(errormsg, false);
		waitforElementclick(cancelbutton);
		click(cancelbutton);

	}

	public void emailedit() {
		waitforElementclick(username);
		click(username);
		waitforElementclick(Profilename);

		click(Profilename);
		waitforElementclick(EmailEdit);
		click(EmailEdit);
		type(Conformemail, "pashamda@gmail.com");
		waitforElementclick(savebutton);
		click(savebutton);
	}

}