package steps;

import elements.MyElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStepdefs {
    public static WebDriver driver;
    private MyElements pom;

    public MyStepdefs() {
        driver = Utils.driver.getDriver();
        this.pom = new MyElements(driver);
    }
    @Given("Navigate to home page")
    public void goToHomePage() {
        driver.navigate().to("https://oxu.az/");
    }
    @When("Change language to russian")
    public void russianLanguageBtn(){
        pom.russianLanguageBtn();
    }

    @Then("Go to page about conflict")
    public void conflictPostOnNavbar() {
        pom.conflictPostOnNavbar();
    }
}
