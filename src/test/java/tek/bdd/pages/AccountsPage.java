package tek.bdd.pages;

import org.openqa.selenium.By;

public class AccountsPage {
    public final static By ACCOUNT_PATH = By.xpath("//mat-nav-list/a[1]");
    public final static By ACCOUNTS_TABLE = By.xpath("//table/tbody/tr");
    public final static By ITEM_PER_PAGE = By.cssSelector("//mat-paginator//mat-select");
    public final static By ITEM_PER_PAGE_OPTION = By.xpath("//mat-option/span");
    public final static By ACCOUNT_TABLE_HEADER_COLUMNS = By.xpath("//table/thead/tr/th");
}
