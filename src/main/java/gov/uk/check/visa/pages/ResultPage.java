package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ResultPage extends Utility {
    /**
     * resultMessage locator and create methods 'String getResultMessage()' and 'void confirmResultMessage(String expectedMessage)'
     * (Note Use Assert.assertTrue)
     */
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement answerMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You may need a visa']")
    WebElement replyMessage;

    public String getResultMessage(String result) {
        String text = getTextFromElement(resultMessage);
        log.info("Text message.." + resultMessage.toString());
        return text;
    }

    public String getResultText(String expectedMessage) {
        String text1 = getTextFromElement(answerMessage);
        log.info("Text message.." + answerMessage.toString());
        return text1;
    }

    public String getTextFromInformation(String expectedMsg) {
        String text2 = getTextFromElement(replyMessage);
        log.info("Text message.." + replyMessage.toString());
        return text2;
    }

}
