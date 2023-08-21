package window_Handeling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_frame_demo_ui_vision 
{
	public static void main(String[]args) 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://ui.vision/demo/webtest/frames/");
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		By by_frame1 = By.xpath("//input[@name='mytext1']");
		WebElement ele_frame1 = d.findElement(by_frame1);
		ele_frame1.sendKeys("Frame - 1");
		
		d.switchTo().defaultContent();   // It Will go to Main Frame.
		
		
		

	}
}
