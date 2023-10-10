package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeAppointmentSteps {

    WebDriver driver = null;

    @Given("the user opens a chrome browser")
    public void the_user_opens_a_chrome_browser() {
        System.out.println("Step 1 - Browser is opened");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :"+projectPath);
        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
    }
    @And("user enters a username in text box")
    public void user_enters_a_username_in_text_box() {

        System.out.println("Step 2 - User enters Username");
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.findElement(By.xpath("//input[@id='txt-username']")).sendKeys("John Doe");
;
    }

    @And("user enters a password in the text box")
    public void user_enters_a_password_in_the_text_box() {

        System.out.println("Step 3 - User enters Password");
        driver.findElement(By.xpath("//input[@id='txt-password']")).sendKeys("ThisIsNotAPassword");

    }

    @And("user clicks on the login button")
    public void user_clicks_on_the_login_button() {

        System.out.println("Step 4 - User clicks on the login button");
        driver.findElement(By.xpath("//button[@id='btn-login']")).click();

    }

    @When("user clicks dropdown")
    public void user_clicks_dropdown() {

        System.out.println("Step 4 - User clicks dropdown");
        driver.findElement(By.xpath("//select[@id='combo_facility']")).click();
    }
    @And("clicks option")
    public void clicks_option() {

        System.out.println("Step 5 - User clicks dropdown option");
        driver.findElement(By.xpath("//option[@value='Hongkong CURA Healthcare Center']")).click();
    }
    @And("user clicks checkbox")
    public void user_clicks_checkbox() {

        System.out.println("Step 6 - User clicks checkbox Apply");
        driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click();

    }
    @And("user clicks radio button")
    public void user_clicks_radio_button() {

        System.out.println("Step 7 - User clicks radio button none");
        driver.findElement(By.xpath("//input[@id='radio_program_none']")).click();

    }
    @And("user enters a date in text box")
    public void user_enters_a_date_in_text_box() {

        System.out.println("Step 8 - User enters a date into text box");
        driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("05/10/2023");

    }
    @And("user enters a text in text box")
    public void user_enters_a_text_in_text_box() {

        System.out.println("Step 9 - User enters a text in text box");
        driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("Random Text");
    }
    @Then("user clicks book appointment button")
    public void user_clicks_book_appointment_button() {

        System.out.println("Step 10 - User clicks book appointment button");
        driver.findElement(By.xpath("//button[@id='btn-book-appointment']")).click();

    }
    @And("user verify text")
    public void user_verify_text() {

        System.out.println("Step 11 - user verify text - Hongkong CURA Healthcare Center");
        driver.getPageSource().contains("Hongkong CURA Healthcare Center");

//        driver.close();
//        driver.quit();
    }



}
