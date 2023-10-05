package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButtonTest {
    public static void main(String[] args)throws InterruptedException{
        WebDriver runner = new ChromeDriver();
        runner.manage().window().maximize();
        runner.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        Boolean button = runner.findElement(By.id("loginButton")).isEnabled();
        System.out.println(button);
        if (button){//if button turn true
            System.out.println("Test failed!");
        }else {
            System.out.println("Test passed!");
        }

        runner.findElement(By.name("username")).sendKeys("supervisor");
        runner.findElement(By.name("password")).sendKeys("tek supervisor");
        Thread.sleep(2000);


        if (!button){//if button turn false
            System.out.println("Test Passed!");
            runner.findElement(By.name("loginButton")).click();
        }else {
            System.out.println("Test Failed!");
        }


        runner.quit();
    }
}
