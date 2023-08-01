package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Cart 
{
	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		d.manage().window().maximize();

		Thread.sleep(2000);
		By by_username = By.xpath("//input[@id ='input-email']");
		WebElement ele_username = d.findElement(by_username);
		ele_username.sendKeys("vkangude4949@gmail.com");

		Thread.sleep(2000);
		By by_password = By.xpath("//input[@id ='input-password']");
		WebElement ele_password = d.findElement(by_password);
		ele_password.sendKeys("vaibhav@3721");

		Thread.sleep(2000);
		By by_login = By.xpath("//button[text() ='Login']");
		WebElement ele_login = d.findElement(by_login);
		ele_login.click();
	}
}
