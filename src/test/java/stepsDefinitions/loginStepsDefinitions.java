package stepsDefinitions;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.When;
import steps.loginStep;

public class loginStepsDefinitions {



    public loginStepsDefinitions() {
    }
    //instanciamos clase loginStep para traer metodos
    loginStep loginStep = new loginStep();

    //se crean parametros
    @ParameterType(".*")
    public int row(String captureGroup){
       return Integer.parseInt(captureGroup);
    }

    @When("the user clicks the button")
    public void theUserClicksTheButton() {
        loginStep.clickButtonHome();

    }

    @When("the user clicks the text register")
    public void theUserClicksTheTextRegister() {
        loginStep.clickButtonRegister();


    }
    @When("the user enters the data {int}")
    public void theUserEntersTheData(int row) {
        loginStep.enterData(row);
    }

    @When("the user clicks the button register")
    public void theUserClicksTheButtonRegister() {
        loginStep.ClickRegister();
    }

    @When("the user clicks the button menu")
    public void theUserClicksTheButtonMenu() {
        loginStep.clickMenu();

    }

    @When("the user clicks the option posts")
    public void theUserClicksTheOptionPosts() {
        loginStep.clickPosts();

    }

    @When("the user click the option list category {row}")
    public void theUserClicksTheOptionListCategory(int row) {
        loginStep.clickCategory();
        loginStep.EnterDataCategory(row);

    }

}
