package selenium_synchroniztion;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_waits_Main_Class extends Synchronization_Base_Class
{
	public static void main(String[]args) throws InterruptedException 
	{
		d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();	
	//	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);       // Older Version 3.149
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //  Latest version
		
		Implicit_Wait_IsDisplayed.username();
		Implicit_Wait_IsDisplayed.password();
		Implicit_Wait_IsDisplayed.login();
			
	//	Thread.sleep(2000);
		Implicit_Wait_IsDisplayed.logo();				
	}
}
