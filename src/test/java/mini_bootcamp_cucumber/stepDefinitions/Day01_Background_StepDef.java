package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day01_Background_Page;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.testng.Assert;

public class Day01_Background_StepDef {

    Day01_Background_Page page = new Day01_Background_Page();

    String expectedURL = Driver.getDriver().getCurrentUrl();

    @And("login butonu üstüne gidilir")
    public void login_butonu_üstüne_gidilir() {
        ReusableMethods.hover(page.login);
        ReusableMethods.wait(2);
    }

    @When("giris butonuna basılır")
    public void giris_butonuna_basılır() {
        page.giris.click();
    }

    @And("eposta girilir")
    public void eposta_girilir() {
        page.eMailBox.sendKeys("a@email.com");
    }

    @And("password girilir")
    public void password_girilir() {
        page.sifreBox.sendKeys("12345");
    }

    @And("giris yap butonuna basılır")
    public void giris_yap_butonuna_basılır() {
        page.girisButton.click();
    }

    @Then("sayfaya gidilemedi dogrulanır")
    public void sayfaya_gidilemedi_dogrulanır() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL, actualURL);
    }

    @And("uye ol butonuna basilir")
    public void uyeOlButonunaBasilir() {
        ReusableMethods.wait(2);
        page.uyeOl.click();

    }

    @And("ad girilir")
    public void adGirilir() {
        page.adInputBox.sendKeys("Ali");
    }

    @And("soyad girilir")
    public void soyadGirilir() {
        page.soyadInputBox.sendKeys("Veli");
    }

    @And("uyelik icin email girilir")
    public void uyelikIcinEmailGirilir() {
        page.emailInputBox.sendKeys("aliveli@mail.com");
    }

    @And("cep telefonu girilir")
    public void cepTelefonuGirilir() {
        page.telefonInputBox.sendKeys("123456789");
    }

    @And("uyelik icin sifre girilir")
    public void uyelikIcinSifreGirilir() {
        ReusableMethods.wait(2);
        page.sifreInputBox.sendKeys("12345");
    }

    @And("uyelik icin sifre yeniden girilir")
    public void uyelikIcinSifreYenidenGirilir() {
        ReusableMethods.wait(2);
        page.sifreTekrarInputBox.sendKeys("12345");
    }

    @And("kullanim sartlari checkbox secilir")
    public void kullanimSartlariCheckboxSecilir() {
        page.kampanyaCheckbox1.click();
    }

    @And("kampanya checkbox secilir")
    public void kampanyaCheckboxSecilir() {
        page.kampanyaCheckbox2.click();
    }

    @When("uyelik icin uye ol butonuna basilir")
    public void uyelikIcinUyeOlButonunaBasilir() {
        page.uyelikButton.click();

    }
}
