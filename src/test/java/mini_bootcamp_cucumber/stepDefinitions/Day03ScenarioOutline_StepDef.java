package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day03ScenarioOutline_Pages;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Day03ScenarioOutline_StepDef {
    Day03ScenarioOutline_Pages page = new Day03ScenarioOutline_Pages();

    @Given("boyner sitesine gidilir")
    public void boynerSitesineGidilir() {
        Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
    }

    @When("login ikonu ustune gidilir")
    public void loginIkonuUstuneGidilir() {
        //page.cookies.click();
        //ReusableMethods.wait(2);
        ReusableMethods.hover(page.login);


    }

    @And("uye ol linki tiklanir")
    public void uyeOlLinkiTiklanir() {
        page.uyeOl.click();

    }

    @Then("uyelik sayfasinda oldugu dogrulanir")
    public void uyelikSayfasindaOlduguDogrulanir() {
        //String expectedText= "Boyner dünyasına hoş geldin";
        Assert.assertTrue(page.sayfaTitle.isDisplayed());
        // assertTrue(page.sayfaTitle.getText().contains(expectedText));
    }


    @And("uyelik sayfasinda ad bolumune {string} girilir")
    public void uyelikSayfasindaAdBolumuneGirilir(String arg0) {

        page.ad.sendKeys(arg0);
    }

    @And("uyelik sayfasinda email bolumune{string} girilir")
    public void uyelikSayfasindaEmailBolumuneGirilir(String arg0) {
        page.email.sendKeys(arg0);
    }

    @And("uyelik sayfasinda sifre bolumune{string} girilir")
    public void uyelikSayfasindaSifreBolumuneGirilir(String arg0) {

        ReusableMethods.flash(page.sifre, Driver.getDriver());
        page.sifre.sendKeys(arg0);
    }

    @And("uyelik sayfasinda ceptelefonu bolumune{string} girilir")
    public void uyelikSayfasindaCeptelefonuBolumuneGirilir(String arg0) {
        ReusableMethods.flash(page.ceptelefonu, Driver.getDriver());
        page.ceptelefonu.sendKeys(arg0);
    }

    @And("uyelik sayfasinda uyelik metni checkboxa checkbox secilir")
    public void uyelikSayfasindaUyelikMetniCheckboxaCheckboxSecilir() {
        page.uyelikSozlesmesi.click();

    }

    @And("uyelik sayfasinda riza metni checkboxa checkbox secilir")
    public void uyelikSayfasindaRizaMetniCheckboxaCheckboxSecilir() {
        page.rizaMetni.click();
    }

    @And("uye ol butonu tiklanir")
    public void uyeOlButonuTiklanir() {
        page.uyeOlButon.click();
    }

    @Then("uye olunamadigi dogrulanir")
    public void uyeOlunamadigiDogrulanir() {
        String expectedUrl = "https://www.boyner.com.tr/uyelik?type=uye-ol";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);


    }

    @And("eposta kismina eposta girilir")
    public void epostaKisminaEpostaGirilir() {
        page.email.sendKeys("hakandenememail@gmail.com");

    }

    @And("sifre girilir")
    public void sifreGirilir() {
        page.sifre.sendKeys("123hakan.");
    }

    @And("giris yap butonu tiklanir")
    public void girisYapButonuTiklanir() {
       page.girisYapGiris.click();
    }

    @Then("giris yapildigi dogrulanir")
    public void girisYapildigiDogrulanir() {
        String expectedText = "HAKAN";
        String actualText = ReusableMethods.getTextWithJavaScriptXpath("//div[@class='user-cart-active_cartBox__UNYC4']/span").replace("[^HAKAN]", "");
        System.out.println("actualText = " + actualText);
        Assert.assertTrue(actualText.contains(expectedText));

    }

    @And("uyelik icin giris yap butonu tiklanir")
    public void uyelikIcinGirisYapButonuTiklanir() {
        page.girisYap.click();
    }
}
