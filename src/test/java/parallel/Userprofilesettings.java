package parallel;

import com.pages.BankAccounts;
import com.pages.userprofilepage;

import io.cucumber.java.en.Then;

public class Userprofilesettings {

	private userprofilepage profile = new userprofilepage();
	
	@Then("User click on username and trying to save")
	public void username()
	{
		profile.usernameedit();
	}
	
	@Then("User edit email Address and update")
	public void EmailAddress()
	{
		profile.emailedit();
	}
	
}
