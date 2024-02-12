package saucedemo.stepdefinitions;

import io.cucumber.java.en.Then;
import saucedemo.pages.CartPage;
import saucedemo.utilities.UtilityBase;

import static junit.framework.TestCase.assertTrue;

public class CartStepDefinitions extends UtilityBase {

    private final CartPage cartPage = new CartPage(Hooks.getDriver());

    @Then("I click shopping cart badge on home page")
    public void iClickShoppingCartBadgeOnHomePage() {
        cartPage.clickShoppingCartBadge();
    }

    @Then("I verify {string} button displayed on cart page")
    public void iVerifyButtonDisplayedOnCartPage(String button) {
        assertTrue("Verify '" + button + "' button is displayed on cart page", cartPage.isButtonDisplayed(button));
    }
}
