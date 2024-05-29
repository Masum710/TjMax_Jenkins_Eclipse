package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StoreLocationTest {

	WebDriver driver;
	
//	@Given("the browser is open for store location")
//	public void the_browser_is_open_for_store_location() {
//		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize(); 
//	}
//
//	@Given("the User navigates to the Google search page for TJMaxx for store location")
//	public void the_user_navigates_to_the_google_search_page_for_tj_maxx_for_store_location() {
//		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzA0OGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
//	}
//
//	@When("the User clicks on the TJMaxx link from the search results for store location")
//	public void the_user_clicks_on_the_tj_maxx_link_from_the_search_results_fro_store_location() {
//	    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
//	}

	@Given("User is on the TJMaxx home page for store location")
	public void the_user_goes_to_the_tj_maxx_home_page_for_store_location() {
		//System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver (2).exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
	    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
	}

	@When("User clicks on the store locator")
	public void the_user_clicks_on_the_store_locator() {
	    driver.findElement(By.linkText("Stores")).click();
        driver.get("https://tjmaxx.tjx.com/store/stores/storeLocator.jsp");
	}

	@When("User enters the zip code")
	public void the_user_enters_the_zip_code() {
		driver.findElement(By.id("store-location-zip")).click();
	    driver.findElement(By.id("store-location-zip")).clear();
	    driver.findElement(By.id("store-location-zip")).sendKeys("60090");
	}

	@When("User enters the city")
	public void the_user_enters_the_city() {
		driver.findElement(By.id("store-location-city")).click();
	    driver.findElement(By.id("store-location-city")).clear();
	    driver.findElement(By.id("store-location-city")).sendKeys("Wheeling");
	}

	@When("User selects the state")
	public void the_user_selects_the_state() {
		driver.findElement(By.id("store-location-state")).click();
	    new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Illinois");
	}

	@When("User clicks on the find store button")
	public void the_user_clicks_on_the_find_store_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@Then("User should see the store locations")
	public void the_user_should_see_the_store_locations() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)", "");
	     driver.close();
	}
	
	 @When("User clicks on the stores link")
	 public void the_User_clicks_on_the_stores_link() {
	     driver.findElement(By.linkText("Stores")).click();
	     driver.get("https://tjmaxx.tjx.com/store/stores/storeLocator.jsp");
	 }
	 
	 @When("User enters the city again")
	 public void the_User_enters_the_city_milford() {
		 driver.findElement(By.id("store-location-city")).click();
		 driver.findElement(By.id("store-location-city")).clear();
		 driver.findElement(By.id("store-location-city")).sendKeys("Milford");
	 }

	 @When("User selects the state again")
	 public void the_User_selects_the_state_Arizona() {
		 driver.findElement(By.id("store-location-state")).click();
		 new Select(driver.findElement(By.id("store-location-state"))).selectByVisibleText("Arizona");
	 }
	 
	 @When("User clicks on the find a store button")
	 public void the_User_clicks_on_the_find_a_store_button() {
		 driver.findElement(By.name("submit")).click(); 
	 }
	 
	@Then("User should see an error message or no store found")
	public void the_user_should_see_an_error_message_or_no_store_found() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    Thread.sleep(5000);
	    driver.quit();
	}


}
