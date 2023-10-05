package tek.selenium.week_1_Locators;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameActivity {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.bbc.com/");

        //with tagName we search like specific html tag name like: div, a, href, type, name...

        List<WebElement> linklist = driver.findElements(By.tagName("a"));
        for (WebElement x: linklist){
            System.out.println(x.getText());// by getText() we get the link's real text.
        }
        driver.quit();

    }
}
