package gov.uk.check.visa.pages;
/**
 * 7.DurationOfStayPage - nextStepButton, lessThanSixMonths, moreThanSixMonths locators
 * and create methods
 * 'void selectLengthOfStay(String moreOrLess)' (Note: use switch statement for select
 * moreOrLess stay) and
 * 'void clickNextStepButton()'
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1'])[1]")
    WebElement clickOnLongerThenSixMonthsRadioButton;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='response-0'])[1]")
    WebElement clickOnHealthAndCareProfessionalRadioButton;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='response-4'])[1]")
    WebElement clickOnJoinPartnerOrFamilyForALongStay;

    public void longerThenSixMonthsRadioButton(){
        clickOnElement(clickOnLongerThenSixMonthsRadioButton);
    }

    public void healthAndCareProfessionalRadioButton(){
        clickOnElement(clickOnHealthAndCareProfessionalRadioButton);
    }

    public void JoinPartnerOrFamilyForALongStay(){
        clickOnElement(clickOnJoinPartnerOrFamilyForALongStay);
    }


}
