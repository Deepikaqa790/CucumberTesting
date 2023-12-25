package StepDefinations;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	
	WebDriver driver =null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Browser is open");
	    String projectPath = System.getProperty("user.dir");
	    System.out.println("Project path is: +projectPath");
	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver =new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	    driver.manage().window().maximize();
	    
	    
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	 System.out.println("User is on google search page");
	 driver.navigate().to("https://google.com");
	 
	}

	@When("user enters a text in dsearch box")
	public void user_enters_a_text_in_dsearch_box() throws InterruptedException {
		System.out.println("User enters a text in search box");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Cucumber Framework Questions");
		 
		 Thread.sleep(2000);

	    	}

	@And("hits enter")
	public void hits_enter() {
	    System.out.println("User clicks enter");
	    
	    driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
	}

	@Then("user is navegated to search results")
	public void user_is_navegated_to_search_results() {
	    System.out.println("User got the result");
	    
	    driver.quit();
	}


}
