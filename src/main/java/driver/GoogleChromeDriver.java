package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleChromeDriver {

    public static WebDriver driver;

    public static void ChromeDriver(String url){


        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();

        //opciones de chromedriver
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-inforbars");

        driver = new ChromeDriver(options);
        driver.get(url);

    }

    public static void quitbrowser(){
        driver.quit();
    }


}
