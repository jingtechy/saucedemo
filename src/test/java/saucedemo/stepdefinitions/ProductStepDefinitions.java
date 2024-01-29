package saucedemo.stepdefinitions;

import io.cucumber.java.en.Then;
import saucedemo.pages.ProductPage;
import saucedemo.utilities.UtilityBase;

public class ProductStepDefinitions extends UtilityBase {

    private final ProductPage productPage = new ProductPage(Hooks.getDriver());

    @Then("I click {string} product on home page")
    public void iClickProductOnHomePage(String product) {
        productPage.clickProductTitle(product);
    }
}
