package saucedemo.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import saucedemo.pages.LoginPage;
import saucedemo.utilities.UtilityBase;

public class LoginStepDefinitions extends UtilityBase {
    private final LoginPage loginPage = new LoginPage(Hooks.getDriver());

    @Given("I go to website {string}")
    public void iGoToWebsite(String url) {
        Hooks.getDriver().navigate().to(url);
        System.out.println("I go to website: " + url);
    }

    @And("I verify {string} display on login page")
    public void iVerifyDisplayOnLoginPage(String text) {
        loginPage.isTextDisplayed(text);
    }

    @Then("I enter {string} and {string}")
    public void iEnterAnd(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("I click Login button")
    public void iClickLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        System.out.println("I login website successfully.");
        Thread.sleep(2000);
    }
}
