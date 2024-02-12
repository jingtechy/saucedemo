package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;
    public CartPage(WebDriver driver) { this.driver = driver; }

    public void clickShoppingCartBadge() {
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    public boolean isButtonDisplayed(String button) {
        return driver.findElement(By.xpath("//button[text() = '" + button + "']")).isDisplayed();
    }
}
