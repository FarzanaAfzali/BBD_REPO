package tek.bdd.seleniumutility;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetUp;

import java.rmi.UnexpectedException;
import java.time.Duration;
import java.util.List;

public class SeleniumUtility extends BaseSetUp{

    private WebDriverWait explicitly_wait(){
        return new WebDriverWait(getDriver(), Duration.ofMinutes(1));
    }

    private List<WebElement> vis_all_elements(By locator){
        return explicitly_wait().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

    public WebElement until_vis_element(By locator){
        return explicitly_wait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    //get text of webElement
    public String getElementText(By locator){
        return until_vis_element(locator).getText();
    }

    //Login Button Validation
    public boolean login_button_Validation(By locator){
        WebElement loginButton = until_vis_element(locator);
        if (loginButton.isEnabled()) {
            System.out.println("Button Enabled");
            return false;
        }else {
            System.out.println("Button Disabled");
            return true;
        }
    }

    //SendText method
    public void send_text(By locator, String text){
        until_vis_element(locator).sendKeys(text);
        //getDriver().findElement(locator).sendKeys(text);
    }

    //click
    public void click_element(By locator){
        until_vis_element(locator).click();
    }

    //take ScreenShot
    public byte[] take_screenshot(){
        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        return screenshot.getScreenshotAs(OutputType.BYTES);
    }

    //find element
    public List<WebElement> listOfElements(By locator){
        return vis_all_elements(locator);
    }

    public void select_dropDown(By locator, String option){
        List<WebElement> dropDownList = listOfElements(locator);
        for(WebElement x: dropDownList){
            if (x.getText().contains(option)){
                x.click();
            }
        }
    }

}
