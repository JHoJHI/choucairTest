package co.com.orangeDemo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/OrangeDemo.feature",
        glue = "co.com.orangeDemo.stepdefinitions",
        tags = "@EscenarioContratación",
        snippets = SnippetType.CAMELCASE
)
public class RunnerOrangeHMDemo {
}
