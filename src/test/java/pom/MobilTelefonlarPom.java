package pom;

import org.openqa.selenium.By;

public class MobilTelefonlarPom {
    private static MobilTelefonlarPom INSTANCE;
    private MobilTelefonlarPom() {

    }
    public static MobilTelefonlarPom getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MobilTelefonlarPom();
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }


    public By getMobilTelefonlarButton() {return mobilTelefonlarButton;}
    private final By mobilTelefonlarButton = By.xpath("//*[@class='content']//a[@aria-label='Mobil telefonlar']");


}
