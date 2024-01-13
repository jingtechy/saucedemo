package saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;
    public WebElement productsTitle;
    public WebElement homePageInfo;
    public WebElement homeSortOptions;
    public WebElement homeSideMenus;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkForTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException(title);
        return driver.getTitle().trim().equals(title);
    }

    public boolean isProductsTitleDisplayed() {
        productsTitle = driver.findElement(By.xpath("//span[@class='title'] "));
        return productsTitle.isDisplayed();
    }

    public boolean isInfoDisplayed(String info) {
        homePageInfo = driver.findElement(By.xpath("//div[@class='inventory_item_name ' and text()='" + info + "']"));
        return homePageInfo.isDisplayed();
    }

    public void clickSortSelector() {
        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();
    }

    public void clickButton(String button) {
        driver.findElement(By.xpath("//button[text()='" + button + "']")).click();
    }

    public boolean isSortOptionDisplayed(String option) {
        homeSortOptions = driver.findElement(By.xpath("//select/option[text()='" + option + "']"));
        return homeSortOptions.isDisplayed();
    }

    public boolean isHomeSideMenuDisplayed(String menu) {
        homeSideMenus = driver.findElement(By.xpath("//a[@class='bm-item menu-item' and text()='" + menu + "']"));
        return homeSideMenus.isDisplayed();
    }
}


