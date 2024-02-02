package saucedemo.stepdefinitions;

import io.cucumber.java.en.Then;
import saucedemo.pages.ProductPage;
import saucedemo.utilities.UtilityBase;

public class ProductStepDefinitions extends UtilityBase {

    private final ProductPage productPage = new ProductPage(Hooks.getDriver());

    @Then("I click {string} on home page")
    public void iClickProductOnHomePage(String product) {
        productPage.clickProductTitle(product);
    }

    @Then("I verify {string} button displayed on product page")
    public void iVerifyButtonDisplayedOnProductPage(String button) {
        productPage.isButtonDisplayed(button);
    }
}
