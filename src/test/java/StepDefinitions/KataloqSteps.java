package StepDefinitions;

import StepDefinitions.BaseMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pom.KataloqPom;

import java.util.ArrayList;
import java.util.List;

public class KataloqSteps extends BaseMethods {
    KataloqPom kataloqPom;

    public KataloqSteps() {
        kataloqPom = KataloqPom.getInstance();
    }

    @When("Clicks on Kataloq button")
    public void userClicksInKataloqButton() throws InterruptedException {
        getElement(kataloqPom.getKataloqButton()).click();
        Thread.sleep(3000);
    }

    @Then("Dropdown menu should be shown")
    public void dropdownMenuShouldBeShown() {
        WebElement element = getElement(kataloqPom.getKataloqDropDownMenu());
        Assert.assertTrue(element.isDisplayed());

    }


    @Then("{string} items dropdown menu should be shown")
    public void itemsDropdownMenuShouldBeShown(String kataloqSection) {
        WebElement element = getElement(kataloqPom.getKataloqElementsDropDownMenu());
        Assert.assertTrue(element.isDisplayed());
    }

    @And("Clicks on {string} button in the Kataloq dropdown")
    public void clicksOnButtonInTheKataloqDropdown(String element2) {
        WebElement element = getElement(By.xpath("//*[@class='menu-section']//span//img[@alt='" + element2 + "']"));
        javascriptExecutor(element);

    }

    @Then("User should be navigated to the {string} page")
    public void userShouldBeNavigatedToThePage(String page) throws InterruptedException {
        Assert.assertTrue(getElement(kataloqPom.getYalnızOnlaynMehsullarTitle()).isDisplayed());

    }

    @And("Clicks on the {string} button")
    public void clicksOnTheButton(String item) throws InterruptedException {
        WebElement element = getElement(By.xpath("//*[@class = 'content']//ul//li//a[@aria-label='" + item + "']"));
        javascriptExecutor(element);
        Thread.sleep(5000);

    }

    @Then("User should be navigated to  {string} page")
    public void userShouldBeNavigatedToPage(String page) {
        String actualPage = getElement(kataloqPom.getPageTitle()).getText();
        Assert.assertTrue(actualPage.equalsIgnoreCase(page));

    }
}
