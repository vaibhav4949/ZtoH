package selenium_basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc_Window_Handeling 
{	
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		d.manage().window().maximize();

		// For getting single window id.

		String parent_id = d.getWindowHandle();
		System.out.println("This is Main Window Id = " + parent_id);

		// For getting multiple windows id.

		Set <String> mul_id= d.getWindowHandles();
		System.out.println("This is multiple windows id = " + mul_id);

		//	String id3 = null;

		Thread.sleep(2000);

		for(String id : mul_id)
		{
			if(parent_id != id)
			{
				By by_buses = By.xpath("//a[text()='BUSES']");
				WebElement ele_buses = d.findElement(by_buses);
				ele_buses.click();
			}
			//			else if(id3 != id && id3!=parent_id)
			//			{
			//				By by_flights = By.xpath("//div[@class='Nav-icons Flights']");
			//				WebElement ele_flights = d.findElement(by_flights);
			//				ele_flights.click();
			//			}
		}
	}
}
