package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OverviewPage {
	private WebDriver driver;

	public OverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Overview']")
	public WebElement Overviewbutton;
	
	@FindBy(xpath="//span[contains(@class,'liveData')]")
	public WebElement livebalance;

	private String RequiredSystemNameXpath = "//a[contains(text(),'xxxxx')]";

	private WebElement prepareWebElementWithDynamicXpath(String xpathValue, String substitutionValue) {

		return driver.findElement(By.xpath(xpathValue.replace("xxxxx", substitutionValue)));
	}

	public void deleteSystem(String systemName) {

		WebElement RequiredSystemName = prepareWebElementWithDynamicXpath(RequiredSystemNameXpath, systemName);
		
		RequiredSystemName.click();

	}
@FindBy(xpath="//span[contains(@class,'balAmount')]//span[contains(@class,'amountNo')]")
public WebElement currentBalance;
	@FindBy(xpath = "//a[contains(text(),'See all Transactions')]")
	public WebElement SeeAlltransactiontab;

	@FindBy(xpath = "//div[contains(text(),'You can see all transactions till last year')]")
	public WebElement transactionmsg;

	public void overview() {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(Overviewbutton));
		Overviewbutton.click();
	}

	public void seeAllTransaction() {
		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(SeeAlltransactiontab));
		// SeeAlltransactiontab.click();
		deleteSystem("See all Transactions");
		
	}

	public void Transactiontab() {

		WebDriverWait w = new WebDriverWait(driver, 30);
		w.until(ExpectedConditions.elementToBeClickable(transactionmsg));
		transactionmsg.getText();

		Boolean msg = transactionmsg.isDisplayed();
		if (msg == true) {
			System.out.println("Transaction tab Navigated");

		} else {
			System.out.println("not navigated");
		}

	}

	public void GroupofCompanys() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> l = driver
				.findElements(By.xpath("//div[@class='swiper-wrapper']/div/div/div/div[2]/div/div[1]"));

		if (l.size() != 0) {

			System.out.println("All other Companys are showing");
		} else {
			System.out.println("Plz Check If we are enter the Group user or Not");
		}
	}
	public void currentbalance()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		if(currentBalance.getText()!=null )
		{
			System.out.print("Balance is showing");
		}
		else
		{
			System.out.println("Balance not showing");
		}
	}
		public void livebalance()
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			if(livebalance.isEnabled())
			{
				livebalance.click();
				System.out.print("Balance is showing");
			}
			else
			{
				System.out.println("Balance not showing");
			}
		}
		public void allcompanybalance()
		{
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
			List<WebElement> companybalances = driver.findElements(By.xpath("//aside[@class='leftColumn']//div[1]//div[1]//div[1]//div"));
			for (WebElement e : companybalances) {
				e.getText();
				System.out.println(e.getText());
			}
			
		}
			
		}
	
	


