package saucedemo.stepdefinitions;

import io.cucumber.java.en.Then;
import saucedemo.pages.AboutPage;
import saucedemo.utilities.UtilityBase;

import static junit.framework.TestCase.assertTrue;

public class AboutStepDefinitions extends UtilityBase {

    private final AboutPage aboutPage = new AboutPage(Hooks.getDriver());

    @Then("I verify about page title is {string}")
    public void iVerifyAboutPageTitleIs(String title) throws InterruptedException {
        Thread.sleep(2000);
        assertTrue("Verify the about page title is " + title, aboutPage.checkForTitle(title));
    }
}
