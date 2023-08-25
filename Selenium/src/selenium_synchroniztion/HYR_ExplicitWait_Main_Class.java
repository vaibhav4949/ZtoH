package selenium_synchroniztion;

import org.openqa.selenium.chrome.ChromeDriver;

public class HYR_ExplicitWait_Main_Class extends Synchronization_Base_Class 
{	
	public static void main(String[]args) 
	{
		// Explicit Wait Tell to the web-driver ,To wait for specified condition or maximum time 
		// Exceed before throwing an exception like element not visible exception.
		// Explicit wait = Specified condition + waiting time.

		d = new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/waits-demo.html");
		d.manage().window().maximize();

		//Explicit_waits_HYR.textbox1();
		Explicit_waits_HYR.textbox2();		
	}
}
