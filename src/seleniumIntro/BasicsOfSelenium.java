package seleniumIntro;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicsOfSelenium {
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
		
		driver.get("https://www.selenium.dev/downloads/");
		
		String getCURL=driver.getCurrentUrl();
		
		driver.navigate().refresh();
		
		System.out.println(getCURL);
		
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		Thread.sleep(10000);
		
		driver.quit();
		
		
	}

}
