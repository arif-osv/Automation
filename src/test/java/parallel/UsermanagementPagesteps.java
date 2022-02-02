package parallel;

import com.pages.Usermanagement;
import com.pages.userprofilepage;

import io.cucumber.java.en.Then;

public class UsermanagementPagesteps {
	private Usermanagement profile = new Usermanagement();
	
	
	@Then("Create new user")
	public void username()
	{
		profile.Createnewuser();
	}
	

}
