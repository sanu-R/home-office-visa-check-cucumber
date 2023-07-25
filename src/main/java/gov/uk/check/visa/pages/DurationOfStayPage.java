package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());
    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess) {
        int months = 2;
        switch (months) {
            case 1:
                clickOnElementFromObject(lessThanSixMonths, moreOrLess);
                break;
            case 2:
                clickOnElementFromObject(moreThanSixMonths, moreOrLess);
                break;


        }
     log.info("select length of stay.."+lessThanSixMonths.toString());
        log.info("Select length of stay.."+moreThanSixMonths.toString());

    }

    public void clickOnContinue() {
        clickOnElement(nextStepButton);
        log.info("Click on continue.."+nextStepButton.toString());
    }
}


