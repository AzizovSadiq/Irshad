package driverSession;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class CucucmberHook {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();


    @Before
    public void beforeScenario() {
        ChromeOptions options = new ChromeOptions();
        driver .set(new ChromeDriver(options));
        driver.get().get("https://irshad.az/");
    }

    @After
    public void afterScenario(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            Thread.sleep(300);
            final byte[] screenshot = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        driver.get().quit();
    }
}
