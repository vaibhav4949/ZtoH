package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Calculator 
{
	public static void main(String[]args) 
	{
		WebDriver d = new ChromeDriver();
		d.get("https://testsheepnz.github.io/BasicCalculator.html");
		d.manage().window().maximize();
		
		By by_fn = By.xpath("//input[@id='number1Field']");
		WebElement ele_fn = d.findElement(by_fn);
		ele_fn.sendKeys("20");
		
		By by_sn = By.xpath("//input[@id='number2Field']");
		WebElement ele_sn = d.findElement(by_sn);
		ele_sn.sendKeys("40");
		
		By by_operator = By.xpath("//select[@id='selectOperationDropdown']");
		WebElement ele_operator = d.findElement(by_operator);
		ele_operator.sendKeys("Multiply");
		
		By by_calculate = By.xpath("//input[@id='calculateButton']");
		WebElement ele_calculate = d.findElement(by_calculate);
		ele_calculate.click();
	}
}
