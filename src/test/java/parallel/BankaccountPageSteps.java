package parallel;

import com.pages.BankAccounts;

import io.cucumber.java.en.Then;

public class BankaccountPageSteps {
	private BankAccounts BankAccount = new BankAccounts();

	@Then("user click on yourbank Accounts tab")
	public void bankAccounts()
	{
		BankAccount.AddbankAccount();
	}
	@Then("user click Edit bank Account and save")
	public void EditBankAccount()
	{
		BankAccount.Edit();
	}
	
	@Then("user Navigate to bank Website")
	public void bankWebsite()
	{
		BankAccount.Gotowebsite();
	}
}
