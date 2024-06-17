package seleniumIntro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Enter desired browser");
		Scanner sc=new Scanner(System.in);
		String browser=sc.next();
		
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
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		
		
		Select slt=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
		
		slt.selectByVisibleText("Option 1");
		
		Thread.sleep(3000);
		
		slt.selectByValue("2");
		
		Thread.sleep(3000);
		
		slt.selectByIndex(1);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}

}
