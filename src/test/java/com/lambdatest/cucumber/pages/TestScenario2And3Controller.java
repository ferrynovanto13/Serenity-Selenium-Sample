package com.lambdatest.cucumber.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestScenario2And3Controller extends UIInteractionSteps {
    public void clickDragAndDropSliders(){
        String pathOfElement = "//a[contains(text(),'Drag & Drop Sliders')]";
        WebElementFacade element = find(By.xpath(pathOfElement));
        element.click();
    }

    public void slider(){
        WebElementFacade element = find(By.xpath("//div[@id='slider3']//input[@class='sp__range']"));

        WebDriver webDriver = this.getDriver();
        Actions moveSlider = new Actions(webDriver);
        moveSlider.click(element).build().perform();
        for (int i = 0; i < 45; i++)
        {
            moveSlider.sendKeys(Keys.ARROW_RIGHT).build().perform();
        }
    }

    public int returnValue(){
        String pathOfElement = "//output[@id='rangeSuccess']";
        WebElementFacade element = find(By.xpath(pathOfElement));
        return Integer.parseInt(element.getText());
    }

    public void clickInputFormSubmit(){
        String pathOfElement = "//a[contains(text(),'Input Form Submit')]";
        WebElementFacade element = find(By.xpath(pathOfElement));
        element.click();
    }

    public void clickSubmitFormButton(){
        String pathOfElement = "//button[contains(text(),'Submit')]";
        WebElementFacade element = find(By.xpath(pathOfElement));
        element.click();
    }

    public String returnErrorMessage(){
        WebElementFacade element = find(By.xpath("//input[@id='name']"));
        return element.getAttribute("validationMessage");
    }

    public void fillUpForm(){
        WebElementFacade nameElement = find(By.xpath("//input[@id='name']"));
        WebElementFacade emailElement = find(By.xpath("//input[@id='inputEmail4']"));
        WebElementFacade passElement = find(By.xpath("//input[@id='inputPassword4']"));
        WebElementFacade companyElement = find(By.xpath("//input[@id='company']"));
        WebElementFacade websiteNameElement = find(By.xpath("//input[@id='websitename']"));
        WebElementFacade cityElement = find(By.xpath("//input[@id='inputCity']"));
        WebElementFacade address1Element = find(By.xpath("//input[@id='inputAddress1']"));
        WebElementFacade address2Element = find(By.xpath("//input[@id='inputAddress2']"));
        WebElementFacade stateElement = find(By.xpath("//input[@id='inputState']"));
        WebElementFacade zipElement = find(By.xpath("//input[@id='inputZip']"));

        nameElement.type("Name");
        emailElement.type("email@mail.com");
        passElement.type("password");
        companyElement.type("Company");
        websiteNameElement.type("Website Name");
        cityElement.type("City");
        address1Element.type("Address 1");
        address2Element.type("Address 2");
        stateElement.type("State");
        zipElement.type("00000");
    }

    public void selectCountry(String country){
        WebDriver webDriver = this.getDriver();
        Select countryDropdown = new Select(webDriver.findElement(By.xpath("//select[@class='w-full border border-gray-90 text-size-14 rounded mt-10 px-10 py-5']")));
        countryDropdown.selectByVisibleText(country);
    }

    public String returnSuccessSubmitForm(){
        String pathOfElement = "//p[@class='success-msg hidden']";
        WebElementFacade element = find(By.xpath(pathOfElement));
        return element.getText();

    }
}
