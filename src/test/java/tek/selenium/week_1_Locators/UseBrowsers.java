package tek.selenium.week_1_Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseBrowsers {
    public static void main(String[] args) {
        // everytime open a driver, it called session
        // to open a browser, we need to get an object of the browser.
       // WebDriver driver = new ChromeDriver();
        // in this case it is true cause chromeDriver implements from WebDriver.
        ChromeDriver runner = new ChromeDriver();
        runner.get("https://google.com");

        //get the title
        String title = runner.getTitle();
        System.out.println(title);
        runner.quit();

        //firefox
      //  FirefoxDriver fireFox = new FirefoxDriver();
      //  fireFox.get("https://google.com");
      //  System.out.println(fireFox.getTitle());
      //  fireFox.quit();
        // can do the same for all browser: Edge Browser



    }
}
