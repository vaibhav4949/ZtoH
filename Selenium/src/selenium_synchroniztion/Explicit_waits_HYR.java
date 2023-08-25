package selenium_synchroniztion;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_waits_HYR extends HYR_ExplicitWait_Main_Class 
{		
	// x - Paths
	
	static By by_textbox1 = By.xpath("//button[@id='btn1']");
	static By by_textbox2 = By.xpath("//button[@id='btn2']");

	// WebElements

	public static WebElement ele_textbox1()
	{
		return  d.findElement(by_textbox1);
	}

	public static WebElement ele_textbox2()
	{   
		return d.findElement(by_textbox2);
	}

	// Actions

	public static void textbox1()
	{
		WebDriverWait wait1 = new WebDriverWait(d,Duration.ofSeconds(7));
		wait1.until(ExpectedConditions.visibilityOfAllElements(ele_textbox1()));
		//ele_textbox1().click();
	}

	public static void textbox2()
	{	
		// WebDriverWait wait2 = new WebDriverWait(d,Duration.ofSeconds(15));
		// wait2.until(ExpectedConditions.visibilityOfAllElements(ele_textbox1()));
		textbox1();
		ele_textbox2().click();
		ele_textbox1().click();
	}
}	

