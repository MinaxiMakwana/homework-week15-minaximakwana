package gov.uk.check.visa.pages;
/**
 * 4.ResultPage - resultMessage locator and create methods 'String getResultMessage()' and
 * 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {

    //h2[@class='gem-c-heading gem-c-heading--font-size-27   govuk-!-margin-bottom-6']
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27   govuk-!-margin-bottom-6']")
    WebElement getResultText;

    public boolean confirmResultMessage(String message){
        getTextFromElement(getResultText);
        return false;
    }

}
