package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyElements {
    private WebDriver driver;
    public MyElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='sidebar-item']//a[.='RU']")
    public WebElement russianLanguageBtn;
    @FindBy(xpath = "//span[.='Конфликт между Израилем и Ливаном']")
    public WebElement conflictPostOnNavbar;
    public void russianLanguageBtn(){
        russianLanguageBtn.click();
    }
    public void conflictPostOnNavbar() {
        conflictPostOnNavbar.click();
    }
}
