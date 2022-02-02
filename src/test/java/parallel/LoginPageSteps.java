package parallel;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Approvalpage;
import com.pages.BankAccounts;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.Paymentpage;
import com.qa.factory.DriverFactory;
import com.qa.util.WaitFunctions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	
	WaitFunctions w= new WaitFunctions();

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private Paymentpage paymentpage = new Paymentpage(DriverFactory.getDriver());
	private Approvalpage approvalpage = new Approvalpage(DriverFactory.getDriver());
	private DashBoardPage dashBoardPage = new DashBoardPage(DriverFactory.getDriver());
	private BankAccounts BankAccount = new BankAccounts();

	@Given("^user is on OSV login page$")
	public void user_is_on_login_page() {

		DriverFactory.getDriver().get("https://uat.onesingleview.com");

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	
	}

	@Then("^user logout application$")
	public void user_logout_application() throws InterruptedException {
		loginPage.LogoutApplication();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
	}


	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters username {string},{string},{string},{string},{string},{string},{string}")
	public static void user_enters_username(String Payment, String UsernameOne, String UsernameTwo,
			String Usernamethree, String Usernamefour, String Usernamefive, String Usernamesix)
			throws InterruptedException {
		Thread.sleep(3000);
		List<String> data = new ArrayList<>();

		if (Payment != null && Payment != "") {
			data.add(Payment);
		}
		data.add(UsernameOne);
		data.add(UsernameTwo);
		data.add(Usernamethree);
		data.add(Usernamefour);
		data.add(Usernamefive);
		data.add(Usernamesix);
		// if(Payment.equalsIgnoreCase("Usernamethree"))
		/*
		 * { loginPage.enterUserName(Usernamethree); } else
		 * if(Payment.equalsIgnoreCase("UsernameOne")) {
		 * loginPage.enterUserName(UsernameOne); }
		 * 
		 * else if(Payment.equalsIgnoreCase("UsernameTwo")) {
		 * loginPage.enterUserName(UsernameTwo); } else
		 * if(Payment.equalsIgnoreCase("Usernamefour")) {
		 * loginPage.enterUserName(Usernamefour); }
		 * 
		 * else if(Payment.equalsIgnoreCase("Usernamefive")) {
		 * loginPage.enterUserName(Usernamefive); } else
		 * if(Payment.equalsIgnoreCase("Usernamesix")) {
		 * loginPage.enterUserName(Usernamesix); }
		 */
	}

	@When("user approve the payment with wrong OTP {string}")
	public void userApprovepaymentthreetimes(String Approvername) throws InterruptedException {
		loginPage.doLogin(Approvername, "Osv@1234");
		Approvalpage.OTPApprovalThreetimes();
		loginPage.LogoutApplication();
	}

	@When("user approve the payment {string}")
	public void userApprovepayment(String Approvername) throws InterruptedException {
		loginPage.doLogin(Approvername, "Osv@1234");
		//Approvalpage.paymentApprove();
		
		loginPage.popup();
		Paymentpage.paymentApprove();
		loginPage.LogoutApplication();
	}

	@When("user need more info that payment {string}")
	public void userneedmoreinfopayment(String Approvername) throws InterruptedException {
		loginPage.doLogin(Approvername, "Osv@1234");
		Approvalpage.needmoreinfo();
		loginPage.LogoutApplication();
	}
	@When("payroll user need more info that payment {string}")
	public void payrolluserneedmoreinfopayment(String Approvername) throws InterruptedException {
		//loginPage.doLogin(Approvername, "Osv@1234");
		//Approvalpage.needmoreinfo();
		//loginPage.LogoutApplication();
	}
	
	@When("payroll user reject that payment {string}")
	public void payrolluserrejectreinfopayment(String Approvername) throws InterruptedException {
		//loginPage.doLogin(Approvername, "Osv@1234");
		//Approvalpage.needmoreinfo();
		//loginPage.LogoutApplication();
	}
	@When("user send need more info the payment {string}")
	public void sendmoreinfo(String Approvername) throws InterruptedException {
		loginPage.doLogin(Approvername, "Osv@1234");
		Approvalpage.sendmoreinfo();
		loginPage.LogoutApplication();
	}

	@When("user approve the OTP {string}")
	public void userApproveOTPpayment(String Approvername) throws InterruptedException {
		loginPage.doLogin(Approvername, "Osv@1234");
		try {
		loginPage.popup();
		
		}
		catch (Exception e) {
	System.out.println("There is No popup windows");
		}
		Approvalpage.OTPApproval();
		try
		{
		loginPage.LogoutApplication();
	}
		catch(Exception e)
		{
		}
		}

	@When("user enters Aprovalsname {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enters_Aprovalsname(String UsernameOne, String approver1, String Usernamethree, String approver2,
			String UsernameTwo, String approver3, String Usernamefour, String approver4, String Usernamefive,
			String approver5, String Usernamesix, String approver6) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> mapobj = new LinkedHashMap<>();

		if (approver1 != null && approver1 != "") {
			mapobj.put(UsernameOne, approver1);
		}
		if (approver2 != null && approver2 != "" && UsernameTwo != "" && UsernameTwo != null) {
			mapobj.put(UsernameTwo, approver2);
		}
		if (approver3 != null && approver3 != "" && Usernamethree != "" && Usernamethree != null) {
			mapobj.put(Usernamethree, approver3);
		}

		if (approver4 != null && approver4 != "" && Usernamefour != "" && Usernamefour != null) {
			mapobj.put(Usernamefour, approver4);
		}
		if (approver5 != null && approver5 != "" && Usernamefive != "" && Usernamefive != null) {
			mapobj.put(Usernamefive, approver5);
		}
		if (approver6 != null && approver6 != "" && Usernamesix != "" && Usernamesix != null) {
			mapobj.put(Usernamesix, approver6);
		}

		for (Map.Entry<String, String> map : mapobj.entrySet()) {
			System.out.println("Users " + map.getKey() + " Action: " + map.getValue());

		}

		for (Map.Entry<String, String> map : mapobj.entrySet()) {
			System.out.println("Loged in User " + map.getKey());
			loginPage.enterUserName(map.getKey());
			Thread.sleep(4000);
			loginPage.enterPassword("Osv@1234");
			Thread.sleep(4000);
			loginPage.clickOnLogin();
			Thread.sleep(4000);

			if (map.getValue().equalsIgnoreCase("Approve")) {

				Approvalpage.paymentApprove();

				System.out.println(map.getKey() + "payment Approved");
			}
			if (map.getValue().equalsIgnoreCase("Needmoreinfo")) {
				System.out.println(map.getKey() + "payment Needmoreinfo");
			}
			if (map.getValue().equalsIgnoreCase("Reject")) {
				System.out.println(map.getKey() + "payment Reject");
			}

			if (map.getValue().equalsIgnoreCase("FinalApprove")) {

				Approvalpage.OTPApproval();

			}

			loginPage.LogoutApplication();
			System.out.println("Loged out User " + map.getKey());
		}

	}

	@When("user enters username  and PassWord {string}{string}")
	public void user_enters_username(String username, String Password) throws InterruptedException {

		loginPage.doLogin(username, Password);
	}
	
	

	@When("user enters password {string}")
	public void user_enters_password(String password) throws InterruptedException {
		Thread.sleep(3000);
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {

		loginPage.clickOnLogin();

	}

	@When("User close all Popup messages")
	public void popupmsgs() throws InterruptedException {
		loginPage.popup();

	}
	

	@Then("User close the Paymentpopup")
	public void PaymentPopup() throws InterruptedException {
		loginPage.Paymentpopup();
	}

	@Then("user click on username logo")
	public void user_click_on_logo() throws InterruptedException {
		loginPage.userlogo();
	}


	@Then("click on overview page")
	public void overviewpagelink() throws InterruptedException
	{
		paymentpage.overviewlink();
	}
	
	@And("click on bulk button under upcoming payments")
	public void bulkpayment() throws InterruptedException
	{
		paymentpage.bulkpayment();
	}
	@And("user click on your bank accounts tab")
	public void user_bankAccounts() {
		loginPage.bankaccounts();
	}

	@Then("user can see the all the existing banknames")

	public void Existingbankaccounts() throws InterruptedException {
		loginPage.ExistingBankNames();
	}

	@Then("user should be create OwnAccount payment {string},{string},{string},{string},{string},{string}")
	public void user_should_be_create_payment(String Combinedview, String BeneficiryAccounts, String TransferType,
			String Fromac, String Toacc, String Amount) throws InterruptedException {

		paymentpage.OwnAccounts(Combinedview, BeneficiryAccounts, TransferType, Fromac, Toacc, Amount);

	}

	@Then("user should be create Beneficiry payment Alrajhi to Alrajhi Account")
	public void AlrajhitoAlrajhi() throws InterruptedException {
		paymentpage.AlrajhitoAlrajhiAccountHolders();
	}
	
	@Then("user should be create Beneficiry payment NCB to Alrajhi Account")
	public void NCBtoAlrajhi() throws InterruptedException {
		paymentpage.NCBtoAlrajhi();
	}
	@Then("user should be create Beneficiry payment ICICI to YesBank Account")
	public void ICICItoyes() throws InterruptedException {
		paymentpage.ICICItoYesBank();
	}
	
	@And("user open newly created payment details and verify beneficiry tab displaying")
	public void detailsofpayment() throws InterruptedException
	{
		paymentpage.paymentdetailtab();
	}
	@Then("click on beneficiry tab")
	public void click_on_beneficiry_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		paymentpage.beneficirydetail();
	}

	@Then("verify the Beneficiry name displaying or not")
	public void verify_the_beneficiry_name_displaying_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		paymentpage.Beneficiryname();
		}

	@Then("verify the all bank accounts text displaying or not")
	public void verify_the_all_bank_accounts_text_displaying_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	  paymentpage.bankaccountdetails();
	}

	@Then("verift the payment history displaying or not")
	public void verift_the_payment_history_displaying_or_not() {
	    // Write code here that turns the phrase above into concrete actions
	    paymentpage.paymenthistorytab();
	}

	@Then("see all payments in profile link displaying or not")
	public void see_all_payments_in_profile_link_displaying_or_not() {
	    // Write code here that turns the phrase above into concrete actions
		paymentpage.paymenthistorytab();
	}

	@Then("click on see all payments in profile")
	public void click_on_see_all_payments_in_profile() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   paymentpage.paymentHistory();
	   Thread.sleep(5000);
	}
	@And("click on the disabled tab")
	public void disabletab() throws InterruptedException
	{
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.cssSelector(".disabledActive")).click();
		Thread.sleep(2000);
		
	}
	@And("click on enable the account")
	public void enableaccount() throws InterruptedException
	{
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.cssSelector(".icon-Switch-off")).click();
		Thread.sleep(2000);
	
	}
	@And("count number of beneficiries exists in the account")
	public void beneficiries_Count()
	{
		
		int size =DriverFactory.getDriver().findElements(By.xpath("//div[@class='bankNameContainer ']")).size();
		System.out.println("The number of the beneficiries"+size);
	}
	
	@And("verify the enable button displayed or not and disable the second account")
	public void enablebutton()
	{
			DriverFactory.getDriver().findElement(By.xpath("(//span[@class='icon-Switch-on'])[2]")).click();
			
	}
	
	@And("verify write reason popup displayed or not")
	public void disablepopup()
	{
		DriverFactory.getDriver().findElement(By.cssSelector("div[class='isPopupClose isFlex spacing alignCenter'] h3")).isDisplayed();
		
	}
	@Then("enter reason in text box")
	public void textbox() throws InterruptedException
	{
		DriverFactory.getDriver().findElement(By.xpath("//textarea[@name='reason']")).click();
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.xpath("//textarea[@name='reason']")).sendKeys("Testing");
		Thread.sleep(2000);
	}
	@Then("click on Disable Account")
	public void disableaccount() throws InterruptedException
	{
		DriverFactory.getDriver().findElement(By.cssSelector("button[class='btn-primary w-100 ']")).click();
		Thread.sleep(2000);
			
	}
	
	@Then("user should be create International Payment")
	public void International() throws InterruptedException {
		paymentpage.InternatinalPayment();
	}

	@Then("user should be create Beneficiry payment {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_be_create_Combinedpayment(String TransferType, String Fromac, String Toacc, String Amount,
			String username, String Payment, String UsernameOne, String Usernametwo) throws InterruptedException {

		paymentpage.Beneficirypayments(TransferType, Fromac, Toacc, Amount);

	}

	@Then("user should be create Alinma payment")
	public void user_should_be_create_payment() throws InterruptedException {

		paymentpage.Alinmaaccount();

	}

	@Then("User See the error messgae")
	public void User_errormsg() {

	}

	@Then("user should be click on Quicklink payment link in dashboard")
	public void quicklinkpayment() throws InterruptedException {
		paymentpage.quicklinkPayment();
	}

	@Then("user should be create payment more than 100 charecters")
	public void user_should_enter_Description_more() throws InterruptedException {

		paymentpage.Bank_Description();

	}

	@Then("user should be create OwnAccount payment {string},{string},{string},{string},{string}")
	public void user_should_be_create_payment_Comp(String Combinedview, String BeneficiryAccounts, String TransferType,
			String Fromac, String Toacc, String Amount) throws InterruptedException {

		paymentpage.OwnAccounts(Combinedview, BeneficiryAccounts, TransferType, Fromac, Toacc, Amount);

	}

	@Then("user should be create Schedule payment {string},{string},{string},{string}")
	public void user_should_be_create_Schedule_payment(String TransferType, String Fromac, String Toacc, String Amount)
			throws InterruptedException {

		paymentpage.SchedulePayment(TransferType, Fromac, Toacc, Amount);

	}
			
			@Then("user should be create Schedule payment monthly {string},{string},{string},{string}")
			public void user_should_be_create_Schedule_payment_Monthly(String TransferType, String Fromac, String Toacc, String Amount)
					throws InterruptedException {

				paymentpage.SchedulePaymentmonthly(TransferType, Fromac, Toacc, Amount);

			}

	@Then("user Approve the Payment{string}")
	public void user_Approve_the_Payment(String Userone) throws InterruptedException {
		approvalpage.paymentbuttonApproval(Userone);

	}

	@Then("user Approve the Payment through overview")
	public void user_Approve_the_Payment_overview() throws InterruptedException {
		approvalpage.OverviewApprove();

	}

	@Then("user Approve the OTPPayment")
	public void user_Approve_the_OTPPayment() throws InterruptedException {
		approvalpage.OTPApproval();

	}

	@Then("user Approval flow{string},{string},{string}")
	public void user_Approve_the_Payment(String Approveone, String Approvetwo, String Approvethree)
			throws InterruptedException {
		approvalpage.OTPApproval();

	}

	@And("user clicks on Payment Link")
	public void Paymentlink() throws InterruptedException {
		paymentpage.paymentlink();
	}
	@And("click on transfers")
	public void Transfers() throws InterruptedException
	{
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.cssSelector("a[href='/payments/transfers']")).click();
	}
	@And("click on history")
	public void History() throws InterruptedException
	{
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.xpath("(//a[normalize-space()='History'])[1]")).click();
	}
	@And("Open on FirstPayment")
			public void Firstpayment() throws InterruptedException
			{
				Thread.sleep(5000);
				DriverFactory.getDriver().findElement(By.xpath("(//div[contains(@class,'table-tr')])[3]")).click();
			}
	@And("user click on Schedule payment and click under transfers tab")
	public void Schedulepayment()
	{
		paymentpage.SchedulePaymentlink();
		
	}
	@Then("user Select the amount and scheduled dropdown array button")
	public void monthdropdown() throws InterruptedException
	{
		paymentpage.Monthdatatable();
	}

	@Then("verify all data should be showing monthly")
	public void monthselection() throws InterruptedException
	{
		paymentpage.Monthdata();
	}
	
	@When("User create the different types of payment")
	public void payment(DataTable payment) {
		List<List<String>> payments = payment.asList(String.class);
		for (List<String> e : payments) {
			System.out.println(e);
		}
	}

	@And("user Upload and create the Bulk Payment")
	public void BulkPaymentSheet() throws InterruptedException {
		paymentpage.Bulkupload();
	}
	
	@And("click on payments link and click on Bulk Transfer")
	public void BulkTransfer() throws InterruptedException
	{
		paymentpage.PaymentandBulkpayment();
	}
	@And("click on upload payments")
	public void Bulkuploadbutton() throws InterruptedException
	{
		paymentpage.uploadbulk();
	}
	
	 @Then ("user Select the Debit Account")
	 public void selectDebitaccount() throws InterruptedException
	 {
		 paymentpage.selectDebitaccount();
	 }
	 @Then ("user Select the Debit Account after clear")
	 public void selectDebitaccountse() throws InterruptedException
	 {
		 paymentpage.selectDebitaccountsecond();
	 }
	    @Then("user upload payment sheet")
	    public void selectpaymentsheet() throws InterruptedException
	    {
	    	paymentpage.selectpaymentsheet();
	    }
	    @Then ("select payment due date")
	    public void paymentduedate() throws InterruptedException
	    {
	    	paymentpage.paymentduedate();
	    }
	    @And  ("enter the description in English language")
	    public void description_English() throws InterruptedException
	    {
	    	paymentpage.description_English();
	    }
	    @And  ("enter the description in Arabic language")
	    public void description_Arabic() throws InterruptedException
	    {
	    	paymentpage.description_English();
	    }
	    @Then ("click on clear the data")
	    public void clearbulkdata() throws InterruptedException
	    {
	    	paymentpage.clearbulkdata();
	    }

	    @Then ("click on upload the data")
	    public void uploadbulkdata() throws InterruptedException
	    {
	    	paymentpage.uploaddata();
	    }
	    
	    @And("click on accept and upload")
	    public void acceptandupload() throws InterruptedException
	    {
	    	paymentpage.acceptandupload();
	    }
	    @And("click on approve button")
	    public void approve() throws InterruptedException
	    {
	    	paymentpage.bulkapprovebutton();
	    }
	    @And("enter comments on approve popup and approve")
	    public void commentsonapprovebox() throws InterruptedException
	    {
	    	paymentpage.commentsonapprovebox();
	    	paymentpage.Approvebox();
	    }
	    @And("user verify upload successful message")
	    public void Verifyuploadmsg() throws InterruptedException
	    {
	    	paymentpage.uploadtextverify();
	    }
	    
	    
	    
	    @Then("after clear user verify write description text displayed or not")
	    public void description()
	    {
	    	
	    	paymentpage.Description();
	    }
	    
	    
	@And("Take Screen shot")
	
		public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
			//Convert web driver object to TakeScreenshot
			TakesScreenshot scrShot =((TakesScreenshot)webdriver);
			//Call getScreenshotAs method to create image file
			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination
			File DestFile=new File(fileWithPath);
			//Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
			}
	
	
	
	
	
	
	
	
	

	@And("user clicks on SchedulePayment Link")
	public void SchedulePayment() throws InterruptedException {
		paymentpage.SchedulePaymentlink();
	}

	@And("user Datatable filter Beneficiryname Search")
	public void Data_Table_Search_Beneficiry() throws InterruptedException

	{
		paymentpage.DatatableBeneficirySearch();
	}

	@And("user Datatable filter Select Month")
	public void SchedulePaymentmonth() throws InterruptedException

	{
		paymentpage.DatatableSearch();
	}

	@And("User verify only Month Payment Displayed are not")
	public void Monthdata() throws InterruptedException {
		paymentpage.Monthdata();
	}

	@And("User close the Monthly tag")
	public void closefilter() throws InterruptedException {
		paymentpage.Monthdataclosebutton();
	}

	@And("user clicks on Payment Button")
	public void PaymentButton() throws InterruptedException {
		paymentpage.payment();
	}

	@And("user Select Random Check Boxes")
	public void Select_Random() throws InterruptedException {
		paymentpage.BulkPaymentCheckBoxes();
	}

	@Then("User Approve the BulkPayments")
	public void Bulk_Approve() throws InterruptedException {
		paymentpage.BulkApprove();
	}
	@Then("User click on create new user")
	public void user_click_on_create_new_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	 @ Then ("User click on any existing user profile")
	 
	 public void user_click_onnew_user() {
		}
@ And ("User requests to resend secret key")
	 
	 public void user_click_onresenduser() {
		}
@ And ("User requests to reset key")

public void user_click_on_e_re_user() {
	}
	@And("select the MFA Option disable")
	public void select_the_mfa_option_disable() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
    @And("select the MFA Option enable and disable")
	public void select_the_mfa_option_ena_disable() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("select the MFA Option enable")
	public void select_the_mfa_option_enable() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
}
