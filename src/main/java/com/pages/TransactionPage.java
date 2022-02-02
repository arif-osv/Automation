package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TransactionPage {
	private WebDriver driver;
	
	public TransactionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver,this);
	}

}
