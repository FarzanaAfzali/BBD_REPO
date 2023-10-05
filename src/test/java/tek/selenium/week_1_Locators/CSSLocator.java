package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocator {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        driver.findElement(By.name("username")).sendKeys("Supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector("body > app-root > app-home-page > div > app-toolbar > mat-toolbar > span:nth-child(2)")).getText());
        driver.quit();
    }
}
