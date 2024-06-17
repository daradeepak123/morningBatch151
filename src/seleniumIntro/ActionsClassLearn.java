package seleniumIntro;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassLearn {
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
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
		
		
		
		Actions act=new Actions(driver);
		
		
		act.dragAndDrop(drag, drop).build().perform();
		
//		act.contextClick().build().perform();
//		Thread.sleep(3000);
//		
//		act.contextClick(drag).build().perform();
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
