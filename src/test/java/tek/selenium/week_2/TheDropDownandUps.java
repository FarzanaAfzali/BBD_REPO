package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TheDropDownandUps {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium/dropdown");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        // in java Selenium, Select use to choose through the Dropdown and dropUps.
        // can get object of Select each time you wanna use it
        // have three ways:
        //by index: gonna count from 0
        // by visible text: the text that is visible with the drop menue
        // by value: is attribute value that we can see in option in html code.


        //By Value
        By language = By.name("language");
        WebElement theLang = wait.until(ExpectedConditions.presenceOfElementLocated(language));
        Select selectLang = new Select(theLang);
        selectLang.selectByValue("python");

        //By visible Text
        By country = By.name("country");
        WebElement theCountry = wait.until(ExpectedConditions.presenceOfElementLocated(country));
        Select selectCountry = new Select(theCountry);
        selectCountry.selectByVisibleText("United States");

        //By Index
        By countryLang = By.id("languageSelect");
        WebElement theCL = wait.until(ExpectedConditions.presenceOfElementLocated(countryLang));
        Select selectCL = new Select(theCL);
        selectCL.selectByIndex(1);


    }
}
