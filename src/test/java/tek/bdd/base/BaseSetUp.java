package tek.bdd.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetUp {

    private static WebDriver driver;

    public void openBrowser(){
        // to read the property file where we save the url
        //step1. need the absolute file path of the property
        //System.getProperty("user.dir"): gives us the path from where we saved the property to the src of the project. A shortcut.
        String propertyAbsolutePath = System.getProperty("user.dir") + "/src/test/resources/Configs/qa_env_config.properties";

        // Step2. Instantiate Properties
        Properties properties = new Properties();

        // Step3. load the properties in instantiated object of properties:
        // we will need FileInputStream from java.util that will need throwing exception
        try{
            FileInputStream config = new FileInputStream(propertyAbsolutePath);
            properties.load(config);
        }catch(IOException e){// this is a checked exception and usually occur while error happens during reading streams or files.
            e.printStackTrace();
        }

        // step4. read value from property file using the key
        String baseUrl = properties.getProperty("ui.url");
        String browserType = properties.getProperty("ui.browser.type");

        if (browserType.equalsIgnoreCase("chrome")){//equalsIgnoreCase compare two string ignoring lower and upper cases
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Wrong Browser type!");//this line stop execution
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(baseUrl);
    }

    //driver.quit()
    public void driverQuit(){
        if (driver != null){
            driver.quit();
        }
    }


    //Getter
    public static WebDriver getDriver(){
        return driver;
    }

    //Explicitly wait


}
