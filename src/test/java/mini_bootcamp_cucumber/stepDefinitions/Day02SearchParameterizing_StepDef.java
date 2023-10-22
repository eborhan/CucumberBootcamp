package mini_bootcamp_cucumber.stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import mini_bootcamp_cucumber.pages.Day02SearchParameterizing_Page;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Day02SearchParameterizing_StepDef {
    Day02SearchParameterizing_Page page = new Day02SearchParameterizing_Page();
    Faker faker = new Faker();
    String product = "";


    @And("arama kutusuna vazo yazilir")
    public void arama_kutusuna_vazo_yazilir() {
        ReusableMethods.wait(3);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#ccp---nb > div.cc-nb-main-container > div.cc-nb-buttons-container > button.cc-nb-reject\")");
        ReusableMethods.wait(3);
        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#wis-lightbox-244800 > img\")");
        ReusableMethods.wait(2);
        page.miniReklam.click();
        try {
            page.searchBox.sendKeys("Vazo", Keys.ENTER);
        } catch (Exception e) {
        }

    }

    @Then("sonuclarda vazo oldugu dogrulanir")
    public void sonuclarda_vazo_oldugu_dogrulanir() {
        Assert.assertTrue(page.urunler.get(0).getText().contains("Vazo"));
    }

    @Given("ingilizce menu secilir")
    public void ingilizce_menu_secilir() {
//        ReusableMethods.wait(3);
//        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#ccp---nb > div.cc-nb-main-container > div.cc-nb-buttons-container > button.cc-nb-reject\")");
//       ReusableMethods.wait(3);
//        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"#wis-lightbox-244800 > img\")");
//        ReusableMethods.wait(3);
        // page.reklam.click();
        //  page.coocies.click();
        //page.miniReklam.click();

        ReusableMethods.clickJSElementWithJavaScript("document.querySelector(\"body > div.pz-body-w.index-wrapper > div.header-wrapper > div.header-band-top > div > div > div > form:nth-child(3) > button\")");
        //page.english.click();

    }

    @And("Arama kutusuna {string} yazilir")
    public void arama_kutusuna_yazilir(String string) {
        product = faker.commerce().productName();
        if (string.contains("<urun>")) {
            try {
                page.searchBox.sendKeys(product, Keys.ENTER);

            } catch (Exception e) {

            }
        }

    }

    @Then("sonuclarada {string} oldugu dogrulanir")
    public void sonuclarada_oldugu_dogrulanir(String string) {

        Assert.assertTrue(page.sonuc.getText().contains(product));

    }
}
