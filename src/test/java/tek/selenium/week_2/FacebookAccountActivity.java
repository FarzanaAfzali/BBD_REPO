package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLSelectElement;

import java.time.Duration;

public class FacebookAccountActivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("https://www.facebook.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
        //newAccount
        By newAccount = By.linkText("Create new account");
        wait.until(ExpectedConditions.presenceOfElementLocated(newAccount)).click();

        //Firstname
        By fName = By.name("firstname");
        wait.until(ExpectedConditions.presenceOfElementLocated(fName)).sendKeys("Bob");

        //lastname
        By lName = By.name("lastname");
        wait.until(ExpectedConditions.presenceOfElementLocated(lName)).sendKeys("Sam");

        //phone num
        By pNum = By.name("reg_email__");
        wait.until(ExpectedConditions.presenceOfElementLocated(pNum)).sendKeys("8042337745");

        //password
        By password = By.id("password_step_input");
        wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("password123!");

        //The DropDown and DropUps:
        //DOB

        By month = By.id("month");
        WebElement theMonth = wait.until(ExpectedConditions.presenceOfElementLocated(month));
        Select selectM = new Select(theMonth);
        selectM.selectByValue("8");

        By day = By.id("day");
        WebElement theDay = wait.until(ExpectedConditions.presenceOfElementLocated(day));
        Select selectD = new Select(theDay);
        selectD.selectByVisibleText("22");

        By year = By.id("year");
        WebElement theYear = wait.until(ExpectedConditions.presenceOfElementLocated(year));
        Select selectY = new Select(theYear);
        selectY.selectByVisibleText("1998");

        //Gender
        By gender = By.id("u_3_4_Cb");
        //wait.until(ExpectedConditions.presenceOfElementLocated(gender)).click();

        //clickSignup
        By signup = By.name("websubmit");
       // wait.until(ExpectedConditions.presenceOfElementLocated(signup)).click();

       // driver.quit();



    }
}
