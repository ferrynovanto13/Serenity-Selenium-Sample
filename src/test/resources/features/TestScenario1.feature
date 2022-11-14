Feature: Test Scenario 1

  Scenario: Validating Simple Form Demo
    Given open Lambda Simple Form Demo page
    When click the Simple Form Demo link text
    Then validate the URL contains 'simple-form-demo'
    When enter the "Welcome to LambdaTest" into the Enter Message text box
    And click the Get Checked Value button
    Then validate the input message equal to the response