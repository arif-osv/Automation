package parallel;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.Approvalpage;
import com.pages.BeneficiryPage;
import com.pages.LoginPage;
import com.pages.OverviewPage;
import com.pages.Paymentpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BeneficiryPagesteps {
	
	private WebDriver driver;
	private Approvalpage approPage = new Approvalpage(DriverFactory.getDriver());
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	
private BeneficiryPage beneficiryPage = new BeneficiryPage(DriverFactory.getDriver());
	

	
	@And("user click on Beneficiry button")
	public void  user_click_Beneficiry_Button() throws InterruptedException {
		
		beneficiryPage.Beneficirylink();
		
	}
	
	@Then("click and Data table search name box")
	public void Search_Name() throws InterruptedException
	{
		beneficiryPage.DatatablenameSearch();
	}
	@Then("user click and Data table search Account Number")
	public void Search_Acnumber() throws InterruptedException
	{
		beneficiryPage.DatatableAccountnumberSearch();
	}
	
	@Then("Click on add account button in existing local beneficiary")
	public void user_clickonExistingbenf() throws InterruptedException
	{
		beneficiryPage.Existingbenf();
	}
	
	@And("user click on addBeneficiry Button")
	public void addBeneficrybutton() throws InterruptedException
	{
		beneficiryPage.AddBeneficiry();
		
	}
	
	@Then("Click on view more tab under Beneficiry tags")
	public void viewmoretab() throws InterruptedException
	{
		beneficiryPage.viewmore();	
	}
	
	@Then("verify beneficiry with beneficiry name and IBAN number")
	public void verify_beneficiry_with_beneficiry_name_and_iban_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		beneficiryPage.validBeneficirySearch();
		
		
	}

	@Then("verify valid beneficiry name and IBAN number")
	public void verify_valid_beneficiry_name_and_iban_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		beneficiryPage.BeneficirySearch();
		
		
	}
	
	@Then("click on the verify beneficiry")
	public void click_on_the_verify_beneficiry() {
		beneficiryPage.verifyBeneficiry.click();
	    // Write code here that turns the phrase above into concrete actions
	   }
	
	
	@And("user Select on Bank {string}")
	public void Beneficiry(String BankName) throws InterruptedException
	{
		beneficiryPage.selectbanks(BankName);
	}
	@And("user fill all the details and create new beneficiry and create new payment {string}")
	public void NewBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
		beneficiryPage.createnewbeneficiry_Payments(BankName);
		
	}
	
	@And("Add Account details with existing beneficiry")
	public void addaccount() throws InterruptedException
	{
		beneficiryPage.IBANNumber();
	}
	@But("user wants disable this beneficiry")
	public void disablebeneficiry() throws InterruptedException
	{
		beneficiryPage.disablebeneficiry();
	}
	
	@And("user fill all the details and create new beneficiry and payment {string}")
	public void createNewBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
		beneficiryPage.createnewbeneficiry_Payments(BankName);
		
	}
	@And("user fill all the details and create new beneficiry {string}")
	public void usercreateNewBeneficiry(String BankName) throws InterruptedException
	{
		beneficiryPage.selectbanks(BankName);
		//beneficiryPage.createnewbeneficiry(BankName);
		
	}
	
	@And("user fill all the details and create new International beneficiry {string}")
	public void usercreatenewInternationalBeneficiry(String BankName) throws InterruptedException
	{
		//beneficiryPage.selectbanks(BankName);
		beneficiryPage.createnewInternationalbeneficiry(BankName);
		
	}
	
	
	
	
	@And("user create payment with newly created beneficiry")
	public void createpaymentwithnewbenefiry(String BankName)  throws InterruptedException
	{
		beneficiryPage.createnewbeneficiry_Payments(BankName);	
	}
	@And("user fill all the details and create new beneficiry with out tagname {string}")
	public void NewBeneficirywithouttagname(String BankName) throws InterruptedException
	{
		beneficiryPage.withouttagname(BankName);
	}
	
	@And("user open the newly created Beneficiary and verify the details")
	public void opennewbenef() throws InterruptedException
	{
		beneficiryPage.clickonexistingbeficiry();
	}
	@And("user Edit the tag name and try to save the tagname field empty")
	public void Blanktag() throws InterruptedException
	{
		beneficiryPage.Emptytag();
	}
	@And("user Edit the Categery name and try to save the Category field empty")
	public void Category() throws InterruptedException
	{
		beneficiryPage.Category();
	}
	@And("user click on the add tag name and save the new tagname")
	public void addtag() throws InterruptedException
	{
		beneficiryPage.Addnewtag();
	}
	
	@And("user Edit the tag name and save the new tagname")
	public void Edittag() throws InterruptedException
	{
		beneficiryPage.EditTag();
	}

	@And("user click on addaccount tab")
	public void addnewaccount() throws InterruptedException
	{
		beneficiryPage.Addaccount();
	}
	
	@And("add beneficity tab")
	public void addbeneficiry() throws InterruptedException
	{
		DriverFactory.getDriver().findElement(By.cssSelector("div[class='popupDownShadow createPaymentBtn'] button[type='submit']")).click();
		Thread.sleep(2000);
	}
	@And("Verify The error message")
	public void verifymsg()
	{
		
	}
	@And("Enter beneficiry Address with special charectrs")
	public void BeneficiryAdd() throws InterruptedException
	{
		DriverFactory.getDriver().findElement(By.cssSelector("input[name='address']")).click();
		Thread.sleep(2000);

		DriverFactory.getDriver().findElement(By.cssSelector("input[name='address']")).sendKeys("#$%^^&&");
		
	}
	
	@And("again user create new Beneficiry {string}")
	public void addnewaccountdetails(String BankName) throws InterruptedException
	{
		beneficiryPage.addbeneficirythroughaddaccount(BankName);
	}
	@And("user Enter the Beneficiry Name {string}")
	public void BeneficiryName(String Bankname) throws InterruptedException
	{
		beneficiryPage.EnterBeneficiryname();
	}
	
	@And("User Enters the IBAN Number {string}")
	public void IBANNumber(String number) throws InterruptedException
	{
		beneficiryPage.IBANNumber();
	}
	
	
	@And("user click on Pending  Approval Button")
	public void PendingApproval() throws InterruptedException
	{
		beneficiryPage.PendingApproval();
	}
	
	@And("user click on Multiple checkBoxes")
	public void Multiple_CheckBoxes() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[normalize-space()='Pending approval']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='c1'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
		Thread.sleep(2000);
		
	}
	
	@Then("User want to create local beneficiry profile {string}")
	public void  CreateLocalBeneficiry(String Bankname) throws InterruptedException {
		
		beneficiryPage.selectbanks(Bankname);
		
	}
	@Then("User click on Payroll link and upload payroll sheet")
	public void Upload_Payroll() throws InterruptedException, IOException
	{
		beneficiryPage.payroll();
	}
	@Then("next user approve the payment {string}")
				public void userApprovepayment(String Approvername) throws InterruptedException 
				{
				loginPage.doLogin(Approvername, "Osv@1234");
			Approvalpage.payrollApprove();
					loginPage.LogoutApplication();
				}
			
	@Then("Executor approve the payment {string}")
	public void ExecutorApprovepayment(String Approvername) throws InterruptedException 
	{
	loginPage.doLogin(Approvername, "Osv@1234");
	Approvalpage.ExecutorApprove();
		loginPage.LogoutApplication();
	}
}
