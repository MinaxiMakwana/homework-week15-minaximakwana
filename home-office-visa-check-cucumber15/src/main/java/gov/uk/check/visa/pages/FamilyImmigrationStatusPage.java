package gov.uk.check.visa.pages;
/**
 * 6.FamilyImmigrationStatusPage - nextStepButton, yes, no locators and create methods 'void
 * selectImmigrationStatus(String status)'
 * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27   govuk-!-margin-bottom-6']")
    WebElement verifyYouMayNeedVisa;

    public boolean verifyForALongStay(String youMayNeedAVisa){
        getTextFromElement(verifyYouMayNeedVisa);
        return false;
    }


}
