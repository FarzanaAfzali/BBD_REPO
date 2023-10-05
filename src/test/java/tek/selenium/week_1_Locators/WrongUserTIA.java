package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrongUserTIA {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        driver.findElement(By.name("username")).sendKeys("farzanajan");
        driver.findElement(By.name("password")).sendKeys("tek supervisor");
        driver.findElement(By.id("loginButton")).click();

        Thread.sleep(2000);

       // Alert alert = driver.switchTo().alert();
       // String alertText = driver.switchTo().alert().getText();
        //alert.accept();

        String errorText = driver.findElement(By.cssSelector(".banner.error.ng-star-inserted")).getText();
        System.out.println(errorText);

        if (errorText.equals("User not found")){
            System.out.println("The Test is passed!");
        }else{
            System.out.println("The Test is failed!");
        }
        driver.quit();
    }
}
