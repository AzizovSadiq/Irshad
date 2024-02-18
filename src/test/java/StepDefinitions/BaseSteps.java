package StepDefinitions;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import pom.BasePom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BaseSteps extends BaseMethods {
    BasePom basePom;
     public BaseSteps () {basePom = BasePom.getInstance();}
    int index;
    String basketItemName;
    String favorit;

    @Given("User is in {string} website")
    public void userIsInWebsite(String website) {

    }


    @When("Clicks on {string} button in the {string}")
    public void clicksOnButtonInTheHeader(String expected, String s2) throws InterruptedException {
        WebElement element = getElement(By.xpath("//div[@class='container-fluid']//ul//li//a[@aria-label='" + expected + "']"));
        javascriptExecutor(element);
        Thread.sleep(5000);


    }

    @Then("Should be navigated to {string} page")
    public void shouldBeNavigatedToPage(String expected) {
        String actualUrl = driver.getCurrentUrl();
        switch (expected) {
            case "Kampaniyalar":
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Kampaniyalar"));
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Mağazalar":
                String expectedMagazalar = "magazalar";
                Assert.assertTrue(driver.findElement(By.className("stores__title")).getText().equals("Mağazalar"));
                Assert.assertTrue(actualUrl.contains(expectedMagazalar.toLowerCase()));
                break;
            case "Korporativ":
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Samsung":
                Assert.assertTrue(driver.findElement(By.className("stream-image-1433")).isDisplayed());
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Apple":
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Apple"));
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Outlet":
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Outlet"));
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Haqqımızda":
                String expectedHaqqimizda = "haqqimizda";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Haqqımızda"));
                Assert.assertTrue(actualUrl.contains(expectedHaqqimizda.toLowerCase()));
                break;
            case "Vakansiyalar":
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Vakansiyalar"));
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Şərtlərimiz":
                String expectedSertlerimiz = "sertlerimiz";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Şərtlərimiz"));
                Assert.assertTrue(actualUrl.contains(expectedSertlerimiz.toLowerCase()));
                break;
            case "Çatdırılma qaydaları":
                String expectedCatdirilmaQaydalari = "catdirilma-qaydalari";

                Assert.assertTrue(actualUrl.contains(expectedCatdirilmaQaydalari.toLowerCase()));
                break;
            case "Bonuslardan istifadə qaydaları":
                String expectedBonuslardanIstifadeQaydalari = "bonuslardan-istifade-qaydalari";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Bonuslardan istifadə qaydaları"));
                Assert.assertTrue(actualUrl.contains(expectedBonuslardanIstifadeQaydalari.toLowerCase()));
                break;
            case "ŞadKart":
                String expectedSadKart = "sadkart";
                Assert.assertTrue(driver.findElement(By.className("campaigns-inner__title")).getText().equals("ŞadKart"));
                Assert.assertTrue(actualUrl.contains(expectedSadKart.toLowerCase()));
                break;
            case "Sual-Cavab":
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Sual-Cavab"));
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Hissə-hissə ödəniş":
                String expectedHisseHisseOdenis = "hisse-hisse-odenis";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Hissə-hissə ödəniş"));
                Assert.assertTrue(actualUrl.contains(expectedHisseHisseOdenis.toLowerCase()));
                break;
            case "Məxfilik siyasəti":
                String expectedMexfilikSiyaseti = "mexfilik-siyaseti";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Məxfilik siyasəti"));
                Assert.assertTrue(actualUrl.contains(expectedMexfilikSiyaseti.toLowerCase()));
                break;
            case "Korporativ satışlar":
                String expectedKorporativSatislar = "korporativ-satislar";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Korporativ"));
                Assert.assertTrue(actualUrl.contains(expectedKorporativSatislar.toLowerCase()));
                break;
            case "İstifadə qaydaları":
                String expectedIstifadeGaydalari = "istifade-qaydalari";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("İstifadə qaydaları"));
                Assert.assertTrue(actualUrl.contains(expectedIstifadeGaydalari.toLowerCase()));
                break;
            case "Bloq":
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Bloq"));
                Assert.assertTrue(actualUrl.contains(expected.toLowerCase()));
                break;
            case "Şikayət və təkliflər":
                String expectedSikayetVeTeklifler = "sikayet-ve-teklifler";
                Assert.assertTrue(driver.findElement(By.className("container-fluid")).getText().equals("Şikayət və təkliflər"));
                Assert.assertTrue(actualUrl.contains(expectedSikayetVeTeklifler.toLowerCase()));
                break;
            default:
                System.out.println("Duzgun navigate olunmadi !!!! ");
                break;
        }
    }

    @And("Hovers mouse over {string} buttons")
    public void hoversMouseOverButtons(String kataloqElement) throws InterruptedException {
        Thread.sleep(3000);
        WebElement element = getElement(By.xpath("//*[@class='menu-section']//span//img[@alt='" + kataloqElement + "']"));
        actionsMoveToElement(element);


    }

    @And("Puts the value from {string} to {string} the price")
    public void putsTheValueFromToThePrice(String from, String to) throws InterruptedException {;
        WebElement priceFilter = getElement(basePom.getFromToPriceCheckbox());
        WebElement startPriceInput  = priceFilter.findElement(basePom.getStartPriceInput());
        startPriceInput.clear();
        startPriceInput.sendKeys(String.valueOf(from));
        Thread.sleep(2000);
        WebElement endPriceInput = priceFilter.findElement(basePom.getEndPriceInput());
         endPriceInput.clear();
        endPriceInput.sendKeys(String.valueOf(to));
        Thread.sleep(2000);


    }

    @Then("Items in the page should be ordered according from {string} to {string}")
    public void itemsInThePageShouldBeOrderedAccordingFromTo(String from, String to) {
        List<WebElement> items = new ArrayList<>(getElements(basePom.getItems()));
        List<WebElement> productPrice = getElements(basePom.getNewPriceProduct());
        double price;
        double startPrice = Double.parseDouble(from);
        double endPrice = Double.parseDouble(to);
        for (WebElement element : productPrice) {
            price = Double.parseDouble(element.getText().replace("AZN", ""));

            Assert.assertTrue((startPrice <= price) && (price <= endPrice));
        }
    }

    @And("Choose {string} in the Brend checkbox")
    public void chooseInTheBrendCheckbox(String expectedBrend) throws InterruptedException {
        WebElement container = getElement(basePom.getBrandContainer());
        List<WebElement> productList = container.findElements(basePom.getBrandContainerElements());
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(expectedBrend)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(2000);


    }

    @And("Clicks on the {string} button in the item's description")
    public void clicksOnTheButtonInTheItemSDescription(String ayliq) throws InterruptedException {
        Thread.sleep(3000); // BU SILINMEYECEK !!!!!!
        List<WebElement> itemsDescription = new ArrayList<>(getElements(By.className("product__flex-right")));
        index = generateRandomNum(itemsDescription.size());
        System.out.println(index + " INDEX");
        WebElement expected = itemsDescription.get(index);
        System.out.println(" EXPECTED ELEMENT BASLADI " + "\n" + expected.getText() + "\n" + "EXPECTED ELEMENT BITDI");
        WebElement itemsTaksitOptions = expected.findElement(By.xpath("//div[2][@class='product__footer']" +
                "//div[@class='product__price']//div[@class='product__price__list']" +
                "//div[@class='product__price__list__taksit']"));

        List<WebElement> taksits = new ArrayList<>(itemsTaksitOptions.findElements(By.tagName("label")));
        System.out.println(taksits.size() + " kredit secim (3)");
        for (WebElement element : taksits) {
            if (element.getText().contains(ayliq)) {
                System.out.println(element.getText() + "---------" + ayliq);
                Actions actions = new Actions(driver);
                actions.moveToElement(element).click().perform();
                break;
            }
        }
        Thread.sleep(2000);
    }


    @Then("The monthly payment for the item should be displayed according to taksit {string}.")
    public void theMonthlyPaymentForTheItemShouldBeDisplayedAccordingToTaksit(String ayliq) throws InterruptedException {
        Thread.sleep(2000);
        double taksit = Double.parseDouble(ayliq);
        List<WebElement> oldPrice = new ArrayList<>(getElements(By.className("old-price")));
        List<WebElement> newPrice = new ArrayList<>(getElements(By.className("new-price")));
        List<WebElement> taksitPrice = new ArrayList<>(getElements(By.className("product__price__list__taksit-price")));
        boolean flag = oldPrice.get(index).isDisplayed();
        System.out.println(oldPrice.get(index).getText());
        if (flag) {
            double totalPrice = Double.parseDouble(oldPrice.get(index).getText().replace("AZN", ""));
            double expected = (totalPrice / taksit);
            String expectedMountlyPayment = String.valueOf(expected);
            System.out.println(expectedMountlyPayment + " GOZLENILEN AYLIQ");
            System.out.println(taksitPrice.get(index).getText() + " ELDE OLAN AYLIQ ");
            Thread.sleep(20000);
            Assert.assertTrue(taksitPrice.get(index).getText().contains(expectedMountlyPayment));

        }

    }


    @When("Click to discount checkbox")
    public void clickToDiscountCheckbox() throws InterruptedException {
        getElement(basePom.getEndrimdeOlanButton()).click();
        Thread.sleep(2000);
    }

    @Then("Only discounted items are visible")
    public void onlyDiscountedItemsAreVisible() throws InterruptedException {
        List<WebElement> list = getElements(basePom.getOldPrice());
        boolean flag = false;
        for (WebElement item : list) {
            if (item.isDisplayed()) {
                flag = true;
            } else {
                System.out.println("Error");
                break;
            }
        }
        Assert.assertTrue(flag);

    }


    @When("User clicks add to card btn for random item")
    public void userClicksAddToCardBtnForRandomItem() throws InterruptedException {
        List<WebElement> list = getElements(basePom.getSebeteElaveEtButtons());
        List<WebElement> textList = getElements(basePom.getItemName());
        int randomNum = getRandomNum(list.size());
        WebElement element = list.get(randomNum);
        javascriptExecutor(element);
        Thread.sleep(6000);
        basketItemName = textList.get(randomNum).getText();
    }

    @And("Clicks to basket button")
    public void clicksToBasketButton() throws InterruptedException {
        WebElement element = getElement(basePom.getCloseSebetPopUp());
        javascriptExecutor(element);
        Thread.sleep(3000);
       WebElement sebet =  getElement(basePom.getSebetButton());
       javascriptExecutor(sebet);
        Thread.sleep(3000);
    }

    @And("Click the Delete button")
    public void clickTheDeleteButton() throws InterruptedException {
        getElement(basePom.getDeleteItemButton()).click();
    }

    @Then("selected item should be shown in basket")
    public void selectedItemShouldBeShownInBasket() {
        List<WebElement> itemsTitle = new ArrayList<>(getElements(basePom.getItemName()));
        for (WebElement element : itemsTitle) {
            if (element.getText().equals(basketItemName)) {
                Assert.assertTrue(element.isDisplayed());
                break;
            }
        }

    }


    @When("User clicks favorit btn for random item")
    public void userClicksFavoritBtnForRandomItem() throws InterruptedException {

        List<WebElement> list = getElements(basePom.getBeyendimButtonAboveItem());
        List<WebElement> textList = getElements(basePom.getItemName());
        int randomNum = getRandomNum(list.size());
        WebElement element = list.get(randomNum);
        javascriptExecutor(element);
        Thread.sleep(8000);
        favorit = textList.get(randomNum).getText();
    }

    @And("Clicks to favorit button")
    public void clicksToFavoritButton() throws InterruptedException {
        Thread.sleep(4000);
        WebElement element = getElement(basePom.getBeyendimButton());
        javascriptExecutor(element);
        Thread.sleep(2000);
    }

    @Then("selected item should be shown in favorit")
    public void selectedItemShouldBeShownInFavorit() throws InterruptedException {
        Thread.sleep(2000);
        String actualText = getElement(basePom.getItemName()).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualText, favorit);
    }


    @And("Click the favorite button to delete")
    public void clickTheFavoriteButtonToDelete() throws InterruptedException {
        Thread.sleep(2000);
      WebElement element =   getElement(basePom.getBeyendimButtonAboveItem());
      javascriptExecutor(element);
    }

    @Then("Product has been removed from the page")
    public void productHasBeenRemovedFromThePage() throws InterruptedException {
        boolean silinib = false;
        List<WebElement> elements = getElements(basePom.getPageContainer());
        for (WebElement item : elements) {
            if ((item.getText() == favorit) && (item.getText() == basketItemName)) {
                silinib = true;
                break;
            }
        }
        Assert.assertFalse(silinib);

    }

    @Then("Items in the {string} page should be ordered according to the {string} checkbox")
    public void itemsInThePageShouldBeOrderedAccordingToTheCheckbox(String page, String brand) {
        List<WebElement> itemTitles = getElements(basePom.getItemName());
        if(page.equalsIgnoreCase("Telefon Ve Aksesuarlar") && brand.equalsIgnoreCase("Apple")) {
            brand = "iPhone";
            for (WebElement element : itemTitles) {
                Assert.assertTrue(element.getText().contains(brand));

            }
        }else{
            for (WebElement element : itemTitles) {
                Assert.assertTrue(element.getText().contains(brand));

            }


        }
    }

    @When("Choose {string} in the Mövcuddur checkbox")
    public void chooseInTheMovcuddurCheckbox(String Mövcuddur) throws InterruptedException {
   WebElement container = getElement(By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[4]/div"));
   List<WebElement> productList = container.findElements(By.tagName("label"));
        for (WebElement inputElement : productList) {
            if (inputElement.getText().equalsIgnoreCase(Mövcuddur)) {
                javascriptExecutor(inputElement);
                break;
            }
        }
        Thread.sleep(10000);

    }

    @Then("Items should be ordered according to the {string} checkbox")
    public void itemsShouldBeOrderedAccordingToTheCheckbox(String Movcuddur) {
        List<WebElement> itemTitles = getElements(basePom.getItems());
        if (Movcuddur.equalsIgnoreCase("Yalnız Onlayn")){
            for (WebElement element : itemTitles) {
                WebElement element1 =  element.findElement(By.xpath("//div[@class ='product__label'][1]"));
                System.out.println(element1 + "aaaa" +  Movcuddur);
                Assert.assertTrue(element1.getText().contains(Movcuddur));

            }
        }



        }

    @Then("Chatbox achildimi")
    public void chatboxAchildimi() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.id("jcont")).isDisplayed());
    }


    @When("Chatbox bagla")
    public void chatboxBagla() throws InterruptedException {
        Thread.sleep(10000);
        driver.findElement(By.className("slidedown-button")).click();
        driver.findElement(By.className("closeButton_f465")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("closeButton_f465")).click();
        Thread.sleep(1000);
    }

    @Then("Chatbox baglidir")
    public void chatboxBaglandimi() throws InterruptedException {
        Thread.sleep(1000);
        String expectedText = "Bizə mesaj göndərin";
        String expectedText1 = "Online konsultant";
        String actualText = driver.findElement(By.className("text_ddc5")).getText();
        Boolean actual = false;
        if( actualText.equalsIgnoreCase(expectedText1) || actualText.equalsIgnoreCase(expectedText)){
                   actual = true;
        }

        Assert.assertTrue(actual);

    }
}













