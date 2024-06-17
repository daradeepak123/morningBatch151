package winHandelingLearn;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUserDefined.USerDefinedMethods;

public class NavigateAnotherWindow {

	static WebDriver driver;
	static String url="https://the-internet.herokuapp.com";
	public static void main(String[] args) throws InterruptedException, IOException {

		USerDefinedMethods o=new USerDefinedMethods();


		driver=o.browserChoice(driver,url);
		
		String parentTab=driver.getWindowHandle();
		System.out.println(parentTab);
		
		
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		String clicklnk = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		
		for(WebElement ele:links )
		{
			ele.sendKeys(clicklnk);
		}
		
		
		Set<String> tabs=driver.getWindowHandles();
		System.out.println(tabs.size());
		for(String s:tabs)
		{
			if(!s.equals(parentTab))
			{
				
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		
		driver.switchTo().window(parentTab);
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
