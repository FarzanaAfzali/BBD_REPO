package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import tek.bdd.pages.LoginPage;
import tek.bdd.seleniumutility.SeleniumUtility;
import org.junit.Assert;

public class Login extends SeleniumUtility {

    @Then("Validate login button is disabled")
    public boolean staticLoginButtonDisable() {
        return login_button_Validation(LoginPage.LOGIN_BUTTON);
    }

    @And("Type in the username {string}")
    public void typeUsername(String username) {
        send_text(LoginPage.USERNAME, username);

    }

    @And("Type in the password {string}")
    public void typePassword(String password) {
        send_text(LoginPage.PASSWORD, password);

    }

    @And("Validate login button is enabled")
    public boolean loginButtonEnable() {
        return login_button_Validation(LoginPage.LOGIN_BUTTON);
    }

    @And("click on the login button")
    public void clickLoginButton() {
        getDriver().findElement(By.id("loginButton")).click();
    }

    @And("Validate login by account's username {string}")
    public void loginValidation(String username) {
        String account_text = getElementText(LoginPage.LOGGED_IN_ACCOUNT_NAME).substring(0, username.length());
        Assert.assertEquals("The User name:", username,account_text);

    }

    @And("Validate Login Section header title as {string}")
    public void sectionTitleVar(String expectedTitle) {

        String actualTitleText = getElementText(LoginPage.SECTION_TITLE);
        Assert.assertEquals("Validate Login Section Title",
                expectedTitle,
                actualTitleText);
    }


    @Then("Validate the errorMassage{string}")
    public void validateTheErrorMassage(String expectedText) {
        String actualText = getElementText(LoginPage.ERROR_MESSAGE);
        Assert.assertEquals("Error Text", expectedText, actualText);
    }
}
