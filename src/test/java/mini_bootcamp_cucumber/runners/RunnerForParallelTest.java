package mini_bootcamp_cucumber.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",  //plugin ekledikten sonra bunu cucumber report için ekle
                "junit:test-output/htmlReport/cucumber1.xml", //xml report için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:FILE", //pdf spark report icin
                "rerun:target/failedScenarios.txt" // bu satirdaki kod kosulan testlerden hata verenlerin yeniden ReRunner classi tarafindan kosulmasini saglar
        },
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"mini_bootcamp_cucumber/stepDefinitions", "mini_bootcamp_cucumber/hooks"},
        tags = "@paralel",
        dryRun = false
)

public class RunnerForParallelTest {

}
// iki ayrı runner için iki ayrı test yazılır ve terminalden mvn clean verify yazılır
