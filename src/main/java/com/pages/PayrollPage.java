package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.util.SeleniumUtility;

public class PayrollPage {

	private WebDriver driver;

	SeleniumUtility se = new SeleniumUtility();
	BeneficiryPage bnf = new BeneficiryPage(driver);

	public PayrollPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Payroll')]")
	public static WebElement Payroll;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Select')]")
	public static WebElement DebitAccount;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Alrajhitwo')]")
	public static WebElement DebitAccountNo;
	@FindBy(id="fileName")
	public static WebElement AttachSheetss;
	
	
	
	@FindBy(xpath="//td[normalize-space()='Approver']/following-sibling::td[1]/button")
	public static WebElement userrole;
	
	@FindBy(xpath="//input[@name=' Add Payroll Payments']")
	public static WebElement addpayroll;
	
	@FindBy(xpath="//a[normalize-space()='Upload sheet']")
    public static WebElement uploadsheet;	
	
	@FindBy(xpath="//input[@name='corporateCommercialRegistrationNumber']")
	public static WebElement corporateno;
	
	@FindBy(xpath="//div[normalize-space()='Min 4 and Max 15 characters allowed']")
	public static WebElement errormsg;
	
	@FindBy(xpath="//h1[normalize-space()='Upload new payroll']")
	public static WebElement newsheettext;
	
	@FindBy(xpath="//button[normalize-space()='Clear']")
	public static WebElement clearbutton;
	

	@FindBy(xpath="//button[normalize-space()='Continue']")
	public static WebElement continuebutton;
	
	@FindBy(xpath="//button[normalize-space()='Upload']")
	public static WebElement uploadbutton;
	
	@FindBy(partialLinkText ="Upload sheet")
	public static WebElement uploadpayrollsheet;
	
	@FindBy(xpath="(//div[@class='sectionAccounts'])[1]/div/strong")
	public static WebElement Accountnumber;
	
	@FindBy(xpath="(//div[@class='sectionAccounts'])[2]/div/strong")
	public static WebElement employees;
	
	@FindBy(xpath="(//div[@class='sectionAccounts'])[3]/div/strong")
	public static WebElement paymentduedate;
	
	public void checkbox() throws InterruptedException
	{
		
		Thread.sleep(2000);
		
		
		if ( !addpayroll.isSelected() )
		{
			addpayroll.click();
		}
		else
			{
			System.out.println("already selected");
			}
			}
	public void uploadsheetbutton()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		uploadpayrollsheet.click();
		
	}
	
	public void uploadcontinue()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
uploadbutton.click();
		
	}
	public void uploadsheet()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		uploadsheet.click();
		newsheettext.isDisplayed();
	}
	public void corpnumber()
	{
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
corporateno.sendKeys("123");
errormsg.isDisplayed();
corporateno.sendKeys("12323412340090909890");
errormsg.isDisplayed();
		
	}
	
	public void cancelbutton()
	{
		clearbutton.click();
	}
	public void continuebutton()
	{
		continuebutton.click();
	}
	
	public void accountnumber()
	{
		Accountnumber.isDisplayed();
	}
	public void numberemployess()
	{
		employees.isDisplayed();
	}
	public void paymentduedate()
	{
		paymentduedate.isDisplayed();
	}
	
	
	
	
	
	
	
	public void enterdata() throws InterruptedException, IOException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[normalize-space()='Payroll']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'NCB - 05100...96502')]")).click();
		Thread.sleep(3000);

//plz update emp data
		bnf.updateEmpdata();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Varuna\\Desktop\\payroll_sheet.xlsx");

		DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");

			Thread.sleep(2000);
			Date currentDate = new Date();
			System.out.println(dateFormat.format(currentDate));

			// convert date to calendar
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);

			c.add(Calendar.DATE, 5); // convert calendar to date Date
			Date currentDatePlusOne = c.getTime();
			String currentDat = dateFormat.format(currentDatePlusOne);
			driver.findElement(By.xpath("//input[@name='dueDate']")).sendKeys(currentDat);
			Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='corporateCommercialRegistrationNumber']")).sendKeys("345455");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='molCorporateID']")).sendKeys("123412312987345455");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Write description']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Write description']")).sendKeys("Testing");
		Thread.sleep(3000);


	}
	
	public void approval() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		userrole.click();
		Thread.sleep(4000);
	}
	
	
	public void clickonpayroll() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Payroll.click();
		
	}

	public void DebitAccount() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DebitAccount.click();
		Thread.sleep(4000);
		DebitAccountNo.click();
		Thread.sleep(4000);
		
	}

	public void AttachSheet() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		// click on fileupload button
	//	AttachSheetss.click();

Actions builder = new Actions(driver);

builder.moveToElement(driver.findElement(By.id("fileName"))).click().build().perform();
		// creating object of Robot class
		Robot rb = new Robot();

		// copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\Varuna\\Desktop\\payroll_sample.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		// press Contol+V for pasting
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@name='dueDate']")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.
		  xpath("//div[@aria-label='Choose Sunday, October 31st, 2021']")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//textarea[@placeholder='Write description']")).
		  click(); WebElement createac =
		  driver.findElement(By.xpath("//textarea[@placeholder='Write description']"));
		  //.until(ExpectedConditions.elementToBeClickable(createac));
		  createac.sendKeys("Test");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  WebDriverWait w = new WebDriverWait(driver, 20);

	
	}
}
