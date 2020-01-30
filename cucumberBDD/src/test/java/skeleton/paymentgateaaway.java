package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class paymentgateaaway {
	WebDriver driver;
	@Given("The URL of TestMeApp is {string}")
	public void the_URL_of_TestMeApp_is(String url) {
		 System.setProperty("web.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		    driver= new ChromeDriver();
		    driver.get(url);
		    driver.manage().window().maximize();
		    
	}

	@When("User clicks on Sign In button")
	public void user_clicks_on_Sign_In_button() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();

	}

	@When("User enters {string} as User_Name")
	public void user_enters_as_User_Name(String User_Name) {
	    driver.findElement(By.id("userName")).sendKeys("rowdy2129");

	}

	@When("User enters {string} as Pass_Word")
	public void user_enters_as_Pass_Word(String Pass_Word) {
	    driver.findElement(By.id("password")).sendKeys("2129@rowdy");

}

	@When("User clicks on Login_button")
	public void user_clicks_on_Login_button() {
	    driver.findElement(By.xpath("//input[@name='Login']")).click();

	}

	@When("User enters a product on Search_Product {string}")
	public void user_enters_a_product_on_Search_Product(String Search_Product) {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Headphone");

	}

	@When("User clicks on FIND_DETAILS")
	public void user_clicks_on_FIND_DETAILS() {
	    driver.findElement(By.xpath("//form//input[@name='val']")).click();

	}

	@When("User clicks on Add to cart")
	public void user_clicks_on_Add_to_cart() {
		driver.findElement(By.xpath( "//a[@class='btn btn-success btn-product']")).click();

	}

	@When("User proceed to payment")
	public void user_proceed_to_payment() {
		driver.findElement(By.xpath("//form[2]//input[1]")).click();
	}

	@Then("User cant see the proceed to pay button")
	public void user_cant_see_the_proceed_to_pay_button() {
		driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).isDisplayed();
	}




}
