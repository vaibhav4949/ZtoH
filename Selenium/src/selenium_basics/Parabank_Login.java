package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank_Login 
{
	public static void main(String[]args) 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://parabank.parasoft.com/parabank/openaccount.htm");
		d.manage().window().maximize();
		
		By by_username = By.xpath("//input[@name =\"username\"]");
		WebElement ele_username = d.findElement(by_username);
		ele_username.sendKeys("vaibhav@2812");
		
	}	
}
