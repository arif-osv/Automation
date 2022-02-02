package parallel;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Emaillogin {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.guerrillamail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@id='inbox-id']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='guerrilla_mail']/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='guerrilla_mail']/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]")).sendKeys("pashamda");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Set')]")).click();
	Thread.sleep(2000);
	List<WebElement> l =driver.findElements(By.xpath("//tbody[@id='email_list']//tr//input"));
	
	for (int i = 1; i <l.size(); i++) {
		System.out.println("The existing mail size is "+l.size());
		
		driver.findElement(By.xpath("//tbody[@id='email_list']//tr["+i+"]//input")).click();

		
	}
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='del_button']")).click();
	System.out.println("The existing mail size is "+l.size());
	
	driver.get("https://uat.onesingleview.com/login");
	
	
	LoginPage ll =new LoginPage(driver);
	
	ll.doLogin("stcexe", "Osv@1234");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='username']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//h5[normalize-space()='User management']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='+ Create new user']")).click();

	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mohamad");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pashamda@sharklasers.com");

	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='selectOptionFont createNewUserPhn phnBorderRight css-2b097c-container']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'+971')]")).click();
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("12123123412");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='nationalId']")).sendKeys("9191919191");
	Thread.sleep(2000);
	driver.findElement(By.xpath(
	"//div[@class='createNewUserPhn allUserPadding userRoleHeight selectOptionFont css-2b097c-container']//div[@class=' css-1hwfws3']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//div[contains(text(),'Initiator')]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//label[contains(text(),'Daily approval limit')]//following-sibling::div/div[1]/div[1]/div/div[2]/div")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'SAR')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='fundTransferLimit.amount']")).click();

	driver.findElement(By.xpath("//input[@name='fundTransferLimit.amount']")).clear();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='fundTransferLimit.amount']")).sendKeys("1000");
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class='mfaBlock']//div[@class='react-switch-handle']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[normalize-space()='L0']//input[@name='Beneficiaries']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[normalize-space()='L0']//input[@name='Add Beneficiaries']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
	Thread.sleep(2000);
	ll.LogoutApplication();
	Thread.sleep(5000);
	driver.close();
	driver = new ChromeDriver();
	driver.get("https://www.guerrillamail.com");
	Thread.sleep(10000);
	driver.navigate().refresh();
	Thread.sleep(20000);
	driver.get("https://www.guerrillamail.com");
	Thread.sleep(10000);
	driver.navigate().refresh();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//span[@id='inbox-id']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/div[@id='guerrilla_mail']/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]")).clear();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//body/div[@id='guerrilla_mail']/div[1]/div[2]/div[1]/span[1]/span[1]/input[1]")).sendKeys("pashamda");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Set')]")).click();
	Thread.sleep(5000);
	List<WebElement> lk1 =driver.findElements(By.xpath("//tbody[@id='email_list']//tr"));
	
	System.out.println("The existing mail size is "+lk1.size());
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@class='td2']")).click();
	Thread.sleep(2000);
	String url =driver.findElement(By.partialLinkText("https://uat.onesingl")).getText();
	String Username =driver.findElement(By.xpath("//tbody/tr[4]/td//span")).getText();
	Thread.sleep(2000);
	String Password =driver.findElement(By.xpath("//tbody/tr[5]/td//span")).getText();
	System.out.println(url);
	System.out.println(Username);
	System.out.println(Password);
	driver.get(url);
	}
	
	public static void newusercreation()
	{
	
		
		
		
		
	}

}
