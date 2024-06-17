package iFrame;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumUserDefined.USerDefinedMethods;

public class FramesLearn {
	static WebDriver driver;
	static String url="https://the-internet.herokuapp.com/iframe";
	public static void main(String[] args) throws InterruptedException, IOException {

		USerDefinedMethods o=new USerDefinedMethods();


		driver=o.browserChoice(driver,url);

		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
		
		driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("hello");
		
		


		




	}

}
