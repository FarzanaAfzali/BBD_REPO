package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import java.util.List;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.PlanPageLocators;
import tek.bdd.seleniumutility.SeleniumUtility;

public class PlanSectionSteps extends SeleniumUtility {

    @When("After login click on plans")
    public void plan_click(){
        click_element(PlanPageLocators.PLAN);
    }

    @And("Section title should be as {string}")
    public void plan_text(String text){
        String planText = getElementText(PlanPageLocators.PLANS_TITLE);
        Assert.assertEquals("Plan title verification", text, planText);
    }
    @And("Section table should contain {int}")
    public void plan_table_content(int expectedSize){
        int actualSize = listOfElements(PlanPageLocators.ROW_PATH).size();
        Assert.assertEquals("Validate table size",expectedSize, actualSize);
    }

    @And("Validate all plans are Valid")
    public void validate_plans(){
        List<WebElement> elements = listOfElements(PlanPageLocators.COLUMN_PATH);
        for (WebElement x: elements){
            Assert.assertEquals("plan Validation", "Valid",x.getText());
        }
    }
// to complete
    @When("Plan Code header Sections should be as")
    public void sectionHeader(DataTable dataTable){
        //get the list of lists
        List<List<String>> tableAsList = dataTable.asLists();
        //get the first elements from the list of lists
        List<String> expectedHeaders = tableAsList.get(0);

        List<WebElement> elements = listOfElements(PlanPageLocators.TABLE_HEADER);

        for(int x = 0; x < elements.size(); x++){
            String actualHeader = elements.get(x).getText();
            String expectedHeader = expectedHeaders.get(x);

            Assert.assertEquals("Table header Validation",
                    expectedHeader,
                    actualHeader);
        }
    }


}
