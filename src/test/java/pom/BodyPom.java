package pom;

import org.openqa.selenium.By;

public class BodyPom {
    private static BodyPom INSTANCE;
    private BodyPom() {

    }
    public static BodyPom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BodyPom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }
    public By getAylıqOdənisButton() {
        return aylıqOdənisButton;
    }

    private final By aylıqOdənisButton = By.cssSelector(".calculator_popup.header__tools__item.header__tools__item--credit.btn.btn-green-transparent");


}
