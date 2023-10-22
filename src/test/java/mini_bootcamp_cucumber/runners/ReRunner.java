package mini_bootcamp_cucumber.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
        },
        monochrome = true,//raporlarin consoleda okunakli sekilde cikmasi icin
        glue = {"mini_bootcamp_cucumber/stepDefinitions","hooks"}, //stepdefinitions path
        features = "@target/failedScenarios.txt",//hata veren dosyalarin yolu
        dryRun = false
)

public class ReRunner {

}
