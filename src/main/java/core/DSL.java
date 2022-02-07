package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import javax.print.DocFlavor;
import java.sql.Driver;
import static core.DriverFactory.getDriver;

public class DSL {

    public void goToURL (String url){

        getDriver().navigate().to(url);
    }

    public void write(String id_field, String text){
        getDriver().findElement(By.id(id_field)).clear();
        getDriver().findElement(By.id(id_field)).sendKeys(text);
    }

    public void clickButton(String id_field){
        getDriver().findElement(By.id(id_field)).click();
    }

    public void clickCaptcha (String css_value){
        getDriver().findElement(By.cssSelector(css_value)).click();
    }

    public String obtainText (By by){
        return getDriver().findElement(by).getText();
    }

    public String obtainTextById (String id_field){
        return getDriver().findElement(By.id(id_field)).getText();
    }

    public String obtainTextFromPopUp () {
        Alert alert = getDriver().switchTo().alert();
        return getDriver().switchTo().alert().getText();
    }

    public boolean isTextZero(String id){
        return getDriver().findElement(By.id(id)).equals("0");
    }

    public String obtainFieldValue(String id_field){
        return getDriver().findElement(By.id(id_field)).getAttribute("value");
    }

}
