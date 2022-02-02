package parallel;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.BeneficiryPage;
import com.pages.PayrollPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PayrollPageSteps {

	private WebDriver driver;

	private PayrollPage payrollpage = new PayrollPage(DriverFactory.getDriver());

	@Then("click on roll management")
	public void user_clickonrolemgmt() throws InterruptedException {
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.xpath("//span[@class='userTitle']")).click();
		Thread.sleep(2000);
		DriverFactory.getDriver().findElement(By.xpath("//h5[normalize-space()='Role management']")).click();
		Thread.sleep(2000);

	}

	@Then("user enable payroll button")
	public void enable_payroll() throws InterruptedException {
		payrollpage.approval();
		payrollpage.checkbox();
	}

	@And("user see on the Payroll button in header links")
	public void user_click_Beneficiry_Button() throws InterruptedException {

		payrollpage.clickonpayroll();
	}

	@Then("user click on wps payroll")
	public void user_click__Button() throws InterruptedException {

		payrollpage.uploadsheet();
	}

	@Then("user click on wps uploadsheet")
	public void user_click__uploadButton() throws InterruptedException {

		payrollpage.uploadsheetbutton();
	}
	@And("user enter all the data")
	public void enterdata() throws InterruptedException, IOException {
		payrollpage.enterdata();
	}
	@Then("user click on cancel all the data entered in all fields should be cleared and able to enter new data")
	public void reenterdata() throws InterruptedException, IOException
	{
		payrollpage.cancelbutton();
		payrollpage.enterdata();
	}
	@Then("click on Continue Payroll review screen should be displayed with Upload option")
public void continuebutton() throws InterruptedException, IOException
{
		payrollpage.enterdata();
		payrollpage.continuebutton();
}
	
	@Then("user continue the upload sheet")
	public void continueupload() throws InterruptedException
	{
		payrollpage.continuebutton();
		Thread.sleep(4000);
	}
	
	@Then("user continue upload button")
	public void continueuploadbutton() throws InterruptedException
	{
		payrollpage.uploadcontinue();
		Thread.sleep(5000);
	}
	@Then ("user verify the Payroll file name displayed on header")
	public void payrollfilename()
	{
	
	}
	@Then ("user verify the From account number displayed on header")
	public void accountnumber()
	{
		payrollpage.accountnumber();
	}@Then ("user verify the PNumber of employees displayed on header")
	public void noofemp()
	{
		payrollpage.numberemployess();
	}@Then ("user verify the payment date displayed on header")
	public void paymentdate()
	{
		payrollpage.paymentduedate();
	}
	@Then("user enter corporate number above and below 15digits")

	public void corp_number() throws InterruptedException {

		payrollpage.corpnumber();
	}

	@And("user click on Debit Account")
	public void user_click_DebitSAccount() throws InterruptedException {

		payrollpage.DebitAccount();
	}

	@And("user attch Sheet")
	public void Attchsheet() throws InterruptedException, AWTException {
		payrollpage.AttachSheet();
	}

}
