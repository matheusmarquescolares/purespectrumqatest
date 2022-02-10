package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;

    public DriverFactory(){}

@Before
    public static WebDriver getDriver(){
        if (driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
            driver = new ChromeDriver();
            driver.manage().window().setSize((new Dimension(1200,765)));
        }
        return driver;


    }
@After
    public static void killDriver(){
        if (driver!=null){
            driver.quit();
            driver=null;
        }
}


}
