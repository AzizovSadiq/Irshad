package pom;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class HeaderPom {
    private static HeaderPom INSTANCE;
    private HeaderPom() {

    }
    public static HeaderPom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HeaderPom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }
    public By getLanguageButton () {
        return languageButton;
    }
    public By getUserProfile() {return userProfile;}
    public By getSecondLanguageButton() {return secondLanguageButton;}
    public By getGirisYazisi() {return girisYazisi;}


    private final By languageButton = By.className("header__top__list__item__selected");
    private final By secondLanguageButton = By.xpath("//ul[@class='langs']//li//a[@aria-label]");
    private final By secondLanguageButton2 = By.xpath("//ul[@class='langs']//li//a[@aria-label]");
    private final By userProfile = By.xpath("//div[@class='container-fluid']//ul[2]//li[3]");
    private final By girisYazisi = By.className("active");



}
