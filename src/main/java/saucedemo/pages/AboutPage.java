package saucedemo.pages;

import org.openqa.selenium.WebDriver;

public class AboutPage {
    private final WebDriver driver;
    public AboutPage(WebDriver driver) { this.driver = driver; }

    public boolean checkForTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException(title);
        return driver.getTitle().trim().equals(title);
    }
}
