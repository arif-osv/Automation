package com.pages;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.factory.DriverFactory;
import com.qa.util.Basepage;
import com.qa.util.SeleniumUtility;
import com.qa.util.Waits;
public class Approvalpage  extends Basepage{
	//private WebDriver driver;
	
	public Approvalpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	//this.driver=driver;
	}
	
	
	@FindBy(xpath="//ul[@class='flex']//a[contains(text(),'payments')]")
	public static	WebElement payment;
	
	@FindBy(xpath="//ul[@class='flex']//a[contains(text(),'Payroll')]")
	public static	WebElement payroll;
	
	@FindBy(partialLinkText="Pending approvals (")
	public static	WebElement pendingApprovals;
	
	@FindBy(xpath="//ul[@class='flex']//a[contains(text(),'Beneficiaries')]")
	static	WebElement beneficiry;
	
	@FindBy(xpath="//a[contains(text(),'Pending approval')]")
	static WebElement pendingbeneficiry;
	
	@FindBy(partialLinkText ="Transfers")
	static	WebElement transfers;
	
	@FindBy(partialLinkText ="Beneficiary accounts")
	static WebElement Beneficirystab;
	
	@FindBy(xpath="//div[@class='actionSection']//div")
	static WebElement dotcursor;
	
	@FindBy(xpath="//nav[@class='topNav ']/child::ul/li[contains(.,'Overview')]")
	static WebElement overviewbutton;
	
	@FindBy(xpath="//div[contains(@class,'overview')]//div[1]//div[2]//div[2]//div[2]//button[1]")
	static	WebElement overviewApproveButton;
	
	@FindBy(partialLinkText = "Beneficiary accounts")
	static WebElement Beneficiryac;
	
	@FindBy(xpath="//textarea[@name='comments']")
	static	WebElement Commentsbox;
	
	@FindBy(xpath="//button[@type='submit']")
	static	WebElement Submitbutton;
	
	@FindBy(xpath="(//button[normalize-space()='Send'])[1]")
	static	WebElement Sendmoreinfobutton;
			
	@FindBy(xpath="//*[@id='root']/div/main/div/div/div/div[2]/div/div/div[3]/div[4]/div/div/div/div[1]/span")
	static WebElement otppopup;
	
	@FindBy(xpath="//*[@id='root']/div/main/div/div/div/div[2]/div/div/div[3]/div[4]/div/div/div/div[1]/span")
	static WebElement otppopuptwo;
	
	
	@FindBy(linkText = "History")
	static WebElement historytab;
	
	@FindBy(xpath="//div[@class='transcationTooltip']//div//ul//li[1]")
	 static WebElement approvebutton;
	
	@FindBy(xpath="//div[@class='rightPanel rightSideBlockWidth']//li[3]")
	static WebElement needmoreinfo;
	
	@FindBy(className="paymentOtp")
	WebElement approvebox;
	
	@FindBy(xpath="//button[@class='btn secondary']")
	static WebElement OverviewApprove;
	
	@FindBy(xpath="//div[@class='customReactTable']//div[1]//div[6]//div[1]//div[2]//span[1]")
	WebElement timeline;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
public static	WebElement continuepay;
	@FindBy(xpath="//input[@name='otp']")
	static WebElement otp;
	
	@FindBy(xpath="//div[@class='actionButtons isFlexColumn center']//button[@class='btn noBorder info']")
	static WebElement viewdetails;
	@FindBy(xpath="//button[@class='btn primary']")
	static WebElement submitinfo;
	@FindBy(xpath="//button[contains(text(),'Send')]")
	static WebElement sendinfo;
	
	
	
	
	public void approvallogic()
	{
		
		
		
		
	}
	
	public static void paymentApprove() throws InterruptedException
	{
		Thread.sleep(2000);
		payment.click();
		Thread.sleep(2000);
	
	//	await("Download did not complete within 20 seconds").atMost(20, TimeUnit.SECONDS).until(payment::getText, is("Complete!"));
		
		transfers.click();
		Beneficiryac.click();
		dotcursor.click();
		approvebutton.click();
		
		Commentsbox.click();
		Commentsbox.sendKeys("Approved");
		Submitbutton.click();
		Thread.sleep(2000);
		historytab.click();
		}
	
	public static void payrollApprove() throws InterruptedException
	{
		payroll.click();
		Thread.sleep(2000);
		pendingApprovals.click();
		dotcursor.click();
		approvebutton.click();
		
		Commentsbox.click();
		Commentsbox.sendKeys("Approved");
		Submitbutton.click();
		Thread.sleep(2000);
		}
	
	public static void ExecutorApprove() throws InterruptedException
	{
		payroll.click();
		Thread.sleep(2000);
		pendingApprovals.click();
		dotcursor.click();
		approvebutton.click();
		continuepay.click();
		otp.click();
		otp.sendKeys("123456");
		Submitbutton.click();
		}
	
	public void closepopup()
	{
		//Robot robot = new Robot ();
		//WebDriver driver = driver;
			
	
	}
	
	
	public  void paymentbuttonApproval(String Userone) throws InterruptedException
	{
		
		if(Userone.contains("Approve"))
		{
	Thread.sleep(2000);
		payment.click();
		Thread.sleep(2000);
	
		//await("Download did not complete within 20 seconds").atMost(20, TimeUnit.SECONDS)
        //.until(payment::getText, is("Complete!"));
		
		transfers.click();
		
		dotcursor.click();
		approvebutton.click();
		
		Commentsbox.click();
		Commentsbox.sendKeys("Approved");
		Submitbutton.click();
		Thread.sleep(2000);
		
		historytab.click();
		}
		else if(Userone.contains("Reject"))
		{
			System.out.println("Reject payment");
		}
		else if(Userone.contains("needmoreinfo"))
		{
			System.out.println("needmoreinfo payment");
		}
			}
	public void OverviewApprove() throws InterruptedException
	{
		overviewbutton.click();
		overviewApproveButton.click();
		//otp.click();
		//otp.sendKeys("123456");
		Submitbutton.click();
		}
	
	
	
	public static void OTPApproval() throws InterruptedException
	{
		Thread.sleep(3000);
		overviewbutton.click();
		//Thread.sleep(3000);
		//Beneficiryac.click();
		Thread.sleep(3000);
		overviewApproveButton.click();
		otp.click();
		otp.sendKeys("123456");
		Submitbutton.click();
		Thread.sleep(10000);
	//	DriverFactory.getDriver().findElement(By.xpath("//button[contains(text(),'View status')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)DriverFactory.getDriver(); 	
try
{
for (int i = 0; i < 4; i++) {
	

 WebElement myElement = DriverFactory.getDriver().findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]"));


 
 js.executeScript("arguments[0].click();", myElement);
 System.out.println("close popup trying "+i);
}}
catch(Exception e)
{
	System.out.println("pop up not interacting");
}
 
 try
 {
 
 Thread.sleep(3000);
 WebElement usertitle =DriverFactory.getDriver().findElement(By.xpath("//span[@class='userTitle']"));
	 js.executeScript("arguments[0].click();", usertitle);

	 WebElement signout =DriverFactory.getDriver().findElement(By.xpath("//h5[normalize-space()='Sign out']"));
	 js.executeScript("arguments[0].click();", signout);
 }
 catch(Exception e)
 {
	 DriverFactory.getDriver().quit(); 
 }



			
   	}
	public static void OTPApprovalThreetimes() throws InterruptedException
	{
		Thread.sleep(3000);
		overviewbutton.click();
		//Thread.sleep(3000);
		//Beneficiryac.click();
		Thread.sleep(3000);
		overviewApproveButton.click();
		otp.click();
		for (int i = 0; i < 4; i++) {

			otp.sendKeys("123406");
			Submitbutton.click();
		}
		Thread.sleep(3000);
		try
		{
		otppopup.click();
		}
		catch(Exception e)
		{
			
			
			System.out.println("There is no popup window");
		}
		}
	
	public void Beneficiry_CheckboxApproval() throws InterruptedException
	{
		dotcursor.click();
		approvebutton.click();
		Thread.sleep(3000);
		}

	
	
	
	
	public void Beneficiry_All()
	{
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//**************************************Need More Info**********************************//

	public static  void needmoreinfo() throws InterruptedException {

		Thread.sleep(2000);
		payment.click();
		Thread.sleep(2000);
	
	//	await("Download did not complete within 20 seconds").atMost(20, TimeUnit.SECONDS).until(payment::getText, is("Complete!"));
		
		transfers.click();
		Beneficiryac.click();
		dotcursor.click();
		needmoreinfo.click();

		Thread.sleep(2000);
		Commentsbox.sendKeys("plz send more info");
		Thread.sleep(2000);

		Sendmoreinfobutton.click();
		Thread.sleep(2000);
		historytab.click();
	

	}

	public static void sendmoreinfo() throws InterruptedException {
		Thread.sleep(5000);
		overviewbutton.click();
		Thread.sleep(2000);
		viewdetails.click();
		submitinfo.click();
		Thread.sleep(2000);
		Commentsbox.sendKeys("plz send more info");
		Thread.sleep(2000);

		sendinfo.click();
		
		
	}

	
	
	//**************************Beneficiries Approval Page ********************************//
	
	public void BeneficiryApproval(WebDriver driver) throws InterruptedException
	{
		SeleniumUtility.seleniumClick(driver, beneficiry);	

		SeleniumUtility.seleniumClick(driver, pendingbeneficiry);	
		Thread.sleep(3000);
	SeleniumUtility.seleniumClick(driver, dotcursor);
	SeleniumUtility.seleniumClick(driver, approvebutton);
	}
	
	
	//*********************************New code **********************//
	
	By DashboardbeneficiryApprove = By.xpath("//div[@class='actionButtons']//div//button[1]");
	By Dashboardbenfview = By.xpath("//div[@class='actionButtons']//div//button[2]");
	By DashBoardneedmoreinfo = By.xpath("(//button[normalize-space()='Need more info'])[1]");
	By DashBoardAprove=By.xpath("(//button[@class='btn success'])[1]");
	By DashBoardReject = By.xpath("//div[@class='sliderPopup popupContentSlideIn']//div[@class='paymentButtons']//button[@class='btn warning'][normalize-space()='Reject']");
	By RejectCommentBox = By.xpath("//textarea[@name='reject']");
	By SendButton = By.xpath("//button[normalize-space()='Send']");
	
	
	public void DashBoardApproveBeneficiry()
	{
		waitforElementclick(DashboardbeneficiryApprove);
		click(DashboardbeneficiryApprove);
		
	}
	public void DashBoardviewApproveBeneficiry()
	{
		click(Dashboardbenfview);
		click(DashBoardAprove);
	}
	public void DashBoardviewrejectBeneficiry() throws InterruptedException
	{
		waitforvisibility(Dashboardbenfview);
		click(Dashboardbenfview);
		
		waitforElementclick(DashBoardReject);
		click(DashBoardReject);
		type(RejectCommentBox, "Rejected");
		click(SendButton);
	}
	
	
}
