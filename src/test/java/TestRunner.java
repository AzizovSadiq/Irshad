import io.cucumber.java.zh_tw.假設;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.List;

@CucumberOptions(
        features = "classpath:features",
        tags = "@chat" ,
        //tags = "@MovcuddurCheckBox or @discount or @deleteItem",
        plugin =  {"pretty" , "html:target/cucumber-reports/report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests  {
   @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
    @BeforeClass
    public void beforeClass(){System.out.println("TEST BASLADI");}

    @AfterClass
    public void afterClass(){
        System.out.println("TEST BITDI");
//        File reportOutputDirectory = new File("target");
//        List<String>jsonFiles = new ArrayList<>();
//        jsonFiles.add("target/cucumber.json");
//        Configuration configuration = new Configuration( reportOutputDirectory , "Irshad-Project");


    }



}
