package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GiftCardTest {

	WebDriver driver;

//	@Given("the browser is open for gift card purchase")
//	public void the_browser_is_open_for_gift_card_purchase() {
//		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//
//	@Given("the User navigates to the Google search page for TJMaxx for gift card purchase")
//	public void the_user_navigates_to_the_google_search_page_for_tj_maxx_for_gift_card_purchase() {
//		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TewNE8yLlZgNGB0YPBiK8nKTayoAABBwAYF&q=tjmaxx&oq=Tjmax&gs_lcrp=EgZjaHJvbWUqFQgBEC4YJxjHARjJAxjRAxiABBiKBTIGCAAQRRg8MhUIARAuGCcYxwEYyQMY0QMYgAQYigUyBggCEEUYOTIKCAMQABiSAxiABDIGCAQQRRg8MgYIBRBFGDwyBggGEEUYPDIGCAcQRRg80gEIMzQyMWowajGoAgCwAgA&sourceid=chrome&ie=UTF-8");
//
//	}
//
//	@When("the User clicks on the TJMaxx link from the search results for gift card purchase")
//	public void the_user_clicks_on_the_tj_maxx_link_from_the_search_results_for_gift_card_purchase() {
//		driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div/div/div/div/span/a/h3")).click();
//
//	}

	@Given("User is on the TJMaxx home page for gift card purchase")
	public void the_user_goes_to_the_tj_maxx_home_page_for_gift_card_purchase() {
		//System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver (2).exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tjmaxx.tjx.com/store/index.jsp");
	}

	@When("User selects E-Gift Cards")
	public void the_user_selects_e_gift_cards() {
		driver.findElement(By.xpath("//*[@id=\"usmm-dd-cat2170018p\"]/div[1]/div/ul[4]/li/ul/li[1]/a"));

	}

	@Then("User navigate to the TJ Maxx Cashstar website")
	public void user_navigate_to_the_tj_maxx_cashstar_website() {
		driver.get("https://tjmaxx.cashstar.com/store/recipient?locale=en-us&mm=gifts%3Af%3A+%3A1%3AE-Gift+Cards%3AGifting+Made+Easy");
	}

	@When("User wait for the recipient name input field to be visible")
	public void user_wait_for_the_recipient_name_input_field_to_be_visible() {
		WebDriverWait wait = new WebDriverWait(driver, 20); // 20 sec
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipientName-input")));
	}

	@When("User enter name in the recipient name field")
	public void user_enter_in_the_recipient_name_field() {
		driver.findElement(By.id("recipientName-input")).click();
		driver.findElement(By.id("recipientName-input")).clear();
		driver.findElement(By.id("recipientName-input")).sendKeys("Stella");
	}

	@When("User enter name in the sender name field")
	public void user_enter_in_the_sender_name_field() {
		driver.findElement(By.id("senderName-input")).click();
		driver.findElement(By.id("senderName-input")).clear();
		driver.findElement(By.id("senderName-input")).sendKeys("Pooja");
		// Thread.sleep(1000);
	}

	@When("User click on the next button")
	public void user_click_on_the_next_button() {
		driver.findElement(By.xpath("//div[@id='app-root']/div/main/div/form/div/button/span")).click();
	}

	@When("User click on giftcard submit button")
	public void user_click_on_giftcard_submit_button() {
		WebDriverWait wait1 = new WebDriverWait(driver, 20); // 20 sec
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("User wait for the amount selection to be visible")
	public void user_wait_for_the_amount_selection_to_be_visible() {
		WebDriverWait wait2 = new WebDriverWait(driver, 20); // 20 sec
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount-0")));
	}

	@When("User select the first available amount")
	public void user_select_the_first_available_amount() {
		driver.findElement(By.id("amount-0")).click();
	}

	@When("User wait for the message input field to be visible")
	public void user_wait_for_the_message_input_field_to_be_visible() {
		WebDriverWait wait3 = new WebDriverWait(driver, 20); // 20 sec
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("message-input")));
	}

	@When("User enter message in the message field")
	public void user_enter_in_the_message_field() {
		driver.findElement(By.id("message-input")).click();
		driver.findElement(By.id("message-input")).clear();
		driver.findElement(By.id("message-input")).sendKeys("Happy Birthday !");
	}

	@When("User wait for the recipient email input field to be visible")
	public void user_wait_for_the_recipient_email_input_field_to_be_visible() {
		driver.findElement(By.xpath("//div[@id='app-root']/div/main/div/form/div/button/span")).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 20); // 20 sec
		wait4.until(ExpectedConditions.visibilityOfElementLocated(By.id("recipientEmail-input")));
	}

	@When("User enter email in the recipient email field")
	public void user_enter_in_the_recipient_email_field() {
		driver.findElement(By.id("recipientEmail-input")).click();
		driver.findElement(By.id("recipientEmail-input")).clear();
		driver.findElement(By.id("recipientEmail-input")).sendKeys("stella@gmail.com");
	}

	@When("User confirm the recipient email by entering again")
	public void user_confirm_the_recipient_email_by_entering_again() {
		driver.findElement(By.id("recipientEmailConfirmation-input")).click();
		driver.findElement(By.id("recipientEmailConfirmation-input")).clear();
		driver.findElement(By.id("recipientEmailConfirmation-input")).sendKeys("stella@gmail.com");
	}

	@When("User click on the confirmation button to complete the process")
	public void user_click_on_the_confirmation_button_to_complete_the_process() {
		WebDriverWait wait6 = new WebDriverWait(driver, 20); // 20 sec
		wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='app-root']/div/main/div[4]/div/button")));
		driver.findElement(By.xpath("//div[@id='app-root']/div/main/div[4]/div/button")).click();
	}

	@Then("User should be able to see giftcard in the cart")
	public void user_should_be_able_to_see_giftcard_in_the_cart() {
		driver.close();
	}
}
