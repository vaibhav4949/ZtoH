package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Exercise 
{
	public static void main(String[]args) 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.automationexercise.com/login");
		d.manage().window().maximize();

		By by_username = By.xpath("//input[@data-qa='login-email']");
		WebElement ele_username = d.findElement(by_username);
		ele_username.sendKeys("vkangude4949@gmail.com");
        
		WebElement ele_password = d.findElement(By.xpath("//input[@data-qa='login-password']"));
		ele_password.sendKeys("vaibhav@3721");  // Only for Understanding

        By by_login = By.xpath("//button[@data-qa='login-button']");
        WebElement ele_login = d.findElement(by_login);
        ele_login.click();
        
        By by_logout = By.xpath("//a[@href='/logout']");
        WebElement ele_logout = d.findElement(by_logout);
        ele_logout.click();
	}
}
