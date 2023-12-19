package gov.uk.check.visa.pages;
/**
 * 5.ReasonForTravelPage - nextStepButton, reasonForVisitList locators and create methods
 * 'void selectReasonForVisit(String reason)'
 * and 'void clickNextStepButton()'
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {

    //reason for travelPage
    @CacheLookup
    @FindBy(name = "response")
    List<WebElement> reasonForTravel;

    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement clickOnContinueButton;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27   govuk-!-margin-bottom-6']")
    WebElement verifyResultYouWillNotNeedAVisaToComeToTheUK;



    public void clickOnReasonForTravel(String text){
        for (WebElement reasonForTravelRadioButton: reasonForTravel){
        if(reasonForTravelRadioButton.getAttribute("value").contains(text.toLowerCase())){
            reasonForTravelRadioButton.click();
            break;
        }
            if (text.toLowerCase().contains(reasonForTravelRadioButton.getAttribute("value"))){
                reasonForTravelRadioButton.click();
                break;
            }

        }
    }

    public void clickOnReasonForTravel() {
    }

    public void clickOnContinueButton(){
        clickOnElement(clickOnContinueButton);
    }

    public String verifyResultYouWillNotNeedAVisaToComeToTheUK(){
        return getTextFromElement(verifyResultYouWillNotNeedAVisaToComeToTheUK);

    }

}
