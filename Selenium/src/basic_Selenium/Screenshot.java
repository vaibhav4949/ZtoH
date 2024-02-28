package basic_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[]args) throws IOException 
	{
		// Note - Add Apache POI Libraries.
		// When we have to make proof of any defect while performing testing of functionality 
		// so we take screenshot or whenever our test script is pass or fail we need screenshot.
        
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		TakesScreenshot ts = ((TakesScreenshot)d);  // Down casting(Take screenshot is Interface)
		File source = ts.getScreenshotAs(OutputType.FILE);  // Get Screenshot is a method
		File destination = new File("E:\\vaibhav\\Selenium\\Screenshot1\\amazon.png");
		FileUtils.copyFile(source,destination);    // Merge source and destination
		d.close();
	}
}
