package parallel;

import com.pages.DashBoardPage;
import com.pages.Paymentpage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;

public class Dashboardsteps {
	
	private DashBoardPage dashboard = new DashBoardPage(DriverFactory.getDriver());
	
	@And("verify pending count and history count")
	public void Paymentlink() throws InterruptedException {
		dashboard.DashBoardCount();	
	}

}
