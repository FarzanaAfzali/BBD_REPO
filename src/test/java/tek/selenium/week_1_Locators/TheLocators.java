package tek.selenium.week_1_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheLocators {
    public static void main(String[] args) throws InterruptedException{
        // by className
        // by name
        // by id
        // by CSS Selector
        //by LinkText
        // by tag name: <a> <div>
        //PartailLink text
        //Xpath: the path we copy from them


        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://tek-retail-ui.azurewebsites.net/selenium");

        //By xpath:
        //driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/a[9]")).click();
        //Thread.sleep(1000*3);

        //by Link Text
        // you select the text inside the html code you looking for:
        //driver.findElement(By.linkText("Drag and Drop")).click();
        //Thread.sleep(1000*3);

        driver.findElement(By.partialLinkText(""));

        // Why locators don't work:
        //1. read the error and make sure u see and understand the error selenium says
        //1. sometime selenium is so fast and application is slow, give a Thread.sleep()
        // to maintain the time.
        // can use LinkedText and partialLinkedText only for link like: <a>fdfsdff<a/>.



        driver.quit();



    }
}
