package tek.selenium.week_1_Locators;
//or webdriver instead of chromedriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://google.com");
    }
}
