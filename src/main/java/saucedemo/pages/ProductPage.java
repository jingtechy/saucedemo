package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private final WebDriver driver;
    private WebElement productButton;
    public ProductPage(WebDriver driver)  { this.driver = driver; }

    public void clickProductTitle(String product) {
        driver.findElement(By.xpath("//div[@class='inventory_item_name ' and text()='" + product + "']")).click();
    }

    public boolean isButtonDisplayed(String button) {
        productButton = driver.findElement(By.xpath("//button[text()='" + button + "']"));
        return productButton.isDisplayed();
    }

}
