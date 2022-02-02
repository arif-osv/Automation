package parallel;

import com.pages.DashBoardPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class DashBoardPageSteps {
	
	private DashBoardPage dashBoardPage = new DashBoardPage(DriverFactory.getDriver());
	

	@When ("user should count all my company pending approval")
	public void user_should_count_all_my_company_pendingapproval() throws InterruptedException {
		//dashBoardPage.DashBoardCount();
	dashBoardPage.DashBoardcounttwo();
	}
	

}
