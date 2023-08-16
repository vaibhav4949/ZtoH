package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_OrangeHrm extends BaseClass_OrangeHrm
{
	// x-path

	static By by_username = By.xpath("//input[@name='username']");
	static By by_password = By.xpath("//input[@name='password']");
	static By by_login = By.xpath("//button[@type='submit']");
	
	// WebElement
	
	static WebElement ele_username = d.findElement(by_username);
	static WebElement ele_password = d.findElement(by_password);
	static WebElement ele_login = d.findElement(by_login);

	// Actions
	
	public static void username(String Username)
	{
		ele_username.click();
		ele_username.sendKeys(Username);
	}
	
	public static void password(String Password)
	{
		ele_username.click();
		ele_password.sendKeys(Password);
	}
	
	public static void login_button()
	{
		ele_login.click();
	}
}

	