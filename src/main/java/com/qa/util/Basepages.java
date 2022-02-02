package com.qa.util;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.Multimap;
import com.qa.factory.DriverFactory;

public abstract class Basepages {

	protected WebDriver driver;
	protected Waits w = new Waits();

	/*
	 * public Basepages(WebDriver driver) {
	 * 
	 * setDriver(driver); DriverFactory.getDriver();
	 * 
	 * //ElementFactory.initElements(driver, this); PageFactory.initElements(driver,
	 * this); }
	 */

	public String getTitle() {
		return driver.getTitle();
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	protected WebDriver getDriver() {
		return this.driver;
	}

	public void navigateBack() {
		driver.navigate().back();
	}

	public void navigateForward() {
		driver.navigate().forward();
	}

	public void refresh() {
		driver.navigate().refresh();
	}

}
