package seleniumIntro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {
	static WebDriver driver;
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
		
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		
		String txt=driver.findElement(By.xpath("//h2[contains(text(),'For')]")).getText();
		System.out.println(txt);
		if(txt.contains("Password"))
		{
			System.out.println("you are on the right page");
			
			Point p=driver.findElement(By.xpath("//input[@id='email']")).getLocation();
			
			System.out.println(p.x+"   "+p.y);
			
			Dimension d=driver.findElement(By.xpath("//input[@id='email']")).getSize();
			System.out.println(d.height+"   "+d.width);
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
			driver.findElement(By.xpath("//button[@id='form_submit']")).click();
			
			String newText=driver.findElement(By.xpath("//h1")).getText();
			
			System.out.println(newText);
			
			
		}
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
