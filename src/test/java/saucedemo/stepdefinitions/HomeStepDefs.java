package saucedemo.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import saucedemo.pages.HomePage;
import saucedemo.utilities.UtilityBase;

import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;

public class HomeStepDefs extends UtilityBase {

    private final HomePage homePage = new HomePage(Hooks.getDriver());

    @Then("I verify home page title is {string}")
    public void iVerifyHomePageTitleIs(String string) throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Verify the home page title is " + string, homePage.checkForTitle(string));
    }

    @And("I verify Products title displayed on home page")
    public void iVerifyProductsTitleDisplayedOnHomePage() {
        assertTrue("Verify Products title is displayed on home page", homePage.isProductsTitleDisplayed());
    }
    @And("I verify {string} displayed on home page")
    public void iVerifyDisplayedOnHomePage(String string) {
        assertTrue("Verify '" + string + "' is displayed on home page", homePage.isInfoDisplayed(string));
    }

    @Then("I click product sort selector on home page")
    public void iClickProductSortSelectorOnHomePage() {
        homePage.clickSortSelector();
    }

    @Then("I verify the following products sort options are displayed")
    public void iVerifyTheFollowingProductsSortOptionsAreDisplayed(DataTable dataTable) {
        List<Map<String, String>> options = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> option : options) {
            homePage.isSortOptionDisplayed(option.get("Options"));
        }
    }

    @Then("I click {string} button on home page")
    public void iClickButtonOnHomePage(String button) {
        homePage.clickButton(button);
    }

    @Then("I verify the following menus are displayed")
    public void iVerifyTheFollowingMenusAreDisplayed(DataTable dataTable) {
        List<Map<String, String>> menus = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> menu : menus) {
            homePage.isHomeSideMenuDisplayed(menu.get("Menus"));
        }
    }
}
