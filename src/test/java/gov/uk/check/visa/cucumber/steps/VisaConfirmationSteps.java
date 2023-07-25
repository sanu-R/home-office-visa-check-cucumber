package gov.uk.check.visa.cucumber.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationSteps {
    @And("I click on Start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @When("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);


    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("I select  {string}")
    public void iSelect(String reason){
        new ReasonForTravelPage().selectReasonForVisit(reason);
    }

    @And("I click on  next continue button")
    public void iClickOnNextContinueButton() {
        new ReasonForTravelPage().clickToGoToNextPage();
    }

    @Then("I should be able to see message {string}")
    public void iShouldBeAbleToSeeMessage(String result) {
        Assert.assertEquals("Text not displayed","You will not need a visa to come to the UK",new ResultPage().getResultMessage(result));
    }

    @And("I select duration {string}")
    public void iSelectDuration(String duration) {
        new DurationOfStayPage().selectLengthOfStay(duration);

    }

    @And("I click on next step  button")
    public void iClickOnNextStepButton() {
        new DurationOfStayPage().clickOnContinue();
    }

    @And("I select planning to work for {string}")
    public void iSelectPlanningToWorkFor(String work) {
new WorkTypePage().selectJobType(work);
    }

    @Then("I should be able to see result ms{string}")
    public void iShouldBeAbleToSeeResultMs(String expectedMessage) {
        new ResultPage().getResultText(expectedMessage);
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedMsg) {
        new ResultPage().getTextFromInformation(expectedMsg);
    }
}
