package tek.bdd.runner;
// need junit and cucumber annotation
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// this mean we want to run cucumber features
@RunWith(Cucumber.class)

//Cucumber Options
@CucumberOptions(
        features = "classpath:test_features",// the path for features: classpath is standard for java
        glue = "tek.bdd.steps",// the path for steps, if left it will loop up all the packages
        tags = "@UserStory_7",// it looks for which tags, if left empty it will run all features
        plugin = {
                "html:target/html_report/report.html"// this will provide a report.
        }
)
public class TestRunner {
}
