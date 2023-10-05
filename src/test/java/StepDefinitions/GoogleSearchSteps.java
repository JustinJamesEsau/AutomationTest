package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("Step 1 - Browser is opened");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :"+projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();


    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {

        System.out.println("Step 2 - User is on google search page");

        driver.navigate().to("https://google.com");
    }
    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {

        System.out.println("Step 3 - User enters a text in search box");

        driver.findElement(By.name("q")).sendKeys("Nedbank");
    }
    @And("hits enter")
    public void hits_enter() {

        System.out.println("Step 4 - User clicks enter button");

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Step 5 - User is navigated to search results");

        driver.getPageSource().contains("Nedbank");

        driver.close();
        driver.quit();
    }

}
