package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityOptionalPage {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.className("gLFyf")).sendKeys("Laptops 2023");
        driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        driver.quit();
    }
}
