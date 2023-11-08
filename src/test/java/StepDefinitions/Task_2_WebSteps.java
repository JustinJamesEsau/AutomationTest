package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_2_WebSteps {

    WebDriver driver = null;

    @Given("the user opens a chrome browser")
    public void the_user_opens_a_chrome_browser() {
        System.out.println("Step 1 - Browser is opened");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("user verify text")
    public void user_verify_text() {

        System.out.println("Step 2 - user verify text - Protractor practice website - WebTables");
        driver.navigate().to("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.getPageSource().contains("Protractor practice website - WebTables");
    }

    @And("user clicks on the add user button")
    public void user_clicks_on_the_add_user_button() {

        System.out.println("Step 3 - User clicks on the add user button");
        driver.findElement(By.xpath("//button[@type='add']")).click();

    }

    @And("user enters a FirstName in text box")
    public void user_enters_a_firstname_in_text_box() {

        System.out.println("Step 4 - User enters FirstName");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("John");
        ;
    }

    @And("user enters a LastName in text box")
    public void user_enters_a_LastName_in_text_box() {

        System.out.println("Step 5 - User enters LastName");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Cena");

    }

    @And("user enters a Username in text box")
    public void user_enters_a_username_in_text_box() {

        System.out.println("Step 6 - User enters username");
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("CantSeeMe");

    }

    @And("user enters a Password in text box")
    public void user_enters_a_Password_in_text_box() {

        System.out.println("Step 7 - User enters Password");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("ThisIsNotAPassword");

    }

    @And("user clicks radio button")
    public void user_clicks_radio_button() {

        System.out.println("Step 8 - User clicks radio button Company AAA");
        driver.findElement(By.xpath("//input[@value='15']")).click();

    }


    @When("user clicks dropdown")
    public void user_clicks_dropdown() {

        System.out.println("Step 9 - User clicks dropdown");
        driver.findElement(By.xpath("//select[@name='RoleId']")).click();
    }

    @And("clicks option")
    public void clicks_option() {

        System.out.println("Step 10 - User clicks dropdown option - Customer");
        driver.findElement(By.xpath("//option[@value='1']")).click();
    }


    @And("user enters a email in text box")
    public void user_enters_a_date_in_text_box() {

        System.out.println("Step 11 - User enters a email into text box");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("johncena@champ.com");

    }

    @And("user enters a number in text box")
    public void user_enters_a_number_in_text_box() {

        System.out.println("Step 12 - User enters a number in text box");
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("0731234567");
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {

        System.out.println("Step 13 - User clicks Save button");
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

    }


    @And("user enters text into search box")
    public void user_enters_text_into_search_box() {

        System.out.println("Step 14 - User Search for entry");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("John");
    }

}


//        driver.close();
//        driver.quit();

