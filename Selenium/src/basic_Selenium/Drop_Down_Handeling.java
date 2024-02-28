package basic_Selenium;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Handeling 
{
	public static void main(String[]args) throws InterruptedException 
	{
		// List box is a web-element which is available on web page,has multiple options and
		// user needs to select one of them.
		// for handling list box we use select class

		WebDriver d = new ChromeDriver(); 
		d.get("https://www.facebook.com/signup");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// WebElement day = d.findElement(By.xpath("//select[@id='day']"));
		// Select s1 = new Select(day);
		// s1.selectByVisibleText("28");

		// X paths

		By by_day = By.xpath("//select[@id='day']");
		By by_month = By.xpath("//select[@id='month']");
		By by_year = By.xpath("//select[@id='year']");

		// WebElements

		WebElement ele_day = d.findElement(by_day);
		WebElement ele_month = d.findElement(by_month);
		WebElement ele_year = d.findElement(by_year);

		// Actions

		// Select Day - By using Select by index method(Index start with 0).
		Select s1 = new Select (ele_day); 
		s1.selectByIndex(27);

		// Select Month - By using Select by visible text method.
		Select s2 = new Select(ele_month);  
		s2.selectByVisibleText("Dec");

		// Select Year - By using Select by value method.
		Select s3 = new Select(ele_year);  
		s3.selectByValue("1995");


		// Total options will count

		List<WebElement> total_count = s1.getOptions(); 
		int count = total_count.size();
		System.out.println("Total days are " + count);

		// All options show

		List<WebElement> total_options = s2.getOptions();
		int count1 = total_options.size();
		System.out.println("Total Months are " + count1);

		for(int i=0;i<=count1;i++)
		{
			String all_options = total_options.get(i).getText();
			System.out.println(all_options);
		}
		d.quit();
	}
}
