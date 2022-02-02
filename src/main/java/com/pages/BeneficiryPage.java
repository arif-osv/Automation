package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.github.javafaker.Faker;
import com.qa.factory.DriverFactory;

import net.bytebuddy.utility.RandomString;

public class BeneficiryPage {

	public WebDriver driver;
	
	Paymentpage paymentspage = new Paymentpage(driver);

	public BeneficiryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Search by name']")
	public WebElement Datatablename;
	
	@FindBy(xpath="//input[@placeholder='Search account number']")
	public WebElement AccountNumber;
	
	@FindBy(xpath="//button[contains(text(),'Verify beneficiary')]")
	public WebElement verifyBeneficiry;

	@FindBy(xpath="//span[contains(text(),'View More')]")
	public WebElement viewmore;
	
	@FindBy(xpath = "//a[normalize-space()='Beneficiaries']")
	public WebElement beneficirieslink;

	@FindBy(xpath = "//button[normalize-space()='+ Add beneficiary']")
	public WebElement Addbeneficiry;
	
	@FindBy(xpath="(//button[normalize-space()='+ Add account'])[1]")
	public WebElement AddAccount;
	
	@FindBy(xpath="//div[@class='table-tr ']")
	public WebElement Existingbeneficiryopen;

	@FindBy(xpath = "//span[@title='123ABCD123123ABCD1239922']")
	public WebElement Beneficryprofile;

	@FindBy(xpath = "//button[contains(@class,'btn createBtn')]")
	public static WebElement createbenef;

	@FindBy(xpath = "//div[@class='createBeneficiaryMain']//div[2]//label//following-sibling :: div/div/div/div/div[@class=' css-1wa3eu0-placeholder']")
	public WebElement Selectbank;

	@FindBy(xpath = "//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Al inma Bank')]")
	public WebElement BankName;

	@FindBy(xpath = "//input[@name='account_number']")
	public static WebElement Ibanno;

	@FindBy(xpath = "//input[@placeholder='Select or Add beneficiary tag']")
	public static WebElement Beneficirytag;

	@FindBy(xpath = "//input[@name='address']")
	public static WebElement Address;

	@FindBy(xpath = "//textarea[@name='description']")
	public static WebElement Remarksbox;

	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement Addbeneficirytab;

	@FindBy(xpath = "//div[@class='table-tr ']")
	public static WebElement rowtab;

	@FindBy(xpath = "//div[@class='beneficiaryProfile mt-4']//div[2]//div[1]//input[1]")
	public static WebElement primaryaccount;

	@FindBy(xpath = "//textarea[@name='description']")
	public static WebElement Remarks;

	@FindBy(xpath = "//div[@class='quickLinks']//div[3]")
	public static WebElement beneficirytab;

	@FindBy(xpath = "//a[normalize-space()='Pending approval']")
	public static WebElement Benificirypeneding;

	@FindBy(xpath = "//div[@class='allUserSlct benSearchRslts']//input[@name='beneficiary_name']")
	public static WebElement beneficiryname;

	@FindBy(xpath = "//input[@name='account_number']")
	public static WebElement accountnumber;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[4]")
	public static WebElement checkboxone;

	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[5]")
	public static WebElement checkboxtwo;
	
	
	private Approvalpage approPage = new Approvalpage(DriverFactory.getDriver());

	
	String Beneficiryname=randomString();
	
	
	
	
	public void viewmore() throws InterruptedException
	{
		//viewmore.click();
		
		Thread.sleep(3000);
		/*
		 * List<WebElement> l
		 * =driver.findElements(By.xpath("//li[@class='filterCheck']"));
		 * 
		 * for (int i = 1; i < l.size(); i++) {
		 * 
		 * 
		 * //List<WebElement> l1
		 * =driver.findElements(By.xpath("(//input[@type='checkbox'])"));
		 * 
		 * 
		 * // for (int j = 0; j <l1.size(); j++) {
		 * 
		 * // l1.get(j).click();
		 * 
		 * WebElement checkbox
		 * =driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]"));
		 * checkbox.click(); Thread.sleep(4000); WebElement l3
		 * =driver.findElement(By.xpath("//nav[@class='sideNavBar']/ul[1]/li[3]/li["+i+
		 * "]/span"));
		 * 
		 * System.out.println("The count of l3 is "+l3.getText());
		 * 
		 * List<WebElement>
		 * l2=driver.findElements(By.xpath("//div[@class='table-tr ']"));
		 * Thread.sleep(4000); System.out.println("The L2 size is "+l2.size());
		 * checkbox.click(); Thread.sleep(4000); }
		 */
				
				
			}
		
	
	
	
	public void alltagscount()
	{
List<WebElement> l =driver.findElements(By.xpath("//li[@class='filterCheck']"));
for (WebElement names : l) {
	names.getText();
	System.out.println("values are "+names.getText());
	
}
	}
	
	
	public void DatatablenameSearch() throws InterruptedException
	{
		Datatablename.click();
		Thread.sleep(2000);
		Datatablename.sendKeys("Arif");
		Thread.sleep(2000);
	}
	public void DatatableAccountnumberSearch() throws InterruptedException
	{
		AccountNumber.click();
		Thread.sleep(2000);
		AccountNumber.sendKeys("12345");
		Thread.sleep(2000);
	}
	
	
	//******************************Payroll***********************************************//
	
	  
	
	public static void updateEmpdata() throws IOException
	{
	Faker faker = new Faker();
        //Read Excel document first
        FileInputStream input_document = new FileInputStream(new File("C:\\Users\\Varuna\\Desktop\\payroll_sheet.xlsx"));
        // convert it into a POI object
        XSSFWorkbook my_xlsx_workbook = new XSSFWorkbook(input_document); 
        // Read excel sheet that needs to be updated
        XSSFSheet my_worksheet = my_xlsx_workbook.getSheetAt(0);
        // declare a Cell object
        Random rnd = new Random();
        int number = rnd.nextInt(999999);

        Cell cell = null; 
        // Access the cell first to update the value
        cell = my_worksheet.getRow(3).getCell(3);
        // Get current value and reduce 5 from it
         cell.setCellValue(rnd.nextInt(999999));
         my_worksheet.getRow(4).getCell(3).setCellValue(rnd.nextInt(9999));
         my_worksheet.getRow(5).getCell(3).setCellValue(rnd.nextInt(9999));
         my_worksheet.getRow(6).getCell(3).setCellValue(rnd.nextInt(9999));
         my_worksheet.getRow(7).getCell(3).setCellValue(rnd.nextInt(9999));

         my_worksheet.getRow(8).getCell(3).setCellValue(rnd.nextInt(9999));
         my_worksheet.getRow(9).getCell(3).setCellValue(rnd.nextInt(9999));
         
        //important to close InputStream
        input_document.close();
        //Open FileOutputStream to write updates
        FileOutputStream output_file =new FileOutputStream(new File("C:\\Users\\Varuna\\Desktop\\payroll_sheet.xlsx"));
        //write changes
        my_xlsx_workbook.write(output_file);
        //close the stream
        output_file.close(); 
        System.out.println("close");
	} 

	
	
	public void payroll() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Payroll']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'NCB - 05100...96502')]")).click();
		Thread.sleep(3000);

//plz update emp data
		updateEmpdata();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Varuna\\Desktop\\payroll_sheet.xlsx");

		DateFormat dateFormat = new SimpleDateFormat("MMMMM d, yyyy");

			Thread.sleep(2000);
			Date currentDate = new Date();
			System.out.println(dateFormat.format(currentDate));

			// convert date to calendar
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);

			c.add(Calendar.DATE, 5); // convert calendar to date Date
			Date currentDatePlusOne = c.getTime();
			String currentDat = dateFormat.format(currentDatePlusOne);
			driver.findElement(By.xpath("//input[@name='dueDate']")).sendKeys(currentDat);
			Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@name='corporateCommercialRegistrationNumber']")).sendKeys("345455");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='molCorporateID']")).sendKeys("123412312987345455");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Write description']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@placeholder='Write description']")).sendKeys("Testing");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		Thread.sleep(20000);
		driver.findElement(By.xpath("//button[@class='btn-primary btn-approve w-100 uploadButton']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//button[normalize-space()='View status'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Approve']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		Thread.sleep(4000);


		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Random random = new Random();
//	int randomNumber = random.nextInt(100000);
	//String beneficiarynumber = "123ABCD123123ABCD123" + randomNumber;
	
	String beneficiarynumber = RandomStringUtils.random(24, false, true);
	String benficirytwo = RandomStringUtils.random(24, false, true);

public static String randomString()
{

	Random random = new Random();
	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	// create random string builder
	StringBuilder sb = new StringBuilder();

	// specify length of random string
	int length = 3;

	for (int i = 0; i < length; i++) {

		// generate random index number
		int index = random.nextInt(alphabet.length());

		// get character specified by index
		// from the string
		char randomChar = alphabet.charAt(index);

		// append the character to string builder
		sb.append(randomChar);
	}

	String randomString = sb.toString();
	return randomString;
}
	

	public void withouttagname(String BankName) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 30);
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		// create a string of all characters
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// specify length of random string
		int length = 3;

		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();

		System.out.println("Bank name " + BankName);
		WebElement Selectbank = driver.findElement(By.xpath("//div[contains(text(),'Select Bank')]"));

		Actions ob = new Actions(driver);
		ob.click(Selectbank);
		Action action = ob.build();
		action.perform();
		Thread.sleep(4000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]")));
		driver.findElement(By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]"))
				.click();
		try {
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("beneficiary_name")));
			driver.findElement(By.name("beneficiary_name")).click();
			driver.findElement(By.name("beneficiary_name")).sendKeys(Beneficiryname);
			
		} catch (Exception e) {
			System.out.println("It's exist benf");
		}
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='account_number']")));

		driver.findElement(By.xpath("//input[@name='account_number']")).click();
		Thread.sleep(2000);
		String benenumber=beneficiarynumber;

		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys(benenumber);
	
		Reporter.log(beneficiarynumber, true);

		Thread.sleep(3000);

		// Add beneficiry tag Scenario

		/*
		 * Beneficirytag.click(); Beneficirytag.sendKeys("saas");
		 * 
		 * WebElement s=
		 * driver.findElement(By.xpath("//div[@class='BenSearchResult']//ul"));
		 * if(s.isDisplayed()) { System.out.println("select fst tag");
		 * driver.findElement(By.xpath("//div[@class='BenSearchResult']//ul//li[1]")).
		 * click(); Thread.sleep(2000); } else { System.out.println("Its new name"); }
		 */

		/*
		 * Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@class='IbanWidth ml-2']//div[@class='selectOptionFont css-2b097c-container']"
		 * )).click(); Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Egypt')]"
		 * )).click();
		 */
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='address']")).click();
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Hyd");

		driver.findElement(By.xpath("//div[@class='allUserSlct']/textarea")).click();
		driver.findElement(By.xpath("//div[@class='allUserSlct']/textarea")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='createPaymentPopUp createPaymentBtn']/button")).click();

		Thread.sleep(5000);

	}
	public void BeneficirySearch() throws InterruptedException
	{
		WebDriverWait w = new WebDriverWait(driver, 60);
		try {
			w.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select or Add beneficiary name']")));
			driver.findElement(By.xpath("//input[@placeholder='Select or Add beneficiary name']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Select or Add beneficiary name']"))
					.sendKeys(Beneficiryname);
			
			System.out.println("Selected bf name is" + Beneficiryname);
		} catch (Exception e) {
			System.out.println("It's exist benf");
		}
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='account_number'])[2]")));

		driver.findElement(By.xpath("(//input[@name='account_number'])[2]")).click();
		Thread.sleep(2000);
		//String beneficiarynumber = "123ABCD123123ABCD123" + randomNumber;

		driver.findElement(By.xpath("(//input[@name='account_number'])[2]")).sendKeys(beneficiarynumber);
		System.out.println("New Beneficiry number is" + beneficiarynumber);
	
	}
	
	
	public void validBeneficirySearch() throws InterruptedException
	{
		WebDriverWait w = new WebDriverWait(driver, 60);
		try {
			w.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select or Add beneficiary name']")));
			driver.findElement(By.xpath("//input[@placeholder='Select or Add beneficiary name']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Select or Add beneficiary name']"))
					.sendKeys(Beneficiryname);
			
			System.out.println("Selected bf name is" + Beneficiryname);
		} catch (Exception e) {
			System.out.println("It's exist benf");
		}
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='account_number'])[2]")));

		driver.findElement(By.xpath("(//input[@name='account_number'])[2]")).click();
		Thread.sleep(2000);
		//String beneficiarynumber = "123ABCD123123ABCD123" + randomNumber;

		driver.findElement(By.xpath("(//input[@name='account_number'])[2]")).sendKeys("SA1780000555608010132339");
	
	}
	
	public void selectbanks(String BankName) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 30);
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		
		WebElement Selectbank = driver.findElement(By.xpath("//div[contains(text(),'Select bank')]"));

		Actions ob = new Actions(driver);
		ob.click(Selectbank);
		Action action = ob.build();
		action.perform();
		Thread.sleep(4000);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]")));
		driver.findElement(By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]"))
				.click();
		
		
		
		  try { w.until(ExpectedConditions .visibilityOfElementLocated(By.
		  xpath("//input[@placeholder='Select or Add beneficiary name']")));
		  driver.findElement(By.
		  xpath("//input[@placeholder='Select or Add beneficiary name']")).click();
		  driver.findElement(By.
		  xpath("//input[@placeholder='Select or Add beneficiary name']"))
		  .sendKeys(Beneficiryname);
		  
		  System.out.println("Selected bf name is" + Beneficiryname); } catch
		  (Exception e) { System.out.println("It's exist benf"); }
		  w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		  "(//input[@name='account_number'])[2]")));
		  
		  driver.findElement(By.xpath("(//input[@name='account_number'])[2]")).click();
		  Thread.sleep(2000); 
		  String beneficiarynumber = "123ABCD123123ABCD123" +
		  randomNumber;
		  
		  driver.findElement(By.xpath("(//input[@name='account_number'])[2]")).sendKeys
		  (beneficiarynumber); System.out.println("New Beneficiry number is" +
		  beneficiarynumber);
		 	
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='address']")).click();
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Hyd");

		driver.findElement(By.xpath("(//textarea[@name='description'])[2]")).click();
		driver.findElement(By.xpath("(//textarea[@name='description'])[2]")).sendKeys("Testing");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//button[normalize-space()='Add to beneficiaries'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0]. click();", element);
		Thread.sleep(5000);

	}
	
	public void addbeneficirythroughaddaccount(String BankName) throws InterruptedException
	{

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebDriverWait w = new WebDriverWait(driver, 30);
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		
		
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='account_number'])")));

		driver.findElement(By.xpath("(//input[@name='account_number'])")).click();
		Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='account_number'])")).sendKeys(benficirytwo);

		//***************Click on Verify Beneficiry  *****//
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[contains(text(),'Verify beneficiary')]")).click();
			Thread.sleep(2000);
		
		
		
		
		WebElement Selectbank = driver.findElement(By.xpath("//div[contains(text(),'Select Bank')]"));

		Actions ob = new Actions(driver);
		ob.click(Selectbank);
		Action action = ob.build();
		action.perform();
		Thread.sleep(4000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]")));
		driver.findElement(By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]"))
				.click();
		try {
			w.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select or Add beneficiary name']")));
			driver.findElement(By.xpath("//input[@placeholder='Select or Add beneficiary name']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Select or Add beneficiary name']"))
					.sendKeys(Beneficiryname);
			
			System.out.println("Selected bf name is" + Beneficiryname);
		} catch (Exception e) {
			System.out.println("It's exist benf");
		}
	
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@name='address']")).click();
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Hyd");

		driver.findElement(By.xpath("(//textarea[@name='description'])")).click();
		driver.findElement(By.xpath("(//textarea[@name='description'])")).sendKeys("created benf");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//button[normalize-space()='Add to beneficiaries'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0]. click();", element);
		Thread.sleep(5000);

	
	}

	public void clickonexistingbeficiry() throws InterruptedException {
		// click on All
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'All')]")).click();
		Thread.sleep(3000);

		WebElement local = driver.findElement(By.xpath("(//div[contains(@class,'table-tr')])[3]"));
		local.click();
		Thread.sleep(3000);

	}

	public void Addnewtag() throws InterruptedException {
		Random random = new Random();
		// int randomNumber = random.nextInt(10000);
		// create a string of all characters
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// specify length of random string
		int length = 3;

		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		driver.findElement(By.xpath("//span[contains(text(),'Add tag')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='tagName']")).sendKeys("Osv" + randomString);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-primary ']")).click();
		Thread.sleep(3000);
	}
	
	
	public void InternationalBenf(String BankName) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='paymentRadioBtn']//input[@name='type']")).click();
		Thread.sleep(2000);
		
		WebDriverWait w = new WebDriverWait(driver, 30);
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		WebElement Selectbank = driver.findElement(By.xpath("//div[contains(text(),'Select Bank')]"));

		Actions ob = new Actions(driver);
		ob.click(Selectbank);
		Action action = ob.build();
		action.perform();
		Thread.sleep(4000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]")));
		driver.findElement(By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'" + BankName + "')]"))
				.click();
	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" (//input[@name='account_number'])[2]")));

		driver.findElement(By.xpath(" (//input[@name='account_number'])[2]")).click();
		Thread.sleep(2000);
		//String beneficiarynumber = "123ABCD123123ABCD123" + randomNumber;

		driver.findElement(By.xpath(" (//input[@name='account_number'])[2]")).sendKeys(benficirytwo);
		System.out.println("New Beneficiry number is" + benficirytwo);
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("input[name='ifscCode']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("input[name='ifscCode']")).sendKeys("123456");
		Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Albania')]")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//input[@name='address']")).click();
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Hyd");

		driver.findElement(By.xpath("(//textarea[@name='description'])[2]")).click();
		driver.findElement(By.xpath("(//textarea[@name='description'])[2]")).sendKeys("created benf");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//button[normalize-space()='Add to beneficiaries'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0]. click();", element);
		Thread.sleep(5000);

	
		
	}

	public void EditTag() throws InterruptedException {
		Random random = new Random();
		// int randomNumber = random.nextInt(10000);
		// create a string of all characters
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// specify length of random string
		int length = 3;

		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		

		driver.findElement(By.xpath("//span[contains(text(),'Add tag')]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='profile-sec']/div/div[1]/div[2]/div/div[4]/div/div/div/div[2]/form/div[1]/div/input")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='profile-sec']/div/div[1]/div[2]/div/div[4]/div/div/div/div[2]/form/div[1]/div/input")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='profile-sec']/div/div[1]/div[2]/div/div[4]/div/div/div/div[2]/form/div[1]/div/input")).sendKeys("Osv" + randomString);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-primary ']")).click();
		Thread.sleep(3000);

	}

	public void Emptytag() throws InterruptedException {
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
	
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// create random string builder
		StringBuilder sb = new StringBuilder();

		// specify length of random string
		int length = 3;

		for (int i = 0; i < length; i++) {

			// generate random index number
			int index = random.nextInt(alphabet.length());

			// get character specified by index
			// from the string
			char randomChar = alphabet.charAt(index);

			// append the character to string builder
			sb.append(randomChar);
		}

		String randomString = sb.toString();
		driver.findElement(By.xpath("//div[@class='isFlex statusValue mt-4 alignCenter']//span[@class='icon-Tag-edit Cursor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='tagName']")).clear();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-primary ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='tagName']")).sendKeys(randomString);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn-primary ']")).click();

	}
	
	public void Category() throws InterruptedException

	{
		driver.findElement(By.xpath("//div[@class='profileTagging']//span[@class='icon-Tag-edit Cursor']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@class,'css-1hwfws3')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Vendor')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		
	}
	public void Addaccount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='+ Add account']")).click();
	}

	public void EnterBeneficiryname() throws InterruptedException {

		WebElement x = driver
				.findElement(By.xpath("//div[@class='allUserSlct benSearchRslts']//input[@name='beneficiary_name']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', 'Automation')", x);

	}

	public void IBANNumber() throws InterruptedException {
		WebElement Selectbank = driver.findElement(By.xpath("//div[contains(text(),'Select Bank')]"));

		Actions ob = new Actions(driver);
		ob.click(Selectbank);
		Action action = ob.build();
		action.perform();
		Thread.sleep(4000);
		driver.findElement(By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Al Rajhi Bank')]"))
				.click();

		Thread.sleep(2000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', '"+beneficiarynumber+"')",Ibanno);
		Ibanno.click();
		Ibanno.sendKeys(beneficiarynumber);
		Beneficirytag.click();
		Beneficirytag.sendKeys("Arif");
		Address.click();
		Address.sendKeys("India");
		Addbeneficirytab.click();
		Thread.sleep(3000);
		
		}

	public void clickonaddbeneficiry() {
		Addbeneficirytab.click();

	}

	public void Beneficirylink() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		beneficirieslink.click();
		Thread.sleep(3000);

	}

	public void AddBeneficiry() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Addbeneficiry.click();
		Thread.sleep(3000);
	}
	public void Existingbenf() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Existingbeneficiryopen.click();
		Thread.sleep(3000);
		AddAccount.click();
	}
	
	public void disablebeneficiry() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[normalize-space()='Local']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='customReactTable']//div[1]//div[5]//div[1]//div[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//li[normalize-space()='Disable']")).click();
Thread.sleep(2000);



		
	}

	public void PendingApproval() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Benificirypeneding.click();

		checkboxone.click();

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(checkboxtwo));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", checkboxtwo);

		// checkboxtwo.click();

	}
	
	public Paymentpage Createpaymentnewbf() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Paymentpage Paymentpage= new Paymentpage(driver);
		Paymentpage.payment.click();
		Paymentpage.transfers.click();
		Thread.sleep(2000);

	Thread.sleep(2000);
	System.out.print("click on beneficiry account");
		//driver.findElement(By.partialLinkText(TransferType)).click();
		Thread.sleep(2000);
	Paymentpage.BeneficiryAccount.click();
		Thread.sleep(2000);
		Paymentpage.createpayment.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='transfer_type'][@value='SARIE']")).click();
		

		Thread.sleep(3000);
	
		Paymentpage.fromac.click();

		By Header = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'68200059703000')]");
		By toacc = By
				.xpath("//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'"+beneficiarynumber+"')]");
		By PORCODE = By.xpath(
				"//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Travel Requirements')]|//div[@class='selectOptionFont css-2b097c-container']//*[contains(text(),'Business:Payroll')]");
		By PORCODE1 = By.xpath(
				"(//div[@class='name-select__value-container name-select__value-container--has-value css-1hwfws3'])[3]");
		driver.findElement(Header).click();
		// fromacno.click();
		Thread.sleep(2000);
		Paymentpage.beneficiryac.click();
		
		Thread.sleep(3000);
		driver.findElement(toacc).click();
		// benfno.click();
		Paymentpage.amount.click();
		Paymentpage.amount.sendKeys("18");
		try
		{
		Paymentpage.POR.click();
		driver.findElement(PORCODE).click();
		}
		catch(Exception e)
		{
			System.out.println("there is no POR code for Selected bank");
		}
		Paymentpage.testarea.click();
		Paymentpage.testarea.sendKeys("testing");
	Paymentpage.addpayment.click();
		Thread.sleep(2000);
		return new Paymentpage(driver);
		
	}

	public void createnewbeneficiry(String BankName) throws InterruptedException
	{
		
		selectbanks(BankName);
	//	approPage.Beneficiry_CheckboxApproval();
			
		
	}
	
	public void createnewInternationalbeneficiry(String BankName) throws InterruptedException
	{
		InternationalBenf(BankName);
	}
	public void createnewbeneficiry_Payments(String BankName) throws InterruptedException
	{
		
		selectbanks(BankName);
		approPage.Beneficiry_CheckboxApproval();
		Createpaymentnewbf();	
		
	}

}
