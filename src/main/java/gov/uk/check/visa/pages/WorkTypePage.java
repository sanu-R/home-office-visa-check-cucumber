package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(css = "#response-0")
    WebElement selectJobTypeList;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextContinue;

  public  void selectJobType(String job){
      clickOnElementFromObject(selectJobTypeList,job);
      log.info("select job type.." + selectJobTypeList);
  }

public void clickOnNextContinueButton(){
      clickOnElement(nextContinue);
      log.info("click on next button.." + nextContinue.toString());
}



}
