package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class testmeapp {
	WebDriver driver;
@Given("The URL of Test Me app is {string}")
public void the_URL_of_Test_Me_app_is(String URL) {
		
		
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get(URL);
	     driver.manage().window().maximize();
		
		
		
	}
@When("User clicks on SignUp button")
public void user_clicks_on_SignUp_button() {
	
	driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
}
	

@When("User enters {string} as Username")
public void user_enters_as_Username(String Username) {
    driver.findElement(By.id("userName")).sendKeys("rowdy2129");
}

@When("User enters {string} as firstname")
public void user_enters_as_firstname(String firstname) {
	driver.findElement(By.id("firstName")).sendKeys("sai");
    
	
	
}

@When("User enters {string} as lastname")
public void user_enters_as_lastname(String lastname) {
   driver.findElement(By.id("lastName")).sendKeys("manjusha");
}

@When("User enters {string} as pass_word")
public void user_enters_as_pass_word(String pass_word) {
    driver.findElement(By.id("password")).sendKeys("2129@rowdy");
}

@When("User enters {string} as confirmpassword")
public void user_enters_as_confirmpassword(String confirmpassword) {
	driver.findElement(By.id("pass_confirmation")).sendKeys("2129@rowdy");
    
}

@When("User enters {string} as gender")
public void user_enters_as_gender(String gender) {

	driver.findElement(By.xpath("//input[@id='gender']")).sendKeys("FEMALE");
}

@When("User enters {string} as email")
public void user_enters_as_e_mail(String email) {
   driver.findElement(By.id("emailAddress")).sendKeys("rowdy2129@gmail.com");
}

@When("User enters {string} as mobilenumber")
public void user_enters_as_mobilenumber(String mobilenumber) {
    driver.findElement(By.id("mobileNumber")).sendKeys("9876543210");
}

@When("User enters {string} as DOB")
public void user_enters_as_DOB(String DOB) {
    driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("29-06-1998");
}

@When("User enters {string} as address")
public void user_enters_as_address(String address) {
	driver.findElement(By.id("address")).sendKeys("Bangalore");
    
}

@When("User enters {string} as securityquestion")
public void user_enters_as_securityquestion(String securityquestion) {
    WebElement sq=driver.findElement(By.xpath("//select[@id='securityQuestion']"));
    Select q=new Select(sq);
    q.selectByValue("411010");
    
}

@When("User enters {string} as answer")
public void user_enters_as_answer(String answer) {
	
	driver.findElement(By.id("answer")).sendKeys("HYDERABAD");
}
@Then("User clicks on Register button")
public void user_clicks_on_Register_button() {
    driver.findElement(By.xpath("//input[@name='Submit']")).click();
}







}
