package saucedemo.utilities;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityBase {

    protected static WebDriver driver = new ChromeDriver();
    public static void navigateLogin(String url) {
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }

    public static void closeDriver() {
        try {
            driver.close();
            driver.quit();
        } catch (NoSuchMethodError nsme) { // in case quit fails
        } catch (NoSuchSessionException nss) { // in case close fails
        } catch (SessionNotCreatedException ignored) {} // in case close fails
    }

    public static void navigateTo(String url) {
        driver.navigate().to(url);
    }

}
