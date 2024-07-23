package stepsDefinitions;
import driver.GoogleChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import steps.GoPage;


public class openBrowserStepsDefinitions {


    @After
    public void tearDown(){
        GoogleChromeDriver.quitbrowser();
    }

    @Given("the user enter the page")
    public void theUserEnterThePage() {
       GoPage.openBrowser("http://campusvirtual.izyacademy.com:8000/post");

    }
}
