package runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//En este caso, se está utilizando CucumberWithSerenity.class, que es un runner específico para ejecutar pruebas escritas con Cucumber y Serenity BDD.
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        //Va tomar los escenarios definidos en archivo openBrowser
        features = "src/test/resources/features/login.feature",
        glue = "stepsDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class LoginRunner {
}



