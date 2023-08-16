package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Store 
{
	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.demoblaze.com/index.html");
		d.manage().window().maximize();
		
		By by_click_login = By.xpath("//a[@id='login2']");
		WebElement ele_click_login = d.findElement(by_click_login);
		ele_click_login.click();
		
		By by_username = By.xpath("//input[@id='loginusername']");
		WebElement ele_username = d.findElement(by_username);
		ele_username.sendKeys("vaibhav@3721");
		
		By by_password = By.xpath("//input[@id='loginpassword']");
		WebElement ele_password = d.findElement(by_password);
		ele_password.sendKeys("vaibhav@3721");
		
		By by_login_button = By.xpath("//button[@onclick='logIn()']");
		WebElement ele_login_button = d.findElement(by_login_button);
		ele_login_button.click();
		
		Thread.sleep(2000);
		By by_logout = By.xpath("//a[@id='logout2']");
		WebElement ele_logout = d.findElement(by_logout);
		ele_logout.click();
	}
}
