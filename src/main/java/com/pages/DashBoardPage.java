package com.pages;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	private WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void DashBoardCount() throws InterruptedException {

		// driver.findElement(By.xpath("//a[contains(text(),'DASHBOARD')]")).click();
		Thread.sleep(4000);
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='overviewDisplay']//span/span[2]"));
		List<WebElement> count = driver.findElements(By.xpath("//div[@class='overviewDisplay']/div/span/span[3]"));

		for (int i = 1; i <=count.size(); i++) {
			
			System.out.println("The count size is "+count.size());
			driver.findElement(By.xpath("//div[@class='overviewDisplay']/div/span["+i+"]/span[3]")).click();
		//	count.get(i).getText();
			//count.get(i).click();
			Thread.sleep(3000);
			try
			{
			String Historycount =driver.findElement(By.xpath("//span[@class='showingCount']")).getText();

			System.out.println("The History count is"+Historycount);
			}
			catch(Exception e)
			{
			System.out.println("Count is displaying zero");
			}
			
			
			
			
			driver.findElement(By.xpath("//a[normalize-space()='DASHBOARD']")).click();
			Thread.sleep(5000);
			

		//	HashMap<String, String> hmap = new HashMap<String, String>();
			/*
			 * hmap.put(count.get(i).getText(), name.get(i).getText()); Set set =
			 * hmap.entrySet(); Iterator iterator = set.iterator();
			 * 
			 * while (iterator.hasNext()) { Map.Entry mentry = (Map.Entry) iterator.next();
			 * 
			 * System.out.println(mentry.getKey() + "" + mentry.getValue());
			 * 
			 */			
			//String val = "Key set is" + hmap.keySet();
			//	System.out.println("the value is " + val);
			}

		}
	
	
	public void Dashboardpendingapprover()
	{
		
	String count =driver.findElement(By.xpath("//div[@class='pendingPayments isFlex']//aside[1]/div[1]/div/following-sibling::strong")).getText();
	System.out.println("The count is "+count);	
	}
	
	
	

	

	public void DashBoardcounttwo() throws InterruptedException {

		// driver.findElement(By.xpath("//a[contains(text(),'DASHBOARD')]")).click();
		Thread.sleep(4000);
		List<WebElement> name = driver
				.findElements(By.xpath("//aside[@class='paymentStatusReviewer']//div//span[2]//span[1]"));
		List<WebElement> count = driver.findElements(By.xpath("//aside[@class='paymentStatusReviewer']//div//strong"));

		Map<String, String> hmap = new LinkedHashMap<String, String>();
		count.stream().forEach(itm -> {
			int nameCount = 0;
			hmap.put(itm.getText(), name.get(nameCount).getText());
			nameCount++;
		});

		for (Map.Entry<String, String> entry : hmap.entrySet()) {
			System.out.println("Key:" + entry.getKey() + "   Value:" + entry.getValue());
		}

		System.out.println(hmap.keySet());
		System.out.println(hmap.values());

	}
}
