package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day07ReRun_Page;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class Day07_ReRun_StepDef {
    Day07ReRun_Page page=new Day07ReRun_Page();


    @When("arama butonuna basar")
    public void aramaButonunaBasar() {
        ReusableMethods.waitForVisibility(page.kabulEt,10);
        page.kabulEt.click();
        ReusableMethods.waitForVisibility(page.reklamKapat,10);
        page.reklamKapat.click();
        ReusableMethods.wait(1);
        page.aramaButonu.click();

    }

    @And("arama kutusuna {string} yazar")
    public void aramaKutusunaYazar(String arg0) {
        ReusableMethods.wait(2);
        page.aramaKutusu.sendKeys(arg0, Keys.ENTER);

    }

    @Then("sonuçlar {string} oldugunu dogrular")
    public void sonuclarOldugunuDogrular(String arg0) {
        ReusableMethods.waitForVisibility(page.aramaSonucu,10);
        String actualTitle = page.aramaSonucu.getText().trim().toLowerCase();
        Assert.assertTrue(actualTitle.contains(arg0), "verify the title matches with the entered query");


    }
}
