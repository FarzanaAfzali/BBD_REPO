package tek.selenium.week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TheWaits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Add Implicitly wait
        //Duration.ofSeconds is a class of java time.
        //implicitly will apply on browser not on application.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Add Explicitly wait
        // we can instanciate and wait for each element each time
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        By username = By.name("username");
        wait.until(ExpectedConditions.presenceOfElementLocated(username)).sendKeys("Supervisor");
        //the wait.untill(ExpectedCondition.prescense of element) will find the locater
        // so we don't use driver.findElement(xy)

        By password = By.name("password");
        wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys("tek_supervisor");
        //make sure to use ExpectedConditions. with s at the end. it is an interface.

        By click = By.id("loginButton");
        wait.until(ExpectedConditions.presenceOfElementLocated(click)).click();
    }
}
