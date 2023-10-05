package tek.bdd.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.bdd.seleniumutility.SeleniumUtility;

public class Hooks extends SeleniumUtility {
    // This class is for hooks.
    // hooks are the before and after repeated methods that we always use before and after each Scenario.
    @Before
    public void startTest(){
        openBrowser();
    }

    @After
    public void endTest (Scenario scenario){
        //should attach the screenshot of the bug or failure
        //@AfterStep comes from selenium and take screenshot after each steps
        //byte
        //with scenario
        if (scenario.isFailed()){
            byte[] picture = take_screenshot();
            scenario.attach(picture, "image/png", "failedScreenShot");
        }
        driverQuit();
    }
}
