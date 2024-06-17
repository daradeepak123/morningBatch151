package seleniumIntro;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLoginPage {
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
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		// email deepak@gmail.com    or ph no 999999999
		driver.findElement(By.tagName("input")).sendKeys("999999999");
		driver.findElement(By.id("pass")).sendKeys("hello123");
		driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
