package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_testmeapp {
	/*WebDriver driver;
	@Given("The URL of Test Me App is {string}")
	public void the_URL_of_Test_Me_App_is(String url) {
	    System.setProperty("web.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    
	}

	@When("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		driver.findElement(By.xpath("//a[contains(text(),'SignIn')]")).click();
	}

	@When("User enters {string} as UserName")
	public void user_enters_as_UserName(String UserName) {
	    driver.findElement(By.id("userName")).sendKeys("rowdy2129");
	}

	@When("User enters {string} as PassWord")
	public void user_enters_as_PassWord(String PassWord) {
	    driver.findElement(By.id("password")).sendKeys("2129@rowdy");
	}

	@Then("User clicks on Login")
	public void user_clicks_on_Login() {
	    driver.findElement(By.xpath("//input[@name='Login']")).click();
	}
	@When("User enters a product on SearchProduct {string}")
	public void user_enters_a_product_on_SearchProduct(String SearchProduct) {
		driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("Headphone");
	    
	}

	@When("User clicks on FINDDETAILS")
	public void user_clicks_on_FINDDETAILS() {
	    driver.findElement(By.xpath("//form//input[@name='val']")).click();
	}

	

	@Then("User clicks on ADD TO CART")
public void user_clicks_on_ADD_TO_CART() {
		driver.findElement(By.xpath( "//a[@class='btn btn-success btn-product']")).click();
}





}
