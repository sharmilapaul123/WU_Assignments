package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import hooks.hooksclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class stepdefinationclass {
	
	
	WebDriver driver = hooksclass.driver;
	
	@Given("user navigates to the website nseindia.com")
	public void user_navigates_to_the_website_nseindia_com() {
		System.setProperty("webdriver.chrome.driver",
                "D:/LTIMINDTREE/LTIMINDTREE_Assignments_WU/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nseindia.com/");
	}

	@When("user stores SYMBOL and LTP value in hashmap")
	public void user_stores_SYMBOL_and_LTP_value_in_hashmap() {
		WebElement element = driver.findElement(By.id("tab1_tableGainer"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		HashMap<String,String> map=new HashMap<String,String>();
		List<WebElement> symb=driver.findElements(By.xpath("//a[@class='symbol-word-break']"));
		for (WebElement symbol : symb) {
		    System.out.println("Symbol text:" + symbol.getText());
		    List<WebElement> ltps=driver.findElements(By.xpath("//a[@class='symbol-word-break']"));
		    
		}
	
	}

	@When("user retrieves all links using  For each loop")
	public void user_retrieves_all_links_using_For_each_loop() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user retrieves all links using  Stream")
	public void user_retrieves_all_links_using_Stream() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user retrieves all links using Parallel Stream")
	public void user_retrieves_all_links_using_Parallel_Stream() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user retrieves all links using  Lambda expression")
	public void user_retrieves_all_links_using_Lambda_expression() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
