package window_Handeling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spice_Jet 
{
	public static void main(String[]args) 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://www.spicejet.com/");
		d.manage().window().maximize();
		
		By by_hotels = By.xpath("//div[text()='Hotels']");
		WebElement ele_hotels = d.findElement(by_hotels);
		ele_hotels.click();	
		
		// For getting single window id.
		String parent_id = d.getWindowHandle();
		
		// For getting multiple windows id.
		Set<String> mul_id = d.getWindowHandles();
		
		for(String id : mul_id )
		{
			if(!(parent_id.equals(id)))
			{
				d.switchTo().window(id);
				System.out.println(d.switchTo().window(id));
				System.out.println(d.getTitle());
				d.close();
			}
		}		
		d.switchTo().window(parent_id);
	}
}
