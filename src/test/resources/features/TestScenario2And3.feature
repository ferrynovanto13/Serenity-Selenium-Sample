@TestScenario2And3
Feature: Test Scenario 2 and 3

  Scenario: Validating Drag and Drop Sliders
    Given open Lambda Simple Form Demo page
    When click the Drag and Drop Sliders link text
    And slide the Default value 15 sliders to 95 value
    Then validate the slider to have 95 value

  Scenario: Validating Input Form Submit
    Given open Lambda Simple Form Demo page
    When click the Input Form Submit link text
    And click the Submit form button
    Then "Please fill out this field." error will be shown
    When fill up the form
    And choose "United States" as the country
    And click the Submit form button
    Then "Thanks for contacting us, we will get back to you shortly." message will be shown