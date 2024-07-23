package pages;
import org.openqa.selenium.By;




public class LoginPage {

    By TXTEMAIL = By.xpath("//input[@placeholder='Email']");
    By TXTPASSWORD = By.xpath("//input[@placeholder='Password']");
    By BTNLOGIN = By.xpath("//button[text()='Login']");
    By BTNREGISTER = By.xpath("//a[@id='Register']");
    By INPUTNAME = By.id("exampleInputEmail1");
    By INPUTUSERNAME = By.xpath("//input[@name='username']");
    By INPUTCOUNTRY = By.xpath("//select[@name='pais']");
    By INPUTCITY = By.xpath("//input[@name='city']");
    By INPUTNUMBERIDENTIFICATION = By.xpath("//input[@name='numberidentification']");
    By INPUTPHONE = By.xpath("//input[@name='phone']");
    By INPUTEMAIL = By.xpath("//input[@name='email']");
    By INPUTPASSWORD = By.xpath("//input[@name='password']");
    By INPUTVERIFYPASSWORD = By.id("password-confirm");

    By ANCLA = By.xpath("//a[@href='http://campusvirtual.izyacademy.com:8000/post']");

    public By getANCLA() {
        return ANCLA;
    }

    public void setANCLA(By ANCLA) {
        this.ANCLA = ANCLA;
    }

    By BUTTONREGISTER = By.xpath("//button[@id='effect-button']");

    public By getBUTTONREGISTER() {
        return BUTTONREGISTER;
    }

    public void setBUTTONREGISTER(By BUTTONREGISTER) {
        this.BUTTONREGISTER = BUTTONREGISTER;
    }

    public By getINPUTCOUNTRY() {
        return INPUTCOUNTRY;
    }

    public void setINPUTCOUNTRY(By INPUTCOUNTRY) {
        this.INPUTCOUNTRY = INPUTCOUNTRY;
    }

    public By getINPUTVERIFYPASSWORD() {
        return INPUTVERIFYPASSWORD;
    }

    public void setINPUTVERIFYPASSWORD(By INPUTVERIFYPASSWORD) {
        this.INPUTVERIFYPASSWORD = INPUTVERIFYPASSWORD;
    }

    public By getINPUTPASSWORD() {
        return INPUTPASSWORD;
    }

    public void setINPUTPASSWORD(By INPUTPASSWORD) {
        this.INPUTPASSWORD = INPUTPASSWORD;
    }

    public By getINPUTEMAIL() {
        return INPUTEMAIL;
    }

    public void setINPUTEMAIL(By INPUTEMAIL) {
        this.INPUTEMAIL = INPUTEMAIL;
    }

    public By getINPUTPHONE() {
        return INPUTPHONE;
    }

    public void setINPUTPHONE(By INPUTPHONE) {
        this.INPUTPHONE = INPUTPHONE;
    }

    public By getINPUTNUMBERIDENTIFICATION() {
        return INPUTNUMBERIDENTIFICATION;
    }

    public void setINPUTNUMBERIDENTIFICATION(By INPUTNUMBERIDENTIFICATION) {
        this.INPUTNUMBERIDENTIFICATION = INPUTNUMBERIDENTIFICATION;
    }

    public By getINPUTCITY() {
        return INPUTCITY;
    }

    public void setINPUTCITY(By INPUTCITY) {
        this.INPUTCITY = INPUTCITY;
    }

    public By getINPUTUSERNAME() {
        return INPUTUSERNAME;
    }

    public void setINPUTUSERNAME(By INPUTUSERNAME) {
        this.INPUTUSERNAME = INPUTUSERNAME;
    }

    public By getINPUTNAME() {
        return INPUTNAME;
    }

    public void setINPUTNAME(By INPUTNAME) {
        this.INPUTNAME = INPUTNAME;
    }

    public By getBTNREGISTER() {
        return BTNREGISTER;
    }

    public void setBTNREGISTER(By BTNREGISTER) {
        this.BTNREGISTER = BTNREGISTER;
    }

    public By getTXTEMAIL() {

        return TXTEMAIL;

    }

    public void setTXTEMAIL(By TXTEMAIL) {

        this.TXTEMAIL = TXTEMAIL;

    }

    public By getTXTPASSWORD() {

        return TXTPASSWORD;

    }

    public void setTXTPASSWORD(By TXTPASSWORD) {

        this.TXTPASSWORD = TXTPASSWORD;

    }

    public By getBTNLOGIN() {

        return BTNLOGIN;

    }

    public void setBTNLOGIN(By BTNLOGIN) {

        this.BTNLOGIN = BTNLOGIN;

    }

}