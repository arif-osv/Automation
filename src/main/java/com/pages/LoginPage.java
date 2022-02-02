package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.SeleniumUtility;
import com.qa.util.WaitFunctions;

public class LoginPage {

	private WebDriver driver;
	
	WaitFunctions w= new WaitFunctions();

	// 1. By Locators: OR
	private By emailId = By.name("userName");
	private By password = By.name("password");
	private By signInButton = By.xpath("/html/body/div/div/main/div/form/button");
	private By forgotPwdLink = By.linkText("Forgot your password?111");
	private By usertitle = By.xpath("//span[@class='userTitle']");
	private By signout = By.xpath("//h5[normalize-space()='Sign out']");
	
	@FindBy(name="userName")
	WebElement username;

	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}

	public void enterUserName(String username) {
		
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void userlogo() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='username']")).click();
	}
	
	public void Paymentpopup() throws InterruptedException
	{
		Thread.sleep(5000);
		
		try
		{
		WebElement myElement = 	driver.findElement(By.xpath("//h3[normalize-space()='Create Beneficiary accounts Payment']//span"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", myElement);
		}
		catch(Exception e)
		{
			System.out.println("unale to close popup");
		}
	
	}
	
	public void popup() throws InterruptedException
	{
		for (int i = 0; i < 5; i++) {
			
		
		try
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
			
		}
		
		catch(Exception e)
		{
			System.out.println("Pop up are closed");
		}
		
		}
		
		
		
	}

	public void bankaccounts()
	{
		driver.findElement(By.xpath("//div[@class='isFlex settingsAlign settingBrdrBtm Cursor']//div[2]")).click();
	}
	
	public void ExistingBankNames() throws InterruptedException
	{
		Thread.sleep(10000);
		List<WebElement> banknames= driver.findElements(By.xpath("//*[@id='root']/div/main/div/div/div/div[2]/div/div/div/div[1]/div/span/span"));
		
		Thread.sleep(10000);
		
		for (int i = 0; i < banknames.size(); i++) {
			Thread.sleep(10000);
			System.out.println(banknames.get(i).getText());
			
			
		}
	}

	

	
	
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}

	public Paymentpage doLogin(String un, String pwd) throws InterruptedException {
		System.out.println("login with: " + un + " and " + pwd);
		w.waitForElement(username);
		driver.findElement(emailId).sendKeys(un);
		Thread.sleep(4000);
		driver.findElement(password).sendKeys(pwd);
		Thread.sleep(4000);
		driver.findElement(signInButton).click();
		Thread.sleep(4000);
		return new Paymentpage(driver);
	}
	public Paymentpage LogoutApplication() throws InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement myElement = 	driver.findElement(usertitle);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", myElement);
		WebElement signo = 	driver.findElement(signout);
		executor.executeScript("arguments[0].click();", signo);
		
		
	
		
		
		return new Paymentpage(driver);
	}}
