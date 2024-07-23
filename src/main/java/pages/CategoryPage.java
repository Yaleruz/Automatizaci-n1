package pages;

import org.openqa.selenium.By;

public class CategoryPage {

    By BTNCATEGORY = By.id("effect-button");
    By BTNDESPLIEQUE = By.xpath("//button[contains(text(),'¿Qué acción deseas realizar?')]");
    By INPUTNAMECATEGORY = By.xpath("//input[@name='CategorieName']");
    By INPUTDESCRIPTIONCATEGORY = By.xpath("//input[@name='descriptionCategory']");
    By OPTION1 = By.xpath("//input[@value='Easy' and @class='form-check-input' and @type='radio' and @name='flexRadioDefault' and @id='flexRadioDefault1']");
    By INPUTIMAGE = By.id("featured");
    By BTNCREATE = By.id("effect-button");

    public By getBTNCREATE() {
        return BTNCREATE;
    }

    public void setBTNCREATE(By BTNCREATE) {
        this.BTNCREATE = BTNCREATE;
    }

    public By getINPUTIMAGE() {
        return INPUTIMAGE;
    }

    public void setINPUTIMAGE(By INPUTIMAGE) {
        this.INPUTIMAGE = INPUTIMAGE;
    }

    public By getOPTION1() {
        return OPTION1;
    }

    public void setOPTION1(By OPTION1) {
        this.OPTION1 = OPTION1;
    }

    public By getINPUTDESCRIPTIONCATEGORY() {
        return INPUTDESCRIPTIONCATEGORY;
    }

    public void setINPUTDESCRIPTIONCATEGORY(By INPUTDESCRIPTIONCATEGORY) {
        this.INPUTDESCRIPTIONCATEGORY = INPUTDESCRIPTIONCATEGORY;
    }

    public By getINPUTNAMECATEGORY() {
        return INPUTNAMECATEGORY;
    }

    public void setINPUTNAMECATEGORY(By INPUTNAMECATEGORY) {
        this.INPUTNAMECATEGORY = INPUTNAMECATEGORY;
    }

    public By getBTNDESPLIEQUE() {
        return BTNDESPLIEQUE;
    }

    public void setBTNDESPLIEQUE(By BTNDESPLIEQUE) {
        this.BTNDESPLIEQUE = BTNDESPLIEQUE;
    }

    public By getBTNCATEGORY() {
        return BTNCATEGORY;
    }

    public void setBTNCATEGORY(By BTNCATEGORY) {
        this.BTNCATEGORY = BTNCATEGORY;
    }
}
