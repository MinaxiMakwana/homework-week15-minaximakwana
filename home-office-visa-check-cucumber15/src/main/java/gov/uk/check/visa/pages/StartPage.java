package gov.uk.check.visa.pages;
/**
 * 1.StartPage - startNowButton locatores and create method 'void clickStartNow()'
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement clickOnStartButton;

    public void clickOnStartNowButton(){
        clickOnElement(clickOnStartButton);
    }



}
