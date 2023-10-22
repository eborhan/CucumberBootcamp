package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mini_bootcamp_cucumber.pages.Day06Excel_Page;
import mini_bootcamp_cucumber.utilities.Driver;
import mini_bootcamp_cucumber.utilities.ExcelUtils;
import mini_bootcamp_cucumber.utilities.ReusableMethods;
import org.testng.Assert;

public class Day06Excel_StepDef {
    Day06Excel_Page page = new Day06Excel_Page();
    String firstUrl = "";

    @Then("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login oldugu dogrulanir")
    public void kullanici_exceldeki_sayfasindaki_kullanici_bilgileri_ile_login_olur(String string) {
        firstUrl = Driver.getDriver().getCurrentUrl();
        ExcelUtils excelUtils = new ExcelUtils("src/test/resources/userData.xlsx", string);

        for (int i = 1; i <= excelUtils.rowCount(); i++) {
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            page.email.sendKeys(email);
            ReusableMethods.wait(2);
            page.password.sendKeys(password);
            ReusableMethods.wait(2);
            page.submit.click();

            ReusableMethods.waitForVisibility(page.addContact, 15);
            String secondUrl = Driver.getDriver().getCurrentUrl();
            System.out.println("firstUrl = " + firstUrl);
            System.out.println("secondUrl = " + secondUrl);
            Assert.assertFalse(firstUrl.equals(secondUrl));
            Assert.assertTrue(page.addContact.isDisplayed());
            page.logout.click();

        }
    }


    @Then("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olamadigini dogrular")
    public void kullaniciExceldekiSayfasindakiKullaniciBilgileriIleLoginOlamadiginiDogrular(String string) {

        ExcelUtils excellUtils = new ExcelUtils("src/test/resources/userData.xlsx", string);
        String email = excellUtils.getCellData(1, 0);
        String password = excellUtils.getCellData(1, 1);
        page.email.sendKeys(email);
        ReusableMethods.wait(2);
        page.password.sendKeys(password);
        ReusableMethods.wait(2);
        page.submit.click();
        Assert.assertTrue(page.error.isDisplayed());

    }
}
