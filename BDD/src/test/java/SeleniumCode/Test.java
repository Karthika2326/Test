package SeleniumCode;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {

	public static WebDriver driver;

//	@Before
//	public void open_browser() {
//		System.setProperty("webdriver.chrome.driver", "D:\\ATE\\ATEV1.1\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://github.com/login");
//	}
//
//	@After
//	public void close_browser() throws Exception {
//		driver.quit();
//		Thread.sleep(5);
//	}

	@BeforeStep
	public void exceute_before_step() {
		System.out.println("Before step");
	}

	@AfterStep
	public void exceute_after_step() {
		System.out.println("After step");
	}

	@Before("@web")
	public void beforeScenario() {
		System.setProperty("webdriver.chrome.driver", "D:\\ATE\\ATEV1.1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://github.com/login");
	}

	@Before("@signin")
	public void beforeSecondScenario() throws Exception {
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Thread.sleep(5);

	}

	@After("@signin")
	public void afterSecondScenario() throws Exception {
		System.out.println("Test case executed successfully");
	}

	@Given("^User is on Home Page$")
	public void user_is_on_homepage() throws Exception {
		System.out.println("User on homepage");
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Exception {
		System.out.println("inside credentials ");
		driver.findElement(By.id("login_field")).sendKeys("Karthika2326");
		driver.findElement(By.id("password")).sendKeys("eaxilm@226");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
	}

	@When("^User is enetering \"(.*)\" and \"(.*)\"$")
	public void user_enters_UserName_and_Password_with_parameters(String username, String password) throws Exception {
		System.out.println("inside credentials " + username + password);
		driver.findElement(By.id("login_field")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(10);
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Exception {
		System.out.println("Login Successfully");
	}

	@Then("^Message displayed Login Unsuccessfull$")
	public void message_displayed_Login_Unsuccessfull() throws Exception {
		System.out.println("Login Unsuccessfull");
		driver.quit();
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Exception {
		driver.findElement(By.xpath("//summary/img[@alt='@Karthika2326']")).click();
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
		Thread.sleep(10);
		System.out.println("LogOut Successfully");
//
//		driver.findElement(By.xpath("//a[@href='/login']")).click();
//		Thread.sleep(5);
	}

}
