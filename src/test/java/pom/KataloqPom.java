package pom;

import org.openqa.selenium.By;

public class KataloqPom {
    private static KataloqPom INSTANCE;
    private KataloqPom() {

    }
    public static KataloqPom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new KataloqPom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }


    public By getKataloqButton() {return kataloqButton;}
    public By getKataloqDropDownMenu() {return kataloqDropDownMenu;}
    public By getKataloqElementsDropDownMenu() {return kataloqElementsDropDownMenu;}
    public By getYalnızOnlaynMehsullarTitle() {return yalnızOnlaynMehsullarTitle;}
    public By getPageTitle() {return pageTitle;}
    private final By kataloqButton = By.className("burger-menu");
    private final By kataloqDropDownMenu = By.className("menu");
    private final By kataloqElementsDropDownMenu =By.className("menu__item__sub");
    private final By yalnızOnlaynMehsullarTitle = By.className("campaigns-inner__body");
    private final By pageTitle = By.xpath("//*[@id ='ProductList']//div//h1");



}
