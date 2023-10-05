package tek.selenium.week_1_Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        // throws use ing signature of the method for handling and giving responsibility to the system.
        // while throw is throwing exception to the system by out self.
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        Thread.sleep(1000 * 3);// to use the Thread.sleep() we need to throws the exception

        driver.quit();
        // throw new RunTimeException("xyzzz");
        // above line will Intentionally stop execution of application with throw keyword.
    }
}
