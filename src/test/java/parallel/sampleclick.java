package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;

import com.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
public class sampleclick {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, AWTException {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
		
		driver.get("https://uat.onesingleview.com");
		driver.manage().window().maximize();
		
		LoginPage l= new LoginPage(driver);
		l.doLogin("smexe", "Osv@1234");
		driver.findElement(By.xpath("//a[normalize-space()='payments']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[normalize-space()='Transfers (421)']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[@class='dataTableTextTruncate'])[1]")).click();
		Thread.sleep(3000);
		Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
       // robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
		
        
        
        
        WebElement element = driver.findElement(By.xpath("//*[@id='root']/div/main/div/div/div/div[2]/div/div/div[3]/div[2]/div/div/div/h3/span[2]"));
      //Used points class to get x and y coordinates of element.
      org.openqa.selenium.Point point = element.getLocation();
      int xcord = point.getX();
      System.out.println("Position of the webelement from left side is "+xcord +" pixels");
      int ycord = point.getY();
      System.out.println("Position of the webelement from top side is "+ycord +" pixels");
      // Using Actions class
                      Actions action = new Actions(driver);
                      //clicking on the logo based on x coordinate and y coordinate
                      //you will be redirecting to the home page of softwaretestingmaterial.com
                      action.moveToElement(element, xcord, ycord).click().build().perform();
        
        
        
        
        
        
        
        
        
        
        Dimension i = driver.manage().window().getSize(); 
		System.out.println("Dimension x and y :"+i.getWidth()+" "+i.getHeight()); 
		//3. Get the height and width of the screen 
	//	int x = (i.getWidth()/4)+20; 
//		int y = (i.getHeight()/10)+50;
		
		
		int x =15;
		int y = 14;
		//4. Now, adjust the x and y coordinates with reference to the Windows popup size on the screen 
		//e.g. On current screen , Windows popup displays on almost 1/4th of the screen . So with reference to the same, file name x and y position is specified. 
		//Note : Please note that coordinates calculated in this sample i.e. x and y may vary as per the screen resolution settings
		robot.mouseMove(x,y); 

		//Clicks Left mouse button
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); 
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		System.out.println("Browse button clicked");
		Thread.sleep(2000);

		//Closes the Desktop Windows popup
		robot.keyPress(KeyEvent.VK_ENTER);
		System.out.println("Closed the windows popup");
		Thread.sleep(1000);

		
		
		
	}

}
