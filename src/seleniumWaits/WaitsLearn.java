package seleniumWaits;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import seleniumUserDefined.USerDefinedMethods;

public class WaitsLearn {
	public static WebDriver driver;


	public static void main(String[] args) throws InterruptedException, IOException {
		USerDefinedMethods o=new USerDefinedMethods();
		
		
		driver=o.browserChoice(driver,"https://elementalselenium.com/");
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div/div[2]/div/div/a"))));
		
		driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div/div[2]/div/div/a")).click();
		
		driver.quit();
	}

}
