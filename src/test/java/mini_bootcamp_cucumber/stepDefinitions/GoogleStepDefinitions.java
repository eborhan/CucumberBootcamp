package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import mini_bootcamp_cucumber.pages.GooglePage;

public class GoogleStepDefinitions {

    GooglePage googlePage = new GooglePage();

    @Given("Kullanici Googlea gider")
    public void kullanici_googlea_gider() {
       Driver.getDriver().get(ConfigurationReader.getProperty("google_url"));
    }
    @When("Togg icin arama yapar")
    public void togg_icin_arama_yapar() {
        googlePage.searchBox.sendKeys("togg", Keys.ENTER);
    }
    @Then("Sonuclarda togg oldugunu dogrular")
    public void sonuclarda_togg_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("togg"));
    }
    @And("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
