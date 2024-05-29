package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchItemTest {

	WebDriver driver;
	
//	@Given("the browser is open for searchitem")
//	public void the_browser_is_open_for_searchitem() {
//		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//	}
//
//	@Given("the User navigates to the Google search page for searchitem")
//	public void the_user_navigates_to_the_google_search_page_for_searchitem() {
//		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzA0OGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
//	}
//
//	@When("the User clicks on the TJMaxx link from the search results for searchitem")
//	public void the_user_clicks_on_the_tj_maxx_link_from_the_search_results_for_searchitem() {
//	    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
//	}

	@Given("User is on the TJMaxx home page for searchitem")
	public void the_user_goes_to_the_tj_maxx_home_page_for_searchitem() {
		//System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver (2).exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tjmaxx.tjx.com/store/index.jsp");
	}

	@When("User searches for an item")
	public void the_user_searches_for_an_item() {
        driver.findElement(By.id("search-text-input")).click();
        driver.findElement(By.id("search-text-input")).clear();
        driver.findElement(By.id("search-text-input")).sendKeys("plants");
	}

	@When("User clicks on the search button")
	public void the_user_clicks_on_the_search_button() {
        driver.findElement(By.id("search-submit-button")).click();
        driver.get("https://tjmaxx.tjx.com/store/shop/?_dyncharset=utf-8&initSubmit=true&Ntt=plants&qfh_sch=Search");
	}

	@When("User selects the item from the search results")
	public void the_user_selects_the_item_from_the_search_results() {
        driver.findElement(By.xpath("//img[@alt='4ft Rubber Plant In Matte Pot']")).click();
        driver.get("https://tjmaxx.tjx.com/store/jump/product/4ft-Rubber-Plant-In-Matte-Pot/1000847759?colorId=NS1357773&pos=1:3&Ntt=plants");
	}

	@When("User adds the item to the cart")
	public void the_user_adds_the_item_to_the_cart() {
        driver.findElement(By.id("addItemToOrder")).click();

	}

	@Then("item should be added to the cart successfully")
	public void the_item_should_be_added_to_the_cart_successfully(){
        driver.quit();
	}


}
