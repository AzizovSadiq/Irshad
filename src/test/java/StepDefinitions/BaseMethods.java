package StepDefinitions;

import driverSession.CucucmberHook;
import enums.ExpectedConditionType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseMethods {
    WebDriverWait wait ;
    protected WebDriver driver;
    {
        driver = CucucmberHook.driver.get();
    }



    protected WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    protected List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    protected void clickElementLocation(By location) {
        Actions actions = new Actions(driver);
        actions.moveToElement(getElement(location)).click().perform();
    }

    protected int  getRandomNum( int size  ){
        return (int) (Math.random()*size);
    }

    protected void explicitWait(By locator , ExpectedConditionType expectedCondition , int time){
        wait = new WebDriverWait(driver , Duration.ofSeconds(time));
        switch(expectedCondition){
            case VISIBLE: {
                wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
                break;
            }
            case PRESENCE:{
                wait.until(ExpectedConditions.presenceOfElementLocated(locator));
                break;
            }
            case INVISIBLE:{
                wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
                break;
            }
            case CLICKABLE:{
                wait.until(ExpectedConditions.elementToBeClickable(locator));
                break;
            }
            default: throw new IllegalArgumentException("Wrong expected condition");
        }
    }

    protected static int generateRandomNum(int size){
        return (int)(size*Math.random());
    }

    protected void  javascriptExecutor ( WebElement element){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    protected void actionsMoveToElement(WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }



}
