package steps;
import driver.GoogleChromeDriver;

public class GoPage{
    public static void openBrowser(String url){

        GoogleChromeDriver.ChromeDriver(url);

    }
}