package steps;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	/*
	 * @Given("Open the Chrome browser") public void OpenBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 * 
	 * @And("Load the application url") public void LoadApplication() {
	 * driver.get("http://leaftaps.com/opentaps/"); }
	 */

	@Given("Enter the username as {string}") // DemoSalesManager
	public void EnterUsername(String uName) {
		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as {string}") // crmsfa
	public void EnterPassword(String pWord) {
		// driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.id("password")).sendKeys(pWord);
	}

	@When("Click on the login button")
	public void ClickButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Homepage should be displayed")
	public void VerifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

		if (displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("Homepage is not displayed");
		}
	}

}
