package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTekInsuranceApp {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("supervisor");
        driver.findElement(By.name("password")).sendKeys("tek_supervisor");
        driver.findElement(By.id("loginButton")).click();

        String pageTitle = driver.getTitle();
        String status;
        if (pageTitle.equals("Tek Insurance Service")){
            status = "Pass";
            System.out.println(status);
        }else {
            status = "Fail";
            System.out.println(status);
        }

        //driver.quit();

    }
}
