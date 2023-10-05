package tek.selenium.week_2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RelativeXPath {
    public static void main(String[] args) {
        //Relative XPath is to make short the full xpath.
        // while writing the relative xpath we should start by // double forward slashes.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qa.insurance.tekschool-students.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();
        driver.findElement(By.xpath("//mat-drawer/div/app-menu-items/mat-nav-list/a/span")).click();

        // one ay is to loop by 8. but it will be limited to 8, what if application update and it is not 8 anymore.
      //  for (int x = 1; x<=8; x++) {
        ///    By elements = new By.ByXPath("//table/thead/tr/th["+ x + "]");
           // WebElement theElements = wait.until(ExpectedConditions.presenceOfElementLocated(elements));
            //System.out.println(theElements.getText());
        //}

        // another way to make a list of them and loop through the list:
        By element = new By.ByXPath("//table/thead/tr/th");
        List<WebElement> elementList = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
        for (WebElement x: elementList){
            System.out.println(x.getText());
        }
        driver.quit();
    }
}
