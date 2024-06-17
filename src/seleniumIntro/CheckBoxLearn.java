package seleniumIntro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxLearn {
public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		
		String browser="ff";
		
		if(browser.equals("ff"))
		{
			 driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("chrom"))
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chk1=driver.findElement(By.xpath("//input[1]"));
		if(!chk1.isSelected())
		{
		chk1.click();
		}
		WebElement chk2=driver.findElement(By.xpath("//input[2]"));
		
		
		if(!chk2.isSelected())
		{
		driver.findElement(By.xpath("//input[2]")).click();
		}
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
