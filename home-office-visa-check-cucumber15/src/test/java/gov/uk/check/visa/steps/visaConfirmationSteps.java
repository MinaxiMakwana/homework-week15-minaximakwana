package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class visaConfirmationSteps {
    @Given("User clicks on start button")
    public void userClicksOnStartButton() {
        new StartPage().clickOnStartNowButton();
        new WorkTypePage().clickOnStartNowButton();
    }

    @When("User should Select a Nationality {string}")
    public void userShouldSelectANationalityAustralia(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
        new WorkTypePage().selectChile(nationality);
        new SelectNationalityPage().selectColombia(nationality);
    }

    @And("User Clicks on Continue button")
    public void userClicksOnContinueButton() {
        new SelectNationalityPage().setClickOnContinueButton();
        new ReasonForTravelPage().clickOnContinueButton();
        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();
//        new WorkTypePage().setClickOnContinueButton();

    }

    @And("User should Select reason Tourism")
    public void userShouldSelectReasonTourism() {
        new ReasonForTravelPage().clickOnReasonForTravel();
    }

    @Then("User verifies verify result {string}")
    public void userVerifiesVerifyResultYouWillNotNeedAVisaToComeToTheUK() {
        Assert.assertTrue(new ResultPage().confirmResultMessage("You will not need a visa to come to the UK"));
    }

    @And("User should Select reason Work, academic visit or business")
    public void userShouldSelectReasonWorkAcademicVisitOrBusiness() {
        new WorkTypePage().clickOnWorkRadioButton();
    }

    @And("User should Select intended to stay for longer than {int} months")
    public void userShouldSelectIntendedToStayForLongerThanMonths(int six) {
        new DurationOfStayPage().longerThenSixMonthsRadioButton();
    }

    @And("User Selects have planning to work for Health and care professional")
    public void userSelectsHavePlanningToWorkForHealthAndCareProfessional() {
        new DurationOfStayPage().healthAndCareProfessionalRadioButton();
    }

    @And("User should Select reason Join partner or family for a long stay")
    public void userShouldSelectReasonJoinPartnerOrFamilyForALongStay() {
        Assert.assertTrue(new WorkTypePage().confirmResultMessageToLiveInUK("You need a visa to work in health and care"));
        Assert.assertTrue(new FamilyImmigrationStatusPage().verifyForALongStay("You may need a visa"));
    }

    @And("User should My partner of family member have uk immigration status {string}")
    public void userShouldMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes() {
        new DurationOfStayPage().JoinPartnerOrFamilyForALongStay();
    }

    @Given("User should be on home page")
    public void userShouldBeOnHomePage() {
    }

    @Then("User can see following {string} into dropdown")
    public void userCanSeeFollowingIntoDropdown(String albania, String bhutan, String britishProtectedPerson, String haiti, String kazakhstan, String mozambique, String norway, String portugal, String russia, String zambia) {
        new SelectNationalityPage().countries();
    }
}
