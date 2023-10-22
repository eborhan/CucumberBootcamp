package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day04DataTable_Page;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.testng.Assert;

import java.util.List;

public class Day04DataTable_StepDef {

    Day04DataTable_Page page = new Day04DataTable_Page();


    @When("dogum gunu linki tiklanir")
    public void dogum_gunu_linki_tiklanir() {


        page.hediye.click();
        ReusableMethods.wait(2);

        page.kabulEt.click();
        ReusableMethods.wait(2);

        page.dogumGunu.click();

        //ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.header__bottom.js-header-bottom.switcher-active > div.container.container--main-menu.js-navigasyon-container > div.responsive-menu.js-responsive-menu > nav > ul > li:nth-child(11) > span > a\")");

        page.izinVer.click();
    }

    @Then("dogum gunu sayfasinda oldugu dogrulanir")
    public void dogum_gunu_sayfasinda_oldugu_dogrulanir() {
        String expectedUrl = "https://www.ciceksepeti.com/dogum-gunu-hediyeleri";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    @When("renk drop down tiklanir")
    public void renk_drop_down_tiklanir() {

        page.renk.click();

    }

    @Then("sirasiyla renklerin secildigi dogrulanir")
    public void sirasiyla_renklerin_secildigi_dogrulanir(DataTable dataTable) {

        List<String> bilgiler = dataTable.asList();

        for (int i = 1; i < bilgiler.size(); i++) {
            switch (bilgiler.get(i)) {
                case "bej":
                    page.bej.click();
                    Assert.assertTrue(page.bej.isSelected(), "verify bej is selected");
                    ReusableMethods.wait(2);
                    break;
                case "beyaz":
                    page.beyaz.click();
                    Assert.assertTrue(page.beyaz.isSelected(), "verify beyaz is selected");
                    ReusableMethods.wait(2);
                    break;
                case "çok renkli":
                    page.cokRenkli.click();
                    Assert.assertTrue(page.cokRenkli.isSelected(), "verify cok renkli is selected");
                    ReusableMethods.wait(2);
                    break;
                case "gri":
                    page.gri.click();
                    Assert.assertTrue(page.gri.isSelected(), "verify gri is selected");
                    ReusableMethods.wait(2);
                    break;
                default:
                    break;
            }
            Driver.getDriver().navigate().refresh();
            ReusableMethods.wait(2);
            page.renk.click();
        }
    }
}
