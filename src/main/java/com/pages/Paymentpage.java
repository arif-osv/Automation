package com.pages;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Faker;
import com.qa.util.SeleniumUtility;
import com.qa.util.WaitFunctions;
import com.qa.util.Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Paymentpage {
	public WebDriver driver;

	SeleniumUtility se = new SeleniumUtility();
	WaitFunctions wait = new WaitFunctions();

	public Paymentpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//nav/ul/li/a[contains(@href,'/payments')]")
	WebElement paymentlink;
	
	@FindBy(xpath="//a[@href='/payments/bulkTransfers']")
	WebElement bulktransfer;
	
	@FindBy(xpath="(//a[normalize-space()='Upload payments'])[1]")
	WebElement uploadbulk;
	
	@FindBy(xpath = "//ul[@class='flex']//a[contains(text(),'payments')]")
	public static WebElement payment;

	@FindBy(partialLinkText = "Transfers")
	public static WebElement transfers;

	@FindBy(xpath = "//h4[contains(text(),'Create payment')]")
	public static WebElement QuickPayment;

	@FindBy(partialLinkText = "Schedule payments")
	public static WebElement Schedulepayment;
	
	@FindBy(css="a[class='activeSubMenu']")
	public static WebElement Scheduletransfertab;

	@FindBy(partialLinkText = "Same bank")
	public static WebElement samebank;

	@FindBy(xpath = "//button[normalize-space()='+ Create payment']")
	public static WebElement createpayment;

	@FindBy(xpath = "//button[@class='btn createBtn ']")
	public static WebElement CreateSchedulepayment;

	@FindBy(xpath = "(//div[@class='name-select__value-container css-1hwfws3'])[1]")
	public static WebElement fromac;
	
	@FindBy(xpath="//div[@class='isDropdownPlaceholder']")
	public static WebElement debitaccount;
	

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129123')]")
	public static WebElement fromacno;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SA7580000260752019000935')]")
	public static WebElement samebankacno;

	// By Header=By.xpath("//div[@class='selectOptionFont
	// css-2b097c-container']//*[contains(text(),"+Fromac+")]");

	@FindBy(xpath = ("//input[@name='creditAccount']//preceding-sibling::div"))
	public static WebElement benfone;

	@FindBy(xpath = "//form[@action='#']//div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public static WebElement beneficiryac;

	@FindBy(xpath = ("//input[@name='debitAccount']//preceding-sibling::div"))
	public static WebElement benf;

	@FindBy(xpath = ("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129115')]"))
	public static WebElement benfno;

	@FindBy(xpath = ("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129123')]"))
	public static WebElement credacno;

	@FindBy(name = "amount")
	public static WebElement amount;

	@FindBy(xpath = "//div[contains(text(),'How often?')]")
	public WebElement howoften;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Select')]")
	public static WebElement POR;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]")
	public static WebElement PORcode;

	@FindBy(xpath = "//textarea[@name='description']")
	public static WebElement testarea;

	@FindBy(xpath = "//button[contains(text(),'Add to payments')]")
	public static WebElement addpayment;

	@FindBy(xpath = "//button[contains(text(),'Schedule payment')]")
	public static WebElement schedulepaybutton;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[2]")
	public static WebElement checkBoxone;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	public static WebElement checkBoxtwo;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[5]")
	public static WebElement checkBoxthree;

	@FindBy(xpath = "//button[contains(text(),'Proceed')]")
	public static WebElement Proceed;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public static WebElement Approve;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Approvesecondbutton;

	@FindBy(xpath = "//div[@class='chooseOtpAuth']")
	public static WebElement Authentication;

	@FindBy(xpath = "//input[@name='otp']")
	public static WebElement otp;

	@FindBy(xpath = "//i[@class='icon icon-down-arrow']")
	public static WebElement DatatableArrow;

	@FindBy(xpath = "//div[contains(@class,'table-th schedulePayStatus')]//div[2]//input[1]")
	public static WebElement MonthlySection;

	@FindBy(xpath = "//span[@class='tableDataSubTitle dateTimeColor']//span")
	public static WebElement Monthdata;

	@FindBy(xpath = "//span[@class='filterBtn']//span[2]")
	public static WebElement Monthdatapopup;

	@FindBy(xpath = "//input[@placeholder='Search beneficiary name']")
	public static WebElement Beneficiryname;

	@FindBy(partialLinkText = "Beneficiary accounts")
	public static WebElement BeneficiryAccount;

	@FindBy(partialLinkText = "Beneficiary accounts")
	static WebElement Beneficiryac;
	
	@FindBy(xpath="//div[@class='tableBody']//div[2]//div[6]//span[2]")
	static WebElement amounttag;

	@FindBy(xpath = "//textarea[@name='comments']")
	static WebElement Commentsbox;

	@FindBy(xpath = "//button[@type='submit']")
	static WebElement Submitbutton;

	@FindBy(xpath = "//div[@class='actionSection']//div")
	static WebElement dotcursor;

	@FindBy(linkText = "History")
	static WebElement historytab;

	@FindBy(xpath = "//div[@class='transcationTooltip']//div//ul//li[1]")
	static WebElement approvebutton;
	
	static Random random=new Random();
	public static int num = random.nextInt(90) + 10;
	public static String a = "";

	public Paymentpage paymentlink() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		payment.click();
		Thread.sleep(3000);
		return new Paymentpage(driver);
	}

	public Paymentpage SchedulePaymentlink() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Schedulepayment.click();
		Scheduletransfertab.click();
		return new Paymentpage(driver);
	}

	public Paymentpage Monthdatatable() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".icon.icon-down-arrow")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='listOfItems']//div[1]//input[1]")).click();
		Thread.sleep(2000);
		return  new Paymentpage(driver);
		
	}
	public Paymentpage monthdatahistory()
	{
		List<WebElement> month=driver.findElements(By.xpath("//span[@class='paySuccess']"));
		
		for (WebElement ver : month) {
		String text =ver.getText();
			System.out.println("Text is"+text);
			assertEquals(true, text);

			
		}
		
		
		return new Paymentpage(driver);
		
		
	}
	
	
	public Paymentpage DatatableSearch() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DatatableArrow.click();
		MonthlySection.click();
		return new Paymentpage(driver);
	}

	public Paymentpage DatatableBeneficirySearch() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Beneficiryname.click();
		Beneficiryname.sendKeys("Alrajhi");
		return new Paymentpage(driver);
	}

	public Paymentpage Monthdata() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean Monthdat = Monthdata.getText().contains("Monthly");

		assertEquals(true, Monthdat);

		Thread.sleep(3000);
		return new Paymentpage(driver);
	}

	public Paymentpage Monthdataclosebutton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		boolean Monthdat = Monthdatapopup.getText().contains("Monthly");

		// assertEquals(true, Monthdat);
		Monthdatapopup.click();
		Thread.sleep(5000);

		return new Paymentpage(driver);
	}

	public Paymentpage payment() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		payment.click();
		transfers.click();
		Thread.sleep(2000);
		BeneficiryAccount.click();

		Thread.sleep(10000);
		return new Paymentpage(driver);
	}

	public Paymentpage BulkPaymentCheckBoxes() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		 checkBoxone.click();
		 Thread.sleep(3000);
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", checkBoxtwo);
		  Thread.sleep(3000); 
		  ((JavascriptExecutor)
		  driver).executeScript("arguments[0].click();", checkBoxthree);
		  Thread.sleep(3000);
		 
		return new Paymentpage(driver);

	}

	public Paymentpage BulkApprove() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Proceed.click();
		Thread.sleep(2000);
		Approve.click();
		Thread.sleep(2000);
		if (Authentication.isDisplayed() == true) {
			Approvesecondbutton.click();
			Thread.sleep(10000);

			otp.click();
			otp.sendKeys("123456");
			Approvesecondbutton.click();

		} else {
			Approvesecondbutton.click();
			Thread.sleep(10000);

		}
		return new Paymentpage(driver);
	}

	// ******************************Company Payments
	// flow*****************************//

	public Paymentpage Beneficirypayments(String TransferType, String Fromac, String Toacc, String Amount)
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		Thread.sleep(2000);

		if (TransferType.contains("Same Bank")) {
			driver.findElement(By.xpath("//input[@name='transfer_type'][@value='INTERBANK']")).click();
		} else if (TransferType.contains("Local")) {
			driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")).click();

		} else if (TransferType.contains("International")) {
			driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SWIFT']")).click();

		}

		// fromac.click();
		Thread.sleep(2000);

		By Header = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + Fromac + "')]");

		Thread.sleep(2000);
		By toacc = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + Toacc + "')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		// driver.findElement(Header).click();
		// fromacno.click();

		/*
		 * Thread.sleep(3000); if (TransferType.contains("Own accounts")) {
		 * benfone.click(); } else { benf.click(); }
		 */
		benf.click();
		Thread.sleep(3000);
		driver.findElement(Header).click();
		Thread.sleep(2000);
		beneficiryac.click();
		driver.findElement(toacc).click();

		amount.click();
		amount.sendKeys(Amount);
		POR.click();
		driver.findElement(PORCODE).click();

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(5000);

		return new Paymentpage(driver);
	}

	// ******************************Alinma bank
	// Restriction****************************//

	public void Alinmaaccount() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SWIFT']")).click();
		Thread.sleep(2000);
		By Header = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'68200059703000')]");

		Thread.sleep(2000);
		benf.click();
		Thread.sleep(3000);
		driver.findElement(Header).click();
		Thread.sleep(2000);

	}

	// ****************************************Description more than 100
	// char********************************//
	@SuppressWarnings("static-access")
	public void Bank_Description() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SWIFT']")).click();

		Thread.sleep(2000);

		testarea.click();
		Faker faker = new Faker();
		testarea.sendKeys(faker.number().digits(109));

	}
	// *********************Quick links to payment
	// Creation*****************************//

	public void quicklinkPayment() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		QuickPayment.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='INTERBANK']")).click();
		// driver.findElement(By.partialLinkText(TransferType)).click();
		By Header = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'204000010006085129123')]");

		Thread.sleep(2000);
		By toacc = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SA7580000260752019000935')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");

		benf.click();
		Thread.sleep(3000);
		driver.findElement(Header).click();
		Thread.sleep(2000);
		beneficiryac.click();
		driver.findElement(toacc).click();

		amount.click();
		amount.sendKeys("67");
		POR.click();
		driver.findElement(PORCODE).click();

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(5000);

	}

	public Paymentpage OwnAccounts(String combinedview, String BeneficiryAccounts, String TransferType, String Fromac,
			String Toacc, String Amount) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);
		if (combinedview.contains("Yes") & (BeneficiryAccounts.contains("Yes"))) {
			Thread.sleep(2000);
			System.out.print("click on beneficiry account");
			// driver.findElement(By.partialLinkText(TransferType)).click();
			Thread.sleep(2000);
			BeneficiryAccount.click();
			Thread.sleep(2000);
			createpayment.click();
			Thread.sleep(2000);
			/*
			 * if(TransferType.contains("Same Bank")) { driver.findElement(By.xpath(
			 * "//input[@name='transfer_type'][@value='INTERBANK']")).click(); } else
			 * if(TransferType.contains("Local")) {
			 * driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")
			 * ).click();
			 * 
			 * } else if(TransferType.contains("International")) {
			 * driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SWIFT']")
			 * ).click();
			 * 
			 * }
			 */
		}
		createpayment.click();

		fromac.click();

		By Header = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + Fromac + "')]");
		By toacc = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + Toacc + "')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		driver.findElement(Header).click();
		// fromacno.click();

		Thread.sleep(3000);
		if (TransferType.contains("Own accounts")) {
			benfone.click();
		} else {
			benf.click();
		}
		Thread.sleep(3000);
		driver.findElement(toacc).click();
		// benfno.click();
		amount.click();
		amount.sendKeys(Amount);
		POR.click();
		driver.findElement(PORCODE).click();

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(2000);

		return new Paymentpage(driver);
	}

	// ************************Hard Coded Payment Creation Flow
	// ***********************//
	
	
	
	public Paymentpage AlrajhitoOwnbeneficiries() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.print("click on beneficiry account");
		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")).click();

		Thread.sleep(3000);

		debitaccount.click();
		
		driver.findElement(By.xpath("//div[@title='ALRAJHI']/following-sibling :: div/span")).click();
		Thread.sleep(2000);

		
		
		
		By Header = By.xpath(
				"//span[@class='benName'][normalize-space()='Alrajhione']");
		By toacc = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SA3080004499608018880245')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		
		driver.findElement(Header).click();
		// fromacno.click();
		Thread.sleep(2000);
		beneficiryac.click();

		Thread.sleep(3000);
		driver.findElement(toacc).click();
		// benfno.click();
		amount.click();
		

		amount.sendKeys(Integer.toString(num));
		POR.click();
		driver.findElement(PORCODE).click();

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(2000);
		return new Paymentpage(driver);

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public Paymentpage AlrajhitoAlrajhiAccountHolders() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.print("click on beneficiry account");
		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")).click();

		Thread.sleep(3000);

		debitaccount.click();
		
		driver.findElement(By.xpath("//div[@title='ALRAJHI']/following-sibling :: div/span")).click();
		Thread.sleep(2000);

		
		
		
		By Header = By.xpath(
				"//span[@class='benName'][normalize-space()='Alrajhione']");
		By toacc = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SA1780000555608010132339')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		
		driver.findElement(Header).click();
		// fromacno.click();
		Thread.sleep(2000);
		beneficiryac.click();

		Thread.sleep(3000);
		driver.findElement(toacc).click();
		// benfno.click();
		amount.click();
		

		amount.sendKeys(Integer.toString(num));
		try
		{
		POR.click();
		driver.findElement(PORCODE).click();
		}
		catch (Exception e)
		{
			System.out.println("No POR code");
		}
		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(2000);
		return new Paymentpage(driver);

	}

	public static void paymentApprove() throws InterruptedException {
		Thread.sleep(2000);
		
		System.out.println("Payment amount is"+num);
		payment.click();
		Thread.sleep(2000);

		// await("Download did not complete within 20 seconds").atMost(20,
		// TimeUnit.SECONDS).until(payment::getText, is("Complete!"));

		transfers.click();
		Beneficiryac.click();
		
		Thread.sleep(2000);
		
		dotcursor.click();
		Thread.sleep(2000);
		approvebutton.click();
		Thread.sleep(2000);
		Commentsbox.click();
		Thread.sleep(2000);
		Commentsbox.sendKeys("Approved");
		Submitbutton.click();
		Thread.sleep(2000);
		historytab.click();
	}

	// *****************************************NCB to
	// Alrajhi****************************//

	public Paymentpage NCBtoAlrajhi() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.print("click on beneficiry account");
		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")).click();

		Thread.sleep(3000);

		debitaccount.click();

		By Header = By
				.xpath("(//div[contains(@class,'inputList Cursor')])[2]");
		By toacc = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SA7580000260752019000935')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		driver.findElement(Header).click();
		// fromacno.click();
		Thread.sleep(2000);
		beneficiryac.click();

		Thread.sleep(3000);
		driver.findElement(toacc).click();
		// benfno.click();
		amount.click();
		amount.sendKeys("18");
		POR.click();
		driver.findElement(PORCODE).click();

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(2000);
		return new Paymentpage(driver);

	}

	// **************************************ICICI to Yes
	// Bank*****************************//
	
	public void paymentdetailtab() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'table-tr')])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".isBenDetailesTitle")).isDisplayed();
		Thread.sleep(2000);
	
	}
	
	public void beneficirydetail() throws InterruptedException 
	{
		driver.findElement(By.cssSelector(".isBenDetailesTitle")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".isBenDetailesTitle")).click();
		Thread.sleep(2000);

	}
	public void Beneficiryname()
	{
	Boolean el=	driver.findElement(By.cssSelector(".isBeneficiaryName")).isDisplayed();
	if(el==true)
				{
			System.out.println("Beneficiry name is displayed");
				
				}
	else
	{
		System.out.println("Beneficiry name not displaying");
	}
	}
	
	public void bankaccountdetails()
	{
		
		Boolean el=	driver.findElement(By.cssSelector(".title.mb-2")).isDisplayed();
	if(el==true)
				{
			System.out.println("Account name is displayed");
				
				}
	else
	{
		System.out.println("Beneficiry name not displaying");
	}
	}
	
	public void paymenthistorytab()
	{
		driver.findElement(By.cssSelector("button[class='btn createBtn']")).isDisplayed();
	}
	
	public void paymentHistory() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class='btn createBtn']")).click();
	}
	
	
	
	
	
	
	
	
	
	

	public Paymentpage ICICItoYesBank() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.print("click on beneficiry account");
		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")).click();

		Thread.sleep(3000);
debitaccount.click();
		
		By Header = By
				.xpath("//div[contains(text(),'(00045...00301)')]");
		By toacc = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'026291800001091')]");
		driver.findElement(Header).click();
		// fromacno.click();
		Thread.sleep(2000);
		fromac.click();

		//beneficiryac.click();

		Thread.sleep(3000);
		driver.findElement(toacc).click();
		// benfno.click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'NEFT')]")).click();
		amount.click();
		amount.sendKeys("18");

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(2000);
		return new Paymentpage(driver);

	}

	public Paymentpage InternatinalPayment() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		se.seleniumClick(driver, payment);
		payment.click();
		transfers.click();
		Thread.sleep(2000);

		Thread.sleep(2000);
		System.out.print("click on beneficiry account");
		// driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
		BeneficiryAccount.click();
		Thread.sleep(2000);
		createpayment.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SWIFT']")).click();

		Thread.sleep(3000);

		debitaccount.click();

		By Header = By
				.xpath("//div[contains(text(),'(05100...96502)')]");
		By toacc = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'SE3550000000054910000003')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Buying Goods')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 45);
		wait.until(ExpectedConditions.elementToBeClickable(Header));
		
		driver.findElement(Header).click();
		// fromacno.click();
		Thread.sleep(2000);
		beneficiryac.click();

		Thread.sleep(3000);
		driver.findElement(toacc).click();

		WebElement mainMenu = driver.findElement(By.xpath(
				"//div[@class='selectOptionFont amountFiledWidth css-2b097c-container']//div[contains(@class,'css-1hwfws3')]"));
		Thread.sleep(2000);
		mainMenu.click();
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("//div[contains(text(),'INR')]"));
		try {
			c.click();
		} catch (Exception e) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", c);
		}

		// benfno.click();
		amount.click();
		amount.sendKeys("18");
		POR.click();
		driver.findElement(PORCODE).click();

		testarea.click();
		testarea.sendKeys("testing");
		addpayment.click();
		Thread.sleep(5000);
		return new Paymentpage(driver);

	}

	public Paymentpage SchedulePayment(String TransferType, String Fromac, String Toacc, String Amount)
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		payment.click();
		Schedulepayment.click();
		CreateSchedulepayment.click();
		benf.click();
		benfno.click();
		fromac.click();

		Thread.sleep(2000);
		credacno.click();

		amount.click();
		amount.sendKeys("30");
		Thread.sleep(2000);
		howoften.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Weekly')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Mon')]")).click();

		POR.click();
		PORcode.click();
		testarea.click();
		testarea.sendKeys("testing");
		schedulepaybutton.click();
		Thread.sleep(2000);

		return new Paymentpage(driver);
	}

	public Paymentpage SchedulePaymentmonthly(String TransferType, String Fromac, String Toacc, String Amount)
			throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		payment.click();
		Schedulepayment.click();
		CreateSchedulepayment.click();
		benf.click();
		benfno.click();
		fromac.click();

		Thread.sleep(2000);
		credacno.click();

		amount.click();
		amount.sendKeys("30");
		Thread.sleep(2000);
		howoften.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Monthly')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Select...')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'css-1uccc91-singleValue')][normalize-space()='2'])[1]"))
				.click();

		POR.click();
		PORcode.click();
		testarea.click();
		testarea.sendKeys("testing");
		schedulepaybutton.click();
		Thread.sleep(2000);

		return new Paymentpage(driver);
	}

	// *****************************************Bulk Upload ************************//
	
	Waits w= new Waits();
	public void PaymentandBulkpayment() throws InterruptedException
	{
		w.waitForElementToBeVisible(driver, paymentlink, 20);
		paymentlink.click();
		wait.waitForElement(paymentlink).click();
		wait.waitForElement(bulktransfer).click();
	
	}
	
	public void uploadbulk() throws InterruptedException
	{
		
		wait.waitForElement(uploadbulk).click();
			
	}
	
	@FindBy(xpath="//span[@class='selectedItem']")
	WebElement selectdebitac;
	
	@FindBy(xpath="//input[@name='all']")
	WebElement allaccounts;
	
	@FindBy(xpath="//input[@id='fileName']")
	WebElement PaymentSheet;
	
	@FindBy(css="textarea[placeholder='Write description']")
	WebElement Description;
	
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clearbulkdata;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement bulksubmit;
	
	
	
	 public void selectDebitaccount() throws InterruptedException
	 {
		 wait.waitForElement(selectdebitac).click();
		 wait.waitForElement(allaccounts).click();
		 wait.waitForElement(selectdebitac).click();
			

	 }
	 public void selectDebitaccountsecond() throws InterruptedException
		 
	 {
		 wait.waitForElement(selectdebitac).click();
		 wait.waitForElement(allaccounts).click();
		 wait.waitForElement(allaccounts).click();
		 wait.waitForElement(selectdebitac).click();
			

	 }
	    public void selectpaymentsheet() throws InterruptedException
	    {
	    	Thread.sleep(2000);
	    	//JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	//executor.executeScript("arguments[0].click();", PaymentSheet);
	    PaymentSheet.sendKeys("C:\\Users\\Varuna\\Desktop\\Bulkpayments.xlsx");
	 	}
	    public void paymentduedate() throws InterruptedException
	    {
	    	Thread.sleep(4000);

			DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");

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
	    }
	    public void description_English() throws InterruptedException
	    {
	    	
	    	 wait.waitForElement(Description).click();
	    	 wait.waitForElement(Description).sendKeys("Testing");
	 	 	
	    }
	    public void description_Arabic() throws InterruptedException
	    {
	    	Thread.sleep(4000);
			driver.findElement(By.cssSelector("textarea[placeholder='Write description']")).click();
			WebElement createac = driver.findElement(By.cssSelector("textarea[placeholder='Write description']"));
			createac.sendKeys("تطبيق اختبار عرض واحد");
		
	    }
	    public void clearbulkdata() throws InterruptedException
	    {
	    	 wait.waitForElement(clearbulkdata).click();
		    	}

	    public void uploaddata() throws InterruptedException
	    {
	    	 wait.waitForElement(bulksubmit).click();
			    
	    }
	public void acceptandupload() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='btn-primary btn-approve w-100 uploadButton']")).click();
		Thread.sleep(20000);
	}
	
	public void overviewlink() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/user_overview']")).click();
	}
	
	public void bulkapprovebutton() throws InterruptedException
	{
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
		
	}
	public void commentsonapprovebox() throws InterruptedException
	{
	
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("textarea[name='comments']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[name='comments']")).sendKeys("Bulk approved");
		
	}
	public void bulkpayment() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='upcoming']/div/div[2]/button[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/aside[2]/div[1]/div[2]/div[2]/div/button[1]")).click();
		Thread.sleep(2000);
		
	}
	public void Approvebox() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);
	
		
	}
	
	public void uploadtextverify() throws InterruptedException
	{
		Thread.sleep(5000);
		String text =driver.findElement(By.xpath("//h1[contains(text(),'Upload successful')]")).getText();
		System.out.println("Text present is "+text);
	}
	
	public void Description()
	{
		String description = driver.findElement(By.cssSelector("textarea[placeholder='Write description']")).getText();
		  Assert.assertEquals(description, "Write description");
	}
	
	
	
	
	
	

	public Paymentpage Bulkupload() throws InterruptedException {
		Thread.sleep(4000);

		driver.findElement(By.xpath("//nav/ul/li/a[contains(@href,'/payments')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@href='/payments/bulkTransfers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[normalize-space()='Upload payments'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='selectedItem']")).click();
		Thread.sleep(2000);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='all']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class='selectedItem']")).click();
//driver.findElement(By.xpath("//input[@type='file']")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Varuna\\Desktop\\Bulkpayments.xlsx");

		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='dueDate']")).click();
		Thread.sleep(2000);

		Thread.sleep(4000);

		DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");

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

//driver.findElement(By.xpath("//div[@aria-label='Choose Monday, July 26th, 2021']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@placeholder='Write description']")).click();
		WebElement createac = driver.findElement(By.xpath("//textarea[@placeholder='Write description']"));
//.until(ExpectedConditions.elementToBeClickable(createac));
		createac.sendKeys("Test");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait w = new WebDriverWait(driver, 60);

		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@class='btn-primary btn-approve w-100 uploadButton']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[normalize-space()='View status'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='otp']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='otp']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(10000);
	//	driver.findElement(By.xpath("//button[contains(text(),'View status')]")).click();
		Thread.sleep(4000);

		return new Paymentpage(driver);

	}

}
