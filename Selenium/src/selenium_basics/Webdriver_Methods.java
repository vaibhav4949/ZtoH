package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods 
{
	public static void main(String[]args) throws InterruptedException 
	{
	    WebDriver d = new ChromeDriver();
        d.get("https://letcode.in/signin");    // Open URL
        d.manage().window().maximize();
        
        Thread.sleep(2000);
        By by_username = By.xpath("//input[@name='email']");
        WebElement ele_username = d.findElement(by_username);   // Enter User Name
        ele_username.sendKeys("vkangude4949@gmail.com");
        
        Thread.sleep(2000);
        By by_password = By.xpath("//input[@name='password']");  // Enter Password
        WebElement ele_password = d.findElement(by_password);
        ele_password.sendKeys("vaibhav@3721");
        
        Thread.sleep(2000);
        By by_login = By.xpath("//button[text()='LOGIN']");
        WebElement ele_login = d.findElement(by_login);
        ele_login.click();                                       // Click on login button
        
        Thread.sleep(2000);
        By by_workspace = By.xpath("//a[@id='testing']");
        WebElement ele_workspace = d.findElement(by_workspace);
        ele_workspace.click();
        
        Thread.sleep(2000);
        d.navigate().back();            // Move Back 
        
        Thread.sleep(2000);
        d.navigate().forward();         // Move Forward 
        
        Thread.sleep(2000);
        d.navigate().refresh();         // Refresh Current Page
        
        String title = d.getTitle();    // It will show the title of web page in console. 
        System.out.println(title);
        
        String url = d.getCurrentUrl(); // It is used to get the current URL of current web page.
        System.out.println(url);
        
        By by_logout = By.xpath("//a[text()='Sign out']");
        WebElement ele_logout = d.findElement(by_logout);
        ele_logout.click();

        d.quit();                           
	}
}
