package gov.uk.check.visa.pages;
/**
 * 2.WorkTypePage - nextStepButton, selectJobtypeList locators and create methods 'void
 * selectJobType(String job)'
 * and 'void clickNextStepButton()'
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement clickOnStartButton;

    @CacheLookup
    @FindBy(xpath = "(//option[@value='chile'])[1]")
    WebElement selectChileFromDropDownButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement clickOnContinueButton;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='response-1'])[1]")
    WebElement workAcademicVisitOrBusiness;


    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27   govuk-!-margin-bottom-6']")
    WebElement getResultTextIYouNeedVisaToLiveInUK;



    public void clickOnStartNowButton(){
        clickOnElement(clickOnStartButton);
    }

    public void selectChile(String text){
        selectByVisibleTextFromDropDown(selectChileFromDropDownButton, text);
    }

    public void setClickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }

    public void clickOnWorkRadioButton(){
        clickOnElement(workAcademicVisitOrBusiness);
    }



    public boolean confirmResultMessageToLiveInUK(String message){
        getTextFromElement(getResultTextIYouNeedVisaToLiveInUK);
        return false;
    }

}
