package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class hooksclass {
	
	public static WebDriver driver;
	
	@BeforeStep
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@AfterStep
	public void afterannotation()
	{
		driver.quit();
	}

}
