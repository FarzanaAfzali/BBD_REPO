package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityFillingForm {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        driver.findElement(By.linkText("Inputs")).click();

        driver.findElement(By.id("textInput")).sendKeys("Farzana");
        driver.findElement(By.id("emailInput")).sendKeys("farzana@gmail.com");
        driver.findElement(By.name("password")).sendKeys("password123");
        driver.findElement(By.name("date")).sendKeys("04/22/1999");
        driver.findElement(By.name("number")).sendKeys("24");
        WebElement range = driver.findElement(By.id("rangeInput"));
        for(int x = 0; x<=25; x++){
            range.sendKeys(Keys.RIGHT);
        }

        Thread.sleep(5000);

        driver.quit();
    }
}
