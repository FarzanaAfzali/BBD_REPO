package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tek.bdd.pages.AccountsPage;
import tek.bdd.seleniumutility.SeleniumUtility;

import java.util.List;

public class Accounts extends SeleniumUtility {
    @Then("click on the Account located at the left side panel")
    public void account_click(){
        click_element(AccountsPage.ACCOUNT_PATH);
    }
    @And("Validate the rows are {int}")
    public void validate_account_row(int expectedRows)throws InterruptedException{
        Thread.sleep(60000);
        int actualSize = listOfElements(AccountsPage.ACCOUNTS_TABLE).size();
        Assert.assertEquals("Table Size",
                expectedRows, actualSize);
    }

    @Then("click on item per page and change it to {string}")
    public void change_per_page(String numberPerPage){
        click_element(AccountsPage.ITEM_PER_PAGE);
        select_dropDown(AccountsPage.ITEM_PER_PAGE_OPTION, numberPerPage);

    }

    @Then("Validate Accounts table headers")
    public void account_Table(DataTable dataTable){
        List<List<String>> dataAsList = dataTable.asLists();
        List<String> expectedHeaders = dataAsList.get(0);
        List<WebElement> headerElements = listOfElements(AccountsPage.ACCOUNT_TABLE_HEADER_COLUMNS);

        for(int x = 0; x < expectedHeaders.size(); x++){
            String expectedHeader = expectedHeaders.get(x);
            String actualHeader = headerElements.get(x).getText();

            Assert.assertEquals("Account Table Headers",
                    expectedHeader,
                    actualHeader);
        }
    }


}
