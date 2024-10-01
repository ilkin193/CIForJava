package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class driver {
    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        // Отключение уведомлений
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        options.setExperimentalOption("prefs", prefs);

        // Необходимо для совместимости с последними версиями Chrome
        options.addArguments("--remote-allow-origins=*");

        // Проверяем, если тесты запускаются в CI среде (например, GitHub Actions)
        String headlessEnv = System.getenv("CI");
        if (headlessEnv != null && headlessEnv.equals("true")) {
            options.addArguments("--headless");  // Headless режим
            options.addArguments("--disable-gpu");  // Отключение GPU
            options.addArguments("--window-size=1920,1080");  // Задание размера окна
            options.addArguments("--no-sandbox");  // Обход некоторых ограничений в Linux
            options.addArguments("--disable-dev-shm-usage");  // Использование RAM вместо диска
        }

        // Создание экземпляра ChromeDriver
        ChromeDriver testDriver = new ChromeDriver(options);
        testDriver.manage().window().maximize();
        return testDriver;
    }
}
