package basic_Selenium;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Diamention_Point_Class 
{
	public static void main(String[]args) 
	{
		// It is used to check scenario whether loaded web page size is same as per user story.

		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// *Get size* - Check Height and Width Of Web page.
		// There are two ways to check the Size Of web page.
		// 1 st way -->  

		int height = d.manage().window().getSize().getHeight();
		System.out.println("Height of this webpage is " + height);

		int width = d.manage().window().getSize().getWidth();
		System.out.println("Width of this webpage is " + width);

		// 2 nd Way -->

		Dimension size = d.manage().window().getSize();
		int height1 = size.getHeight();
		int width1  = size.getWidth();

		System.out.println("Height and Width are " + height1 + " " + width1);

		// *Get Position* - Check Position Of Web page. 

		Point pos = d.manage().window().getPosition();

		float p = pos.getX();
		float q = pos.getY();

		System.out.println("The Position is " + p + q);

		// *Set Size*

		Dimension di = new Dimension(300,500);
		d.manage().window().setSize(di);

		// *Set Position*

		Point po = new Point(100,200);
		d.manage().window().setPosition(po);

		//	d.close();
	}
}
