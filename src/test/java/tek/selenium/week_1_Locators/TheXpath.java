package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.DOM;

public class TheXpath {
    public static void main(String[] args) throws InterruptedException{
        //Xpath: all the xpaths are starting with / forward slash.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-login/mat-toolbar/span[1]")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[1]/strong")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/mat-card-title[2]")).getText());
        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("teksupervisor");
        driver.findElement(By.id("loginButton")).click();

        Thread.sleep(3000);
        String error = driver.findElement(By.cssSelector(".banner.error.ng-star-inserted")).getText();
        System.out.println(error);

        driver.quit();
    }
}
