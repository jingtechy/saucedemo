package saucedemo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import saucedemo.pages.LoginPage;
import saucedemo.utilities.BrowserDriver;
import saucedemo.utilities.UtilityBase;

public class LoginStepDefs extends UtilityBase {

    private final LoginPage loginPage = new LoginPage(driver);

    @Given("I go to website {string}")
    public void iGoToWebsite(String url) {
        navigateLogin(url);
        System.out.println("Navigating to: " + url);
    }

    @And("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("I click Login button")
    public void iClickButton() {
        loginPage.clickLoginButton();
    }
}
