package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement yes1;

    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement no;
    @CacheLookup
    @FindBy(css = "button[class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement clickButton;

    public void selectImmigrationStatus(String status) {
        int immStatus = 1;
        switch (immStatus) {
            case 1:
                clickOnElementFromObject(yes1, status);
                break;
            case 2:
                break;
        }
        clickOnElementFromObject(yes1, status);
        log.info("click on Immigration status.." + yes1.toString());
    }

    public void clickNextStep() {
        clickOnElement(clickButton);
        log.info("click on next button.." +clickButton.toString());
    }
}
