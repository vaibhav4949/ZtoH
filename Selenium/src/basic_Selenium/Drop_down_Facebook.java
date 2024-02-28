package basic_Selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down_Facebook 
{
	public static void main(String[]args) 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demoqa.com/select-menu");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		By select_value = By.xpath("//div[text()='Select Option']");
		WebElement ele_select_value = d.findElement(select_value);
		Select s1 = new Select(ele_select_value );
		s1.selectByVisibleText("Group 1, option 2");                       // Select day by using index

		//		By disabled_lable = By.xpath("//select[@id='demo_groups-dropdown-selected']");
		//		WebElement ele_disabled_lable = d.findElement(disabled_lable);
		//		Select s2 = new Select(ele_disabled_lable);
		//		s2.selectByVisibleText("Five");                // Select Month by using text

		//		By by_year = By.xpath("//select[@id='year']");
		//		WebElement ele_year = d.findElement(by_year);
		//		Select s3 = new Select(ele_year);
		//		s3.selectByValue("1995");
		//
		//        List<WebElement> total_days = s1.getOptions();
		//        int total_day_size = total_days.size();
		//        System.out.println("Total days are " + total_day_size);
		d.close();
	}
}
