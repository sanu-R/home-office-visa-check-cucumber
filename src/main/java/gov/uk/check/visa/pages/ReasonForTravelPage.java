package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    /**
     * nextStepButton, reasonForVisitList locators and create methods  'void selectReasonForVisit(String reason)'
     * and  'void clickNextStepButton()'
     */
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//div[@class='gem-c-radio govuk-radios__item']")
    List<WebElement> reasonForVisitList;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement con;

    public void selectReasonForVisit(String reason) {
        for (WebElement rsnElement : reasonForVisitList) {
            if (rsnElement.getText().contains(reason)) {
                clickOnElement(rsnElement);
                break;
            }
        }
        log.info("Select Reason For visit.. " + reasonForVisitList);
    }

    public void clickForNextPage() {
        clickOnElement(nextStepButton);
        log.info("click for next page.." + nextStepButton.toString());
    }


    public void clickToGoToNextPage() {
        clickOnElement(con);
        log.info("click to go to next page.." + con.toString());
    }

}
