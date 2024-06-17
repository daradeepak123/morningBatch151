package webElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementsLearn {
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
		
		
		driver.get("https://the-internet.herokuapp.com/");
		
		
		
		List<WebElement> lst=driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:lst)
		{
			System.out.println(ele.getText());
		}
		driver.quit();
		
		
		

	}

}
