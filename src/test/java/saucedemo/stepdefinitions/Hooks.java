package saucedemo.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    private static WebDriver driver;
    private static WebDriver createDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    // Use a method to get or create the instance
    public static WebDriver getDriver() {
        return createDriver();
    }

    @Before
    public void setUp() {
        // Use the getDriver method to ensure a single instance
        getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}