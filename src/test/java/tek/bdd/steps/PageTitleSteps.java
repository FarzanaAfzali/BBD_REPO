package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import tek.bdd.seleniumutility.SeleniumUtility;

public class PageTitleSteps extends SeleniumUtility {

    @Given("Navigate to the browser")
    public void navigation(){
        openBrowser();
    }

    @Then("Validate application's title as {string}")
    public void titleVar(String title){
        String titleName = getDriver().getTitle();
        System.out.println(titleName);

    }

    @Then("Close the browser")
    public void closure(){
        driverQuit();
    }

    @Then("Validate application's header title as {string}")
    public void headerTitle(String expectedHeader){
        By header = By.xpath("//mat-toolbar/span[1]");
        String headerText = getElementText(header);
        System.out.println(headerText);
    }


}
