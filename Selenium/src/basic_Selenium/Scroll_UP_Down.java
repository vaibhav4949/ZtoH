package basic_Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_UP_Down 
{
	// In Selenium Web driver, whenever we are performing operation on web 
	// element which present on web page, it may be available at any position 
	// so we need to scroll to that element, and JavaScript Executor helps us 
	// to scroll up and down.

	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js =((JavascriptExecutor)d);
		js.executeScript("scrollBy(0,1000)");            // Scroll Down

		Thread.sleep(3000);
		js.executeScript("scrollBy(0,-500)");            // Scroll up
	}
}
