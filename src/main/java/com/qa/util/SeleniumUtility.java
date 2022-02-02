package com.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

	public static WebDriverWait wait;
	public static WebDriver driver;
	


	public static void seleniumClick(RemoteWebDriver driver, String loc, String replaceVal) {
		try {
			String val = getXpathByReplace(loc, replaceVal);
			waitForElementClickable(driver, driver.findElement(By.xpath(val)), 10);
			driver.findElement(By.xpath(val)).click();
		} catch (NoSuchElementException | StaleElementReferenceException exc) {
			
		}

		/*
		 * finally {
		 * if(driver.findElement(By.xpath("//h1[contains(.,'our system is acting')]")).
		 * isDisplayed()) { Reporter.log("Error : Sorry, our system is acting up",true);
		 * Assert.fail(); } }
		 */
	}

	public static void seleniumClick(WebDriver driver,WebElement we) {
		/*
		 * WebDriverWait w = new WebDriverWait(driver, 45);
		 * w.until(ExpectedConditions.elementToBeClickable(we));
		 */	try {
			if (we.isDisplayed())
				we.click();
		} catch (NoSuchElementException | StaleElementReferenceException exc) {
			
		}
	}

	public static void javaExecutorClick(WebDriver driver, By by) {
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(by));
	}


	public static void seleniumType(RemoteWebDriver driver, String loc, String replaceVal, String type) {
		try {
			String val = getXpathByReplace(loc, replaceVal);
			if (seleniumGetText(driver, loc, replaceVal).length() > 0) {
				driver.findElement(By.xpath(val)).clear();
			}
			driver.findElement(By.xpath(val)).sendKeys(type);
		} catch (NoSuchElementException | StaleElementReferenceException exc) {}
	}

	public static void seleniumType(WebDriver driver,WebElement we, String type) {
		try {
			WebDriverWait w = new WebDriverWait(driver, 45);
			w.until(ExpectedConditions.visibilityOf(we));
		
			we.clear();
			we.sendKeys(type);
			/*
			 * for (int i = 0; i < type.length(); i++){
			 * we.sendKeys(Character.toString(type.charAt(i)));
			 * wait.until(attributeContains(we, "value", type.substring(0, i))); }
			 */
		} catch( NoSuchElementException | StaleElementReferenceException exc) {}
	}

	public static String seleniumGetText(WebDriver driver, String loc, String replaceVal) {
		try {
			String val = getXpathByReplace(loc, replaceVal);
			return driver.findElement(By.xpath(val)).getText();
		} catch (NoSuchElementException | StaleElementReferenceException exc) {
			
		}
		return null;
	}

	public static StringBuffer seleniumGetText(RemoteWebDriver driver, List<WebElement> list) {
		StringBuffer sb = new StringBuffer();
		try {
			for (WebElement we : list) {
				sb.append(seleniumGetText(we));
				sb.append(" ");

			}

		} catch (NoSuchElementException | StaleElementReferenceException exc) {
			}
		return sb;
	}

	public static String seleniumGetText(WebElement we) {
		try {
			return we.getText();
			} catch (NoSuchElementException | StaleElementReferenceException exc) {
			//Reporter.log("No such element found::locator value" + we.toString(), true);
			// Assert.fail();
		}
		return null;
	}

	public static String getXpathByReplace(String loc, String replacedVal) {
		return loc.replaceAll("(?i)" + "nameLbl", replacedVal);
	}


	public static String getEleByMultiReplace(String loc, String replacedVal, String replaced2ndVal) {
		String xpath;
		xpath = loc.replaceAll("(?i)" + "nameLbl", replacedVal);
		xpath = xpath.replaceAll("(?i)" + "valueLbl", replaced2ndVal);
		return xpath;
	}

	public static boolean isElementPresent(RemoteWebDriver driver, String loc, String replaceVal) {
		try {
			String val = getXpathByReplace(loc, replaceVal);
			driver.findElement(By.xpath(val)).isDisplayed();
			return true;
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}

	public static boolean isElementPresent(WebElement we) {
		try {
			
			we.isDisplayed();
			return true;
		} catch (NoSuchElementException | StaleElementReferenceException exc) {
			return false;
		}
	}

	public static boolean textPresentAtPageSource(WebDriver driver, String text) {
		if (driver.getPageSource().contains(text))
			return true;
		else
			return false;
	}

	public static boolean isElementVisible(RemoteWebDriver driver, String loc, String replaceVal) {
		try {
			String val = getXpathByReplace(loc, replaceVal);
			driver.findElement(By.xpath(val));
			return true;
		} catch (NoSuchElementException | StaleElementReferenceException e) {
			return false;
		}
	}

	public static String getAttributeValue(RemoteWebDriver driver, String loc, String replaceVal, String attVal) {
		String val = getXpathByReplace(loc, replaceVal);
		return driver.findElement(By.xpath(val)).getAttribute(attVal);
	}

	public static String getAttributeValue(WebElement we, String attVal) {
		String attribute = we.getAttribute(attVal);
		if (attribute == null) {
			return "false";
		} else
			return attribute;
	}

	public static void vListItem(WebElement we, String text) {
		boolean eleAvailable = false;
		Select select = new Select(we);
		List<WebElement> list = select.getOptions();
		for (WebElement e : list) {
			if (e.getText().contains(text)) {
				//Reporter.log(text + " found into list", true);
				eleAvailable = true;
				return;
			}
		}

		if (eleAvailable == false) {
			//Reporter.log(text + " isn't found into list", true);
			//AssertJUnit.assertTrue(false);
		}

	}

	public static void selectItemFromList(WebElement we, String text) {
		try {
			Select select = new Select(we);
			List<WebElement> list = select.getOptions();
			for (WebElement e : list) {
				if (e.getText().contains(text)) {
					select.selectByVisibleText(e.getText());
					return;
				}
			}
		} catch (NoSuchElementException | StaleElementReferenceException exc) {
			}
	}

	public static void waitForElement(RemoteWebDriver driver, By loc, String waitType) {

		switch (waitType) {

		case "clickable":
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(loc)));
			break;
		case "visible":
			wait.until(ExpectedConditions.presenceOfElementLocated(loc));
			break;

		}
	}

	public static boolean waitForElementVisibility(WebDriver driver, WebElement we, int Time) {
		try {
			new WebDriverWait(driver, Time).until(ExpectedConditions.visibilityOf(we));
			return true;
		} catch (Exception e) {
		//	Reporter.log("<p>Element:" + " is not visible after waitng after " + Time + " seconds.");
			//Reporter.log("" + we);
			return false;
		}

	}

	public static boolean waitForElementInVisibility(RemoteWebDriver driver, WebElement we, int Time) {
		try {
			new WebDriverWait(driver, Time).until(ExpectedConditions.invisibilityOf(we));
			return true;
		} catch (Exception e) {
				return false;
		}

	}

	public static boolean waitForElementClickable(RemoteWebDriver driver, WebElement we, int Time) {
		try {
			new WebDriverWait(driver, Time).until(ExpectedConditions.elementToBeClickable(we));
			return true;
		} catch (Exception e) {
		//	Reporter.log("<p>Element: " + " isnot clickable after waitng after " + Time + " seconds.</p>");
			return false;
		}

	}



}
