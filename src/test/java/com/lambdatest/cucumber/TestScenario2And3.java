package com.lambdatest.cucumber;

import com.lambdatest.cucumber.pages.TestScenario2And3Controller;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SerenityRunner.class)
public class TestScenario2And3 {

    @Autowired
    private TestScenario2And3Controller testScenario2And3Controller;

    @When("click the Drag and Drop Sliders link text")
    public void clickTheDragAndDropSlidersLinkText() {
        testScenario2And3Controller.clickDragAndDropSliders();
    }

    @And("slide the Default value {int} sliders to {int} value")
    public void slideTheDefaultValueSlidersToValue(int slider, int value) {
        testScenario2And3Controller.slider();
    }

    @Then("validate the slider to have {int} value")
    public void validateTheSliderToHaveValue(int value) {
        assertThat("Value does not match", value,
                equalTo(testScenario2And3Controller.returnValue()));
    }

    @When("click the Input Form Submit link text")
    public void clickTheInputFormSubmitLinkText() {
        testScenario2And3Controller.clickInputFormSubmit();
    }

    @And("click the Submit form button")
    public void clickTheSubmitFormButton() {
        testScenario2And3Controller.clickSubmitFormButton();
    }

    @Then("{string} error will be shown")
    public void errorWillBeShown(String message) {
        assertThat("Error is not shown", message, equalTo(testScenario2And3Controller.returnErrorMessage()));
    }

    @When("fill up the form")
    public void fillUpTheForm() {
        testScenario2And3Controller.fillUpForm();
    }

    @And("choose {string} as the country")
    public void chooseAsTheCountry(String countryName) {
        testScenario2And3Controller.selectCountry(countryName);
    }

    @Then("{string} message will be shown")
    public void messageWillBeShown(String successMessage) {
        assertThat("Success message does not match", successMessage,
                equalTo(testScenario2And3Controller.returnSuccessSubmitForm()));
    }
}
