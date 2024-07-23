package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //Va tomar los escenarios definidos en archivo openBrowser
        features = "src/test/resources/features/openBrowser.feature",
        glue = "stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class openBrowserRunner {
}
