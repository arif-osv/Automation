package parallel;

import org.openqa.selenium.WebDriver;

import com.pages.Approvalpage;
import com.pages.BeneficiryPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ApprovalPageSteps {
	private WebDriver driver;

	private Approvalpage approPage = new Approvalpage(DriverFactory.getDriver());

	@And("user self Approve the Beneficiry")
	public void user_Approve_Beneficiry() throws InterruptedException {

		approPage.Beneficiry_CheckboxApproval();

	}
	

	@And("user Approve the Benficiry")
	public void Approvebeneficiry() throws InterruptedException {
		approPage.BeneficiryApproval(driver);
	}

	@Then("user Approve the Beneficiry through dashboard")
	public void Approvebeneficirydashboard() {
		approPage.DashBoardApproveBeneficiry();
	}

	@Then("user reject the Beneficiry through dashboard")
	public void rejectbeneficirydashboard() throws InterruptedException {

		approPage.DashBoardviewrejectBeneficiry();
	}
	
	
	
	
}
