package steps;

import java.nio.file.spi.FileSystemProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass{
 // public ChromeDriver driver;

	@When("Click on CRMSFA link")
	public void CLClickButton() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

	
	  @Then("MyHomepage should be displayed") 
	  public void CLVerifyHomePage() {
	  boolean displayed = driver.findElement(By.xpath("//img[@alt='opentaps CRM']")).isDisplayed();	  
	  if (displayed) { System.out.println(" CreditLead Homepage is displayed"); } else {
	  System.out.println("CreditLead Homepage is not displayed"); } }
	 

}
