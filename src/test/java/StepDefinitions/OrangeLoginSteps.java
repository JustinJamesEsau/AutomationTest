package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeLoginSteps {

    WebDriver driver = null;

    @Given("chrome browser is open")
    public void chrome_browser_is_open() {

        System.out.println("Step 1 - Chrome browser is opened");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();


    }

    @And("user is on Orange page")
    public void user_is_on_orange_page() {

        System.out.println("Step 2 - User is on Orange page");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com");
    }


    @When("user enters username in text box")
    public void user_enters_a_username_in_text_box() {
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
    }
    @And("user enters a password in text box")
    public void user_enters_a_password_in_text_box() {
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    @Then("user is navigated to Dashboard page")
    public void user_is_navigated_to_dashboard_page() {
        System.out.println("Step 5 - User is navigated to Dashboard page");

        driver.getPageSource().contains("Dashboard");

        driver.close();
        driver.quit();
    }


}
