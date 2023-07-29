package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_Login 
{
	public static void main(String[]args) throws InterruptedException 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
	
		Thread.sleep(2000);
		By by_username = By.xpath("//input[@name='username']");
		WebElement ele_username = d.findElement(by_username);
		ele_username.sendKeys("Admin");
	
		Thread.sleep(2000);
		By by_password = By.xpath("//input[@name='password']");
		WebElement ele_password = d.findElement(by_password);
		ele_password.sendKeys("admin123");

		Thread.sleep(2000);
		By by_login = By.xpath("//button[@type='submit']");
		WebElement ele_login = d.findElement(by_login);
		ele_login.click();	
		
		d.close();
	}	
}
