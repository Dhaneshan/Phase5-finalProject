package Automate_WebApplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FaceBook_Ecommerece {
	public WebDriver Driver;

	@SuppressWarnings("deprecation")
	@Test(priority = 1)
	public void ChromeE_Commerece() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32/chromedriver.exe");
		Driver = new ChromeDriver();
		// Navigate to the Flipkart homepage (https://www.flipkart.com/)
		// Determine a page load time with a performance test
		long start = System.currentTimeMillis();
		System.out.println("Facebook Webpage is opening in Chrome Browser");
		Driver.get("https://www.flipkart.com/");
		System.out.println("Window is Maximize");
		Driver.manage().window().maximize();
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load - " + totalTime / 1000 + " Seconds");
		// Search for a product, say, “iPhone 13” under the “Mobile” category
		Driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		Driver.findElement(By.className("L0Z3Pu")).click();
		// Check if the images are loaded and visible till the screen height only

		Driver.get(
				"https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement find = Driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		// Javascript executor to check image
		Boolean visible = (Boolean) ((JavascriptExecutor) Driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", find);

		// verify if status is true
		if (visible) {
			System.out.println("Image is present");
		} else

		{
			System.out.println("Image is not present");
		}

		// Check if the page has a scroll feature
		Driver.get(
				"https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// identify element
		WebElement Ending = Driver.findElement(By.xpath("//*[text()='Careers']"));
		// Javascript executor to scroll to the element
		((JavascriptExecutor) Driver).executeScript("arguments[0].scrollIntoView(true);", Ending);
		Thread.sleep(200);
		// get current scroll position with Javascript Executor
		// Check the frequency at which the content will be refreshed while scrolling
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		double d = (Double) js.executeScript("return window.pageYOffset;");
		System.out.println("Scroll position after scrolling upto to this point : " + d);
		System.out.println("Check the frequency at which the content will be refreshed while scrolling Completed");
		Driver.navigate().refresh();

		// to perform Scroll on application using Selenium
		System.out.println("Window screnn scroll down by given value");
		JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		System.out.println("Window screnn scroll up by given value");
		JavascriptExecutor js12 = (JavascriptExecutor) Driver;
		js12.executeScript("window.scrollBy(0,-250)", "");

		// Verify that it navigates to the bottom of the page
		JavascriptExecutor js11 = (JavascriptExecutor) Driver;
		js11.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Verify that it navigates to the bottom of the page Completed");

		Driver.quit();

	}

	@SuppressWarnings("deprecation")
	@Test(priority = 2)
	public void FireFox_ECommerece() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver-v0.32.0-win64/geckodriver.exe");
		Driver = new FirefoxDriver();
		// Navigate to the Flipkart homepage (https://www.flipkart.com/)
		// Determine a page load time with a performance test
		System.out.println("Facebook Webpage is opening in FirFox Browser");
		long start = System.currentTimeMillis();

		Driver.get("https://www.flipkart.com/");
		System.out.println("Window is Maximize");
		Driver.manage().window().maximize();
		long finish = System.currentTimeMillis();
		long totalTime = finish - start;
		System.out.println("Total Time for page load - " + totalTime / 1000 + " Seconds");
		// Search for a product, say, “iPhone 13” under the “Mobile” category
		Driver.findElement(By.className("_3704LK")).sendKeys("iphone 13");
		Driver.findElement(By.className("L0Z3Pu")).click();
		// Check if the images are loaded and visible till the screen height only

		Driver.get(
				"https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");

		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement find = Driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']"));
		// Javascript executor to check image
		Boolean visible = (Boolean) ((JavascriptExecutor) Driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", find);

		// verify if status is true
		if (visible) {
			System.out.println("Image is present");
		} else

		{
			System.out.println("Image is not present");
		}

		// Check if the page has a scroll feature
		Driver.get(
				"https://www.flipkart.com/search?q=iphone%2013&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// identify element
		WebElement Ending = Driver.findElement(By.xpath("//*[text()='Careers']"));
		// Javascript executor to scroll to the element
		((JavascriptExecutor) Driver).executeScript("arguments[0].scrollIntoView(true);", Ending);
		Thread.sleep(200);
		// get current scroll position with Javascript Executor
		// Check the frequency at which the content will be refreshed while scrolling
		JavascriptExecutor js = (JavascriptExecutor) Driver;
		double d = (Double) js.executeScript("return window.pageYOffset;");
		System.out.println("Scroll position after scrolling upto to this point : " + d);
		System.out.println("Check the frequency at which the content will be refreshed while scrolling Completed");
		Driver.navigate().refresh();

		// to perform Scroll on application using Selenium
		System.out.println("Window screnn scroll down by given value");
		JavascriptExecutor js1 = (JavascriptExecutor) Driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		System.out.println("Window screnn scroll up by given value");
		JavascriptExecutor js12 = (JavascriptExecutor) Driver;
		js12.executeScript("window.scrollBy(0,-250)", "");

		// Verify that it navigates to the bottom of the page
		JavascriptExecutor js11 = (JavascriptExecutor) Driver;
		js11.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println("Verify that it navigates to the bottom of the page Completed");

		Driver.quit();

	}
}
