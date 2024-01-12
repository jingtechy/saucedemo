package saucedemo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserDriver {
    protected static WebDriver driver;

    public static WebDriver initializeBrowser(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "src/main/java/saucedemo/drivers/chromedriver");

            // Initialize Chrome WebDriver
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Set the path to the GeckoDriver executable
            System.setProperty("webdriver.gecko.driver", "src/main/java/saucedemo/drivers/geckodriver");

            // Initialize Firefox WebDriver
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser. Currently supported browsers: 'chrome', 'firefox'.");
        }
        return driver;
    }
}
