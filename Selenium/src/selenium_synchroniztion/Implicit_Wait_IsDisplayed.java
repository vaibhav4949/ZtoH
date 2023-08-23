package selenium_synchroniztion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Implicit_Wait_IsDisplayed extends Synchronization_Base_Class
{
	// Selenium Synchronization - Matching the selenium script speed with browser/ application
	// Called Selenium Synchronization.
	// Implicit Wait -  The Implicit Wait in Selenium is used to tell to your web-driver to wait certain 
	// amount of time before throwing an exception.

	//X-Paths      
	static By by_username = By.xpath("//input[@id='username']");
	static By by_password = By.xpath("//input[@placeholder='Password']");
	static By by_login = By.xpath("//a[@id='loginButton']");
    static By by_display_logo = By.xpath("//div[@id='logo_aT']");

	// WebElements   
	public static WebElement ele_password()
	{
		return d.findElement(by_password);
		
	}
	public static WebElement ele_username()
	{
		return d.findElement(by_username);
		
	}
	public static WebElement ele_login()
	{
		return d.findElement(by_login);
		
	}
	public static WebElement ele_logo()
	{
		return d.findElement(by_display_logo);
	}
	
	// Actions
	public static void username()
	{
		ele_username().sendKeys("trainee");	
	}

	public static void password()
	{
		ele_password().sendKeys("trainee");	
	}      

	public static void login()
	{
		ele_login().click();
	}
	
	public static void logo()
	{
		 boolean result  = ele_logo().isDisplayed();
		 
		 if(result == true)
		 {
			 System.out.println("The Logo is Displayed Properly");
		 }
		 else
		 {
			 System.out.println("The Logo is not Displayed Properly");
		 }
	}		
}


