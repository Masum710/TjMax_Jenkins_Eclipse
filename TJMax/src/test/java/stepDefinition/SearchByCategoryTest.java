package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchByCategoryTest {

	WebDriver driver;
	
//	@Given("the browser is open for categorysearch")
//	public void the_browser_is_open_for_categorysearch() {
//		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize(); 
//	}
//
//	@Given("the User navigates to the Google search page for categorysearch")
//	public void the_user_navigates_to_the_google_search_page_for_categorysearch() {
//		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzA0OGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
//	}
//
//	@When("the User clicks on the TJMaxx link from the search results for categorysearch")
//	public void the_user_clicks_on_the_tj_maxx_link_from_the_search_results_for_categorysearch() {
//	    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
//	}

	@Given("User is on the TJMaxx home page for categorysearch")
	public void the_user_goes_to_the_tj_maxx_home_page_for_categorysearch() {
		//System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver (2).exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
	    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
	}

	@When("User navigates to the women's category")
	public void the_user_navigates_to_the_women_s_category() {
		driver.findElement(By.id("usmm-tl-cat260062")).click();
        driver.get("https://tjmaxx.tjx.com/store/shop/women/_/N-2107733895?tn=2");
	}

	@When("User navigates to the women's perfume section")
	public void the_user_navigates_to_the_women_s_perfume_section() {
        driver.get("https://tjmaxx.tjx.com/store/shop/womens-perfume/_/N-944410246?ln=5:2");
	}

	@When("User selects the perfume item")
	public void the_user_selects_the_perfume_item() {
		driver.findElement(By.xpath("//span[@id='product-brand-1000891758']/span")).click();
	    driver.findElement(By.xpath("//img[@alt='Made In France 6.7oz Aqua Allegoria Pera Granita Pear Eau De Toilette']")).click();
	}

	@When("User adds the item to the cart for categorysearch")
	public void the_user_adds_the_item_to_the_cart_for_categorysearch() {
        driver.findElement(By.id("addItemToOrder")).click();
        
    }

	@Then("item should be in the cart")
	public void the_item_should_be_in_the_cart() {
		 driver.quit();
	}

}
