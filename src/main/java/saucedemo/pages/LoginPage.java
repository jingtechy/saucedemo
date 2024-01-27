package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
    private final WebDriver driver;

    public WebElement loginText;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public boolean isTextDisplayed(String text) {
        loginText = driver.findElement(By.xpath("//div[@class='login_logo' and text()='" + text + "']"));
        return loginText.isDisplayed();
    }

    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }
}
