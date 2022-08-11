package runners;

import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.exceldata.BeforeSuite;
import utils.exceldata.DataToFeature;

import java.io.IOException;

@RunWith(CustomeRunner.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/post.feature",
        glue = {
                "stepdefinitions.hook","stepdefinitions"
        }
)
public class PostRunners {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        DataToFeature.overrideFeatureFiles("./src/test/resources/features/post.feature");
    }
}
