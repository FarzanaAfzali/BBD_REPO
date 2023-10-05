package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TIPLoginVerification {
    public static void main(String[] args) throws InterruptedException{
        WebDriver runner = new ChromeDriver();
        runner.manage().window().maximize();

        runner.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        runner.findElement(By.name("username")).sendKeys("Supervisor");
        runner.findElement(By.name("password")).sendKeys("tek_supervisor");
        runner.findElement(By.id("loginButton")).click();
        Thread.sleep(3000);
        //runner.wait(3000);
        String name = "Supervisor";
        String portal = "Tek Insurance App";
        String accountName = runner.findElement(By.xpath("/html/body/app-root/app-home-page/div/app-toolbar/mat-toolbar/button[2]")).getText().substring(0, name.length());
        String portalName = runner.findElement(By.cssSelector("body > app-root > app-home-page > div > app-toolbar > mat-toolbar > span:nth-child(2)")).getText().substring(0,portal.length());

        if(name.equals(accountName) && portal.equals(portalName)){
            System.out.println("Test Passed!");
        }else
            System.out.println("Test Failed!");
        System.out.println(accountName);
        System.out.println(portalName);
        runner.quit();
    }
}
