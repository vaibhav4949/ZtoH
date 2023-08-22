package window_Handeling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I_frame_demo_ui_vision 
{
	public static void main(String[]args) throws InterruptedException 
	{   
		WebDriver d = new ChromeDriver();
		d.get("https://ui.vision/demo/webtest/frames/");
		d.manage().window().maximize();

		d.switchTo().frame(0);     // By using Index

		By by_frame1 = By.xpath("//input[@name='mytext1']");
		WebElement ele_frame1 = d.findElement(by_frame1);
		ele_frame1.sendKeys("Frame - 1");

		d.switchTo().defaultContent();   // It Will go to Main Frame.	
		d.switchTo().frame(1);  
		
		By by_frame2 = By.xpath("//input[@name='mytext2']");
		WebElement ele_frame2 = d.findElement(by_frame2);
		ele_frame2.sendKeys("Frame - 2");	
		
		d.switchTo().parentFrame();	
		d.switchTo().frame(2);
		
		By by_frame3 = By.xpath("//input[@name='mytext3']");
		WebElement ele_frame3 = d.findElement(by_frame3);
		ele_frame3.sendKeys("Frame - 3");
				
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor)d;
//		js.executeScript("scrollBy(0,2000)");
//		
//		d.switchTo().defaultContent();
//		
//		By by_mul_Choice = By.xpath("(//div[@class='AB7Lab Id5V1'])[2]");
//		WebElement ele_by_mul_Choice = d.findElement(by_mul_Choice);
//		ele_by_mul_Choice.click();
         
		d.switchTo().defaultContent();
		By by_frame4 = By.xpath("//frame[@src='frame_4.html']");   // By using Web-element
		WebElement ele_frame4 = d.findElement(by_frame4);
		d.switchTo().frame(ele_frame4);
		
		By by_textframe4 = By.xpath("//input[@name='mytext4']");
		WebElement ele_textframe4 = d.findElement(by_textframe4);
		ele_textframe4.sendKeys("Frame - 4");		
	}
}
