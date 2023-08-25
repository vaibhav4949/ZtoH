package selenium_synchroniztion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Fluent_Wait extends Fluent_wait_Main_Class
{
	// x - Paths

	static By by_textbox1 = By.xpath("//button[@id='btn1']");
	static By by_textbox2 = By.xpath("//button[@id='btn2']");
	
	// WebElement

	public static WebElement by_textbox1()
	{
		return d.findElement(by_textbox1);
	}
	
	public static WebElement by_textbox2()
	{
		return d.findElement(by_textbox2);
	}
	
	// Actions
	
	public static void textbox1()
	{
		by_textbox1().click();
	}
	
	public static void textbox2()
	{
		by_textbox2().click();
	}
}
