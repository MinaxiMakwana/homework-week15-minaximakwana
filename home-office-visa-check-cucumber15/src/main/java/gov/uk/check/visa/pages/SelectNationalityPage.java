package gov.uk.check.visa.pages;
/**
 * 3.SelectNationalityPage -nationalityDropDownList, nextStepButton locators and create
 * methods 'void selectNationality(String nationality)'
 * and 'void clickNextStepButton()'
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectNationalityPage extends Utility {


    @CacheLookup
    @FindBy(name = "response")
    WebElement selectNationalityFromDropDownMenu;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement clickOnContinueButton;

    @CacheLookup
    @FindBy(xpath = "(//option[@value='colombia'])[1]")
    WebElement selectColombiaFromDropDownButton;

    @CacheLookup
    @FindBy (id = "response")
    WebElement countriesList;



    public void selectNationality(String nationality){
        selectByVisibleTextFromDropDown(selectNationalityFromDropDownMenu, nationality);
    }

    public void setClickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }

    public void selectColombia(String text){
        selectByVisibleTextFromDropDown(selectColombiaFromDropDownButton, text);
    }

    public void countries(){
    List<String> expectedCountries = Arrays.asList(countries().split(","));
    List<String> actualCountries = new ArrayList<>();
    Select dropdown = new Select(driver.findElement(By.id("response")));
    List<WebElement> options = dropdown.getOptions();
    for (WebElement option : options) {
        actualCountries.add(option.getText());
    }
    Assert.assertEquals(expectedCountries, actualCountries);
}

}
