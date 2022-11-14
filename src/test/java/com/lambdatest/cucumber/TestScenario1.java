package com.lambdatest.cucumber;

import com.lambdatest.cucumber.pages.TestScenario1Controller;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SerenityRunner.class)
public class TestScenario1 {

    @Autowired
    private TestScenario1Controller testScenario1Controller;

    @Given("open Lambda Simple Form Demo page")
    public void openLambdaSimpleFormDemoPage() {
        testScenario1Controller.openTestScenario1Page();
    }

    @When("click the Simple Form Demo link text")
    public void clickTheSimpleFormDemoLinkText() {
        testScenario1Controller.clickSimpleFormDemo();
    }

    @Then("validate the URL contains '(.*)'$")
    public void validateTheURLContainsSimpleFormDemo(String urlParts) {
        assertThat("URL does not contain the url part",
                testScenario1Controller.containUrlParts(urlParts), equalTo(true));
    }

    @And("click the Get Checked Value button")
    public void clickTheGetCheckedValueButton() {
        testScenario1Controller.clickGetCheckedValueButton();
    }

    @Then("validate the input message equal to the response")
    public void validateTheInputMessageEqualToTheResponse() {
        String typed = "Welcome to LambdaTest";
        assertThat("Texts do not match", typed,
                equalTo(testScenario1Controller.returnMessageResponse()));
    }

    @When("enter the {string} into the Enter Message text box")
    public void enterTheIntoTheEnterMessageTextBox(String message) {
        testScenario1Controller.typeUserMessage(message);
    }
}
