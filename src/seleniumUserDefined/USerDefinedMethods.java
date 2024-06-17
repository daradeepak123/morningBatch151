package seleniumUserDefined;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USerDefinedMethods {
	
	
	public WebDriver browserChoice(WebDriver driver,String url) throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"/src/config/configurations.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties config=new Properties();
		config.load(fis);
		System.out.println(config.getProperty("browser"));
		String browser=config.getProperty("browser");

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		return driver;
		
	}
	
	
	
	
	
	
	

}
