package saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        //This specifies the type and location of the desired reports.
        plugin = {"pretty",
                "html:reports/test-output/Report.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:reports/test-output/failedrerun.txt"},
        //This is the location of the Features folder
        features = {"src/test/java/saucedemo/features"},
        //This is the location of the StepDefs folder
        glue = {"saucedemo.stepdefinitions"},
        //  tags = "@authentication",
        publish = true
)

@RunWith(Cucumber.class)

public class TestRunner {
}
