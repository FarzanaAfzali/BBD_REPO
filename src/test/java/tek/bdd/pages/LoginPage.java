package tek.bdd.pages;

import org.openqa.selenium.By;

public class LoginPage {
    // this is bor By elements to find the all locators in Login page with Constants Variable
    // Constants variables are final that are not changeable once assigned.
    // can access these variable by className.VarName

    public final static By USERNAME = By.name("username");
    public final static By PASSWORD = By.name("password");
    public final static By LOGIN_BUTTON = By.id("loginButton");
    public final static By LOGGED_IN_ACCOUNT_NAME = By.xpath("//mat-toolbar/button[2]/span[1]");
    public final static By SECTION_TITLE = By.xpath("//mat-card/mat-card-title/strong");
    public final static By ERROR_MESSAGE = By.xpath("//mat-card-content/app-banner/div");
}
