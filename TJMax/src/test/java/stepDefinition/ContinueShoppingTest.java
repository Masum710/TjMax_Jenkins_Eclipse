package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContinueShoppingTest {

	WebDriver driver;
	
//	@Given("the browser is open for continue shopping")
//	public void the_browser_is_open_for_continue_shopping() {
//		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize(); 
//	}
//
//	@Given("the User navigates to the Google search page for TJMaxx for continue shopping")
//	public void the_user_navigates_to_the_google_search_page_for_tj_maxx_for_continue_shopping() {
//		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=TjMax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIPCAAQIxgnGOMCGIAEGIoFMhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzA0OGowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
//	}
//
//	@When("the User clicks on the TJMaxx link for continue shopping")
//	public void the_user_clicks_on_the_tj_maxx_link_for_continue_shopping() {
//	    driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
//	}

	@Given("user is on TJ Max homepage for continue shopping")
	public void the_user_is_on_the_tj_maxx_homepage_for_continue_shopping() {
		//System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver (2).exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize(); 
	    driver.get("https://tjmaxx.tjx.com/store/index.jsp");
	}

	@When("user selects the {string} category")
	public void the_user_selects_the_category(String string) {
		driver.findElement(By.id("usmm-tl-cat5830001p")).click();
	}

	@When("user clicks on {string}")
	public void the_user_clicks_on(String string) {
	    driver.findElement(By.linkText("Carry-On Luggage")).click();
	}

	@When("user selects the first carry-on luggage item")
	public void the_user_selects_the_first_carry_on_luggage_item() {
		 driver.get("https://tjmaxx.tjx.com/store/shop/beauty-accessories-luggage-travel-carry-on-luggage/_/N-2327021090?mm=beauty+%26+accessories%3Af%3A+%3A2%3ACarry-On+Luggage%3ALuggage+%26+Travel");
//		 driver.findElement(By.xpath("//div[@id='style-1000891705']/div/div/a/img[2]")).click();
//		 driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/19in-Hardside-Carry-on-Spinner/1000891705?colorId=NS1003495&pos=1:3&N=2327021090");
		 driver.findElement(By.xpath("//div[@id='style-1000913283']/div/div/a/img[2]")).click();
		 //driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/19in-Hardside-Carry-on-Spinner/1000891705?colorId=NS1003495&pos=1:3&N=2327021090");
		 driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/21in-Darwin-Hardside-Carry-on-Spinner/1000913283?colorId=NS1003537&pos=1:2&N=2327021090");
		 
	}

	@When("user adds the item to the order for continue shopping")
	public void the_user_adds_the_item_to_the_order_for_continue_shopping() {
	    driver.findElement(By.id("addItemToOrder")).click();
	  
	}
	

	@When("user selects another carry-on luggage item")
	public void the_user_selects_another_carry_on_luggage_item() {
	    driver.get("https://tjmaxx.tjx.com/store/shop/beauty-accessories-luggage-travel-carry-on-luggage/_/N-2327021090?mm=beauty+%26+accessories%3Af%3A+%3A2%3ACarry-On+Luggage%3ALuggage+%26+Travel");
//	    driver.findElement(By.xpath("//*[@id=\"style-1000916188\"]/div/div[1]/a/img[2]")).click();
//	    driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/21in-Tokyo-Hardside-Carry-on-Spinner/1000916190?colorId=NS1104086&pos=1:7&N=2327021090");
	    driver.findElement(By.xpath("//div[@id='style-1000911691']/div/div/a/img[2]")).click();
	    //driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/21in-Tokyo-Hardside-Carry-on-Spinner/1000916190?colorId=NS1104086&pos=1:7&N=2327021090");
	    driver.get("https://tjmaxx.tjx.com/store/jump/product/beauty-accessories-luggage-travel-carry-on-luggage/19in-Hardside-Spinner-Carry-on/1000911691?colorId=NS1003637&pos=1:4&N=2327021090");
	}

	@When("user adds the second item to the order")
	public void the_user_adds_the_second_item_to_the_order() {
	    driver.findElement(By.id("addItemToOrder")).click();

	}

	@Then("both items should be added to the shopping bag")
	public void both_items_should_be_added_to_the_shopping_bag() {
	    driver.close();
	}


}
