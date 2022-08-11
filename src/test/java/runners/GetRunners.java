package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import stepdefinitions.hook.Hook;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src\\test\\resources\\features\\get.feature",
        glue = {
                "stepdefinitions.hook","stepdefinitions"
        }
)
public class GetRunners {
}
