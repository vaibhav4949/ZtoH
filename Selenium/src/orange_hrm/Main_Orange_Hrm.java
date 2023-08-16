package orange_hrm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Orange_Hrm extends BaseClass_OrangeHrm 
{
	public static void main(String[]args) throws InterruptedException 
	{
		d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		d.manage().window().maximize();
		
		Thread.sleep(2000);
		Login_OrangeHrm.username("Admin");
		
		Thread.sleep(2000);
		Login_OrangeHrm.password("admin123");
		
		Thread.sleep(2000);
		Login_OrangeHrm.login_button();
		
		Thread.sleep(2000);
		LogOut_Orange_Hrm.profile_click();
		
		LogOut_Orange_Hrm.click_logout();
	}
}
