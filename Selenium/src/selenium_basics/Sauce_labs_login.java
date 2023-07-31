package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sauce_labs_login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();

		d.get("https://www.saucedemo.com/?ref=hackernoon.com");
		d.manage().window().maximize();

		By by_username = By.xpath("//input[@id='user-name']");
		WebElement ele_username	= d.findElement(by_username);
		ele_username.sendKeys("standard_user");
		
//		Thread.sleep(2000);
		By by_password = By.xpath("//input[@id='password']");
		WebElement ele_password = d.findElement(by_password);
		ele_password.sendKeys("secret_sauce");
		
		By by_login =By.xpath("//input[@id='login-button']");
		WebElement ele_login = d.findElement(by_login);
		ele_login.click();
		
		d.close();
	}
}
