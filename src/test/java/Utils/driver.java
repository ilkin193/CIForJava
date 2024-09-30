package Utils;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class driver {
    public static WebDriver getDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions wd = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        wd.setExperimentalOption("prefs", prefs);
        wd.addArguments("--remote-allow-origins=*");

        ChromeDriver testDriver = new ChromeDriver(wd);
        testDriver.manage().window().maximize();
        return testDriver;
    }
}
