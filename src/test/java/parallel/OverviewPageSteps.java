package parallel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.DashBoardPage;
import com.pages.OverviewPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OverviewPageSteps {
	
private WebDriver driver;


private OverviewPage overviewPage = new OverviewPage(DriverFactory.getDriver());
	

	
	@When("user click on OverView Button")
	public void  user_click_OverView_Button() {
		
		overviewPage.overview();
		
	}
	@Then("User Verify All the Companies are dispalying or not")
	public void Listofcompanies()
	{
		overviewPage.GroupofCompanys();
	}
	
	@When("user click on see All Transaction Button")
	public void SeeallTransaction()
	{
		overviewPage.seeAllTransaction();
		
	}
	@Then("user navigate to Transaction Tab")
	
	public void TransactionTab()
	{
		overviewPage.Transactiontab();
		
	}
	@And("user verify debit checkbox functionality")
	public void creditcheckBox()
	{
		
	}
	
	@And("user verify current Balance")
	public void CurrentBalance()
	{
		overviewPage.currentbalance();
	}
	@And("user click on livebalance button")
	public void livebalance()
	{
		overviewPage.livebalance();
	}
	@And("user can see all companys balance")
	public void allcompanybalance()
	{
		overviewPage.allcompanybalance();
	}
	
}
