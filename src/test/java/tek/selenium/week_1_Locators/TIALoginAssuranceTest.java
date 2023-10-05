package tek.selenium.week_1_Locators;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TIALoginAssuranceTest {
    public static void main(String[] args) throws InterruptedException{
        //objects
        Scanner scanner = new Scanner(System.in);

        // user input
        System.out.println("Enter the username:");
        String username = scanner.next();
        System.out.println("Enter the password:");
        String password = scanner.next();

        // request to access Tek Insurance Application
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://happy-desert-0f05d560f.1.azurestaticapps.net/");

        //pass the user inputs
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(3000);

        //get the error
        String errorText = driver.findElement(By.cssSelector(".banner.error.ng-star-inserted")).getText();
        System.out.println(errorText);

        if (errorText.equals("User not found") || errorText.equals("Password Not Matched")){
            System.out.println("Test Passed!");
        }else
            System.out.println("Test Failed!");
        driver.quit();
    }
}
