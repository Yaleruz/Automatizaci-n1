package pages;

import org.openqa.selenium.By;

public class HomePage {

    By BTNSIGNIN = By.xpath("//a[@href='#/login']");
    By LBLNAME = By.xpath("//div[@class='nav-link dropdown-toggle cursor-pointer']");
    By BTNHOME = By.id("toogle_menu");

    public By getBTNHOME() {
        return BTNHOME;
    }

    public void setBTNHOME(By BTNHOME) {
        this.BTNHOME = BTNHOME;
    }

    public By getLBLNAME() {
        return LBLNAME;
    }

    public void setLBLNAME(By LBLNAME) {
        this.LBLNAME = LBLNAME;
    }

    public By getBTNSIGNIN() {

        return BTNSIGNIN;

    }

    public void setBTNSIGNIN(By BTNSIGNIN) {

        this.BTNSIGNIN = BTNSIGNIN;

    }

}