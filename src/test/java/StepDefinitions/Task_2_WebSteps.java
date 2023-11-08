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
        System.out.println("Browser is opened");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :" + projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
    }

    @And("user verify text")
    public void user_verify_text() {

        System.out.println("user verify text - Protractor practice website - WebTables");
        driver.navigate().to("http://www.way2automation.com/angularjs-protractor/webtables/");
        driver.getPageSource().contains("Protractor practice website - WebTables");
    }

    @And("user clicks on the add user button")
    public void user_clicks_on_the_add_user_button() {

        System.out.println("User clicks on the add user button");
        driver.findElement(By.xpath("//button[@type='add']")).click();

    }

    @And("user enters a FirstName 1 in text box")
    public void user_enters_a_firstname_1_in_text_box() {

        System.out.println("User enters FirstName 1");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName1");
        ;
    }

    @And("user enters a FirstName 2 in text box")
    public void user_enters_a_firstname_2_in_text_box() {

        System.out.println("User enters FirstName 2");
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("FName2");
        ;
    }

    @And("user enters a LastName 1 in text box")
    public void user_enters_a_LastName_1_in_text_box() {

        System.out.println("User enters LastName 1");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName1");

    }

    @And("user enters a LastName 2 in text box")
    public void user_enters_a_LastName_2_in_text_box() {

        System.out.println("User enters LastName 2");
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("LName2");

    }

    @And("user enters a Username 1 in text box")
    public void user_enters_a_username_1_in_text_box() {

        System.out.println("User enters username 1");
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User1");

    }

    @And("user enters a Username 2 in text box")
    public void user_enters_a_username_in_text_box() {

        System.out.println("User enters username 2");
        driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys("User2");

    }

    @And("user enters a Password 1 in text box")
    public void user_enters_a_Password_1_in_text_box() {

        System.out.println("User enters Password 1");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass1");

    }

    @And("user enters a Password 2 in text box")
    public void user_enters_a_Password_2_in_text_box() {

        System.out.println("User enters Password 2");
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Pass2");

    }

    @And("user clicks radio button 1")
    public void user_clicks_radio_button_1() {

        System.out.println("User clicks radio button Company AAA");
        driver.findElement(By.xpath("//input[@value='15']")).click();

    }

    @And("user clicks radio button 2")
    public void user_clicks_radio_button_2() {

        System.out.println("User clicks radio button Company BBB");
        driver.findElement(By.xpath("//input[@value='16']")).click();

    }


    @When("user clicks dropdown")
    public void user_clicks_dropdown() {

        System.out.println("User clicks dropdown");
        driver.findElement(By.xpath("//select[@name='RoleId']")).click();
    }

    @And("clicks option Admin")
    public void clicks_option_admin() {

        System.out.println("User clicks dropdown option - Admin");
        driver.findElement(By.xpath("//option[@value='2']")).click();
    }

    @And("clicks option Customer")
    public void clicks_option_customer() {

        System.out.println("User clicks dropdown option - Customer");
        driver.findElement(By.xpath("//option[@value='1']")).click();
    }


    @And("user enters a email 1 in text box")
    public void user_enters_a_email_1_in_text_box() {

        System.out.println("User enters a email 1 into text box");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("admin@mail.com");

    }

    @And("user enters a email 2 in text box")
    public void user_enters_a_email_2_in_text_box() {

        System.out.println("User enters a email 2 into text box");
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("customer@mail.com");

    }

    @And("user enters a number 1 in text box")
    public void user_enters_a_number_1_in_text_box() {

        System.out.println("User enters a number 1 in text box");
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("082555");
    }

    @And("user enters a number 2 in text box")
    public void user_enters_a_number_2_in_text_box() {

        System.out.println("User enters a number 2 in text box");
        driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("083444");
    }

    @Then("user clicks save button")
    public void user_clicks_save_button() {

        System.out.println("User clicks Save button");
        driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

    }


    @And("user enters text 1 into search box")
    public void user_enters_text_1_into_search_box() {

        System.out.println("User Search for entry 1");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("FName1");
    }

    @And("user enters text 2 into search box")
    public void user_enters_text_2_into_search_box() {

        System.out.println("User Search for entry 2");
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("FName2");
    }

    @And("user close browser")
    public void user_close_browser() {

        driver.close();
        driver.quit();
    }


}




