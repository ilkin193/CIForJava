package steps;

import elements.MyElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MyStepdefs {
    public static WebDriver driver;
    private MyElements pom;

    public MyStepdefs() {
        driver = Utils.driver.getDriver();
        this.pom = new MyElements(driver);
    }


    @Given("Navigate to home page")
    public void navigate_to_home_page() {
        driver.navigate().to("https://oxu.az/");
    }


    @When("Change language to russian")
    public void change_language_to_russian() {
        pom.russianLanguageBtn();
    }


    @Then("Go to page about conflict")
    public void go_to_page_about_conflict() {
        pom.conflictPostOnNavbar();
    }
}