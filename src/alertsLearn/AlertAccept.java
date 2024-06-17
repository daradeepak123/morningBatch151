package alertsLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertAccept {
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
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("(//button)[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button)[3]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
