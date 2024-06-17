package seleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
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
		
		driver.get("https://www.browserstack.com/");
		WebElement ele=driver.findElement(By.xpath("//button[text()='Developers']"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(ele).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}
