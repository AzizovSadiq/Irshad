package StepDefinitions;

import StepDefinitions.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.KataloqPom;
import pom.MobilTelefonlarPom;

public class MobilTelefonlarSteps  extends BaseMethods {

    MobilTelefonlarPom mobilTelefonlarPom;
    public MobilTelefonlarSteps(){
        mobilTelefonlarPom = mobilTelefonlarPom.getInstance();
    }


    @And("Clicks on the Mobil telefonlar button")
    public void clicksOnTheMobilTelefonlarButton() throws InterruptedException {
        WebElement element = getElement(mobilTelefonlarPom.getMobilTelefonlarButton());
        javascriptExecutor(element);
        Thread.sleep(3000);

    }
}
