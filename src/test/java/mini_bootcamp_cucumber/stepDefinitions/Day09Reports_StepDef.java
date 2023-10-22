package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day09Reports_Page;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.testng.Assert;

public class Day09Reports_StepDef {
    Day09Reports_Page page= new Day09Reports_Page();

    @When("cerez kapatilir")
    public void cerez_kapatilir() {
        ReusableMethods.waitForVisibility(page.cerez, 10);
        page.cerez.click();
    }
    @Then("sayfada olundugu dogrulanir")
    public void sayfada_olundugu_dogrulanir() {
        String expectedTitle= "Getir - Dakikalar İçinde Kapınızda";
        String actualTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
