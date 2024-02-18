package pom;

import org.openqa.selenium.By;

public class BasePom {
    private static BasePom INSTANCE;
    private BasePom() {

    }

    public static BasePom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BasePom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }

    public By getFromToPriceCheckbox() {return fromToPriceCheckbox;}
    public By getStartPriceInput() {return startPriceInput;}
    public By getEndPriceInput() {return endPriceInput;}


    private final By fromToPriceCheckbox = By.xpath("//div[@class='products__filter__item__price']");
    private final By startPriceInput = By.xpath("//div[@class='products__filter__item__price']//input[1]");
    private final By endPriceInput = By.xpath("//div[@class='products__filter__item__price']//input[2]");
    public By getBrandContainer() {return brandContainer;}
    public By getNewPriceProduct() {return newPriceProduct;}
    public By getItems() {return items;}
    public By getBrandContainerElements() {return brandContainerElements;}
    public By getItemName() {return itemName;}
    public By getEndrimdeOlanButton() {return endrimdeOlanButton;}
    public By getOldPrice() {return oldPrice;}
    public By getSebeteElaveEtButtons() {return sebeteElaveEtButtons;}
    public By getCloseSebetPopUp() {return closeSebetPopUp;}
    public By getSebetButton() {return sebetButton;}
    public By getDeleteItemButton() {return deleteItemButton;}
    public By getBeyendimButtonAboveItem() {return beyendimButtonAboveItem;}
    public By getBeyendimButton() {return beyendimButton;}
    public By getPageContainer() {return pageContainer;}

    private final By items = By.cssSelector(".product.first");
    private final By newPriceProduct = By.cssSelector(".new-price");
    private final By brandContainer = By.xpath("//*[@id='ProductList']/div/div/div[1]/form/fieldset[3]/div");
    private final By brandContainerElements = By.tagName("label");
    private final By itemName = By.className("product__name");
    private final By endrimdeOlanButton = By.xpath("//*[@id=\"ProductList\"]/div/div/div[2]/div[1]/div[2]/label");
    private final By oldPrice = By.className("old-price");
    private final By sebeteElaveEtButtons = By.className("product__to-cart");
    private final By closeSebetPopUp = By.xpath("//*[@id=\"AccountBasketAjaxModal\"]/div/div[1]/a");
    private final By sebetButton = By.id("AccountBasketAjax");
    private final By deleteItemButton = (By.cssSelector(".basket__content__item__delete"));
    private final By beyendimButtonAboveItem = By.className("to-wishlist");
    private final By beyendimButton = By.xpath("/html/body/header/div[2]/div[3]/a[2]");
    private final By pageContainer = By.className("container_fluid");



}


