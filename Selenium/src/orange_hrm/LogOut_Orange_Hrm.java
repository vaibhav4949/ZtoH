package orange_hrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogOut_Orange_Hrm extends BaseClass_OrangeHrm 
{   
	// x-path
	static By by_Click_Profile = By.xpath("//p[@class='oxd-userdropdown-name']");
    static By by_click_logout = By.xpath("//a[text() = 'Logout']");
    
	// WebElement
	static WebElement ele_Click_Profile = d.findElement(by_Click_Profile);
	static WebElement ele_click_logout = d.findElement(by_click_logout);

	// Actions

	public static void profile_click()
	{
		ele_Click_Profile.click();
	}
	
	public static void click_logout()
	{
		ele_click_logout.click();
	}
}
