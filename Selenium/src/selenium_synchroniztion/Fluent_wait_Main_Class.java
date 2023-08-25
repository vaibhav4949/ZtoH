package selenium_synchroniztion;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait_Main_Class extends Synchronization_Base_Class 
{
	public static void main(String[]args) 
	{	
	    d = new ChromeDriver();
	    d.get("https://www.hyrtutorials.com/p/waits-demo.html");
	    d.manage().window().maximize();
	    
	    FluentWait<WebDriver> fw = new FluentWait<WebDriver>(d);
	    fw.withTimeout(Duration.ofSeconds(10));
	    
	    Fluent_Wait.textbox1();
	    Fluent_Wait.textbox2();
	}
}
