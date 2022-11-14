package com.lambdatest.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestScenario1Controller extends UIInteractionSteps {
    public void openTestScenario1Page(){
        openUrl("https://www.lambdatest.com/selenium-playground");
    }

    public void clickSimpleFormDemo(){
        String pathOfElement = "//a[contains(text(),'Simple Form Demo')]";
        WebElementFacade element = find(By.xpath(pathOfElement));
        element.click();
    }

    public boolean containUrlParts(String urlParts){
        WebDriver webDriver = this.getDriver();
        String url = webDriver.getCurrentUrl();
        return url.contains(urlParts);
    }

    public void typeUserMessage(String message){
        String pathOfElement = "//input[@id='user-message']";
        WebElementFacade element = find(By.xpath(pathOfElement));
        element.type(message);
    }

    public void clickGetCheckedValueButton(){
        String pathOfElement = "//button[@id='showInput']";
        WebElementFacade element = find(By.xpath(pathOfElement));
        element.click();
    }

    public String returnMessageResponse(){
        String pathOfElement = "//p[@id='message']";
        WebElementFacade element = find(By.xpath(pathOfElement));
        return element.getText();
    }
}
