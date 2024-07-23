package steps;
import driver.GoogleChromeDriver;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.CategoryPage;
import pages.HomePage;
import pages.LoginPage;
import utils.DataDrivenExcel;
import utils.Excel;
import java.util.HashMap;
import java.util.Map;
import java.io.File;


public class loginStep {

    public loginStep(){

    }


    HomePage HomePage = new HomePage();
    LoginPage LoginPage = new LoginPage();
    CategoryPage categoryPage = new CategoryPage();


    Map<String, String> data = new HashMap<>();

    @Step
    public void clickButtonHome() {

        GoogleChromeDriver.driver.findElement(HomePage.getBTNHOME()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Step

    public void clickButtonRegister() {

        GoogleChromeDriver.driver.findElement(LoginPage.getBTNREGISTER()).click();

    }

    @Step
    public void enterData(int row) {
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, row);
        data = DataDrivenExcel.leerExcel(excel);

        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTNAME()).sendKeys(data.get("name"));
        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTUSERNAME()).sendKeys(data.get("username"));
        //se utiliza la clase Select para seleccionar una opción de la lista desplegable
        WebElement dropdownElement = GoogleChromeDriver.driver.findElement(By.xpath("//select[@name='pais']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(data.get("country"));

        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTCITY()).sendKeys(data.get("city"));
        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTNUMBERIDENTIFICATION()).sendKeys(data.get("Identification number"));
        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTPHONE()).sendKeys(data.get("phone"));
        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTEMAIL()).sendKeys(data.get("email"));
        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTPASSWORD()).sendKeys(data.get("password"));
        GoogleChromeDriver.driver.findElement(LoginPage.getINPUTVERIFYPASSWORD()).sendKeys(data.get("password"));




    }


    @Step
    public void ClickRegister(){
        GoogleChromeDriver.driver.findElement(LoginPage.getBUTTONREGISTER()).click();

    }

    @Step
    public void clickMenu(){
        GoogleChromeDriver.driver.findElement(HomePage.getBTNHOME()).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step
    public void clickPosts(){
        GoogleChromeDriver.driver.findElement(LoginPage.getANCLA()).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    @Step
    public void clickCategory(){
        GoogleChromeDriver.driver.findElement(categoryPage.getBTNDESPLIEQUE()).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        GoogleChromeDriver.driver.findElement(categoryPage.getBTNCATEGORY()).click();

    }

    @Step
    public void EnterDataCategory(int row){
        Excel excel = new Excel(Excel.rutaExcelDev, "Login", true, row);
        data = DataDrivenExcel.leerExcel(excel);
        GoogleChromeDriver.driver.findElement(categoryPage.getINPUTNAMECATEGORY()).sendKeys(data.get("name category"));
        System.out.println(data.get("name category"));
        GoogleChromeDriver.driver.findElement(categoryPage.getINPUTDESCRIPTIONCATEGORY()).sendKeys(data.get("description category"));
        System.out.println(data.get("description category"));
        GoogleChromeDriver.driver.findElement(categoryPage.getOPTION1()).click();

        //cargar imagen

        String rutaImagen = new File("src/main/resources/images/YimiRuiz.png").getAbsolutePath();
        GoogleChromeDriver.driver.findElement(categoryPage.getINPUTIMAGE()).sendKeys(rutaImagen);

        //clic botón crear

        GoogleChromeDriver.driver.findElement(categoryPage.getBTNCREATE()).click();


    }




}