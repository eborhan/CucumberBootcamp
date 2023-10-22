package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day07ReRun_Page {

    public Day07ReRun_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@id='myGlobalSearchBtn']")
    public WebElement aramaButonu;
    @FindBy(xpath = "//span[@id='userToAcceptButton']")
    public WebElement kabulEt;

    @FindBy(xpath = "//div[@id='taboola-video-reel-close-slider']")
    public WebElement reklamKapat;
    @FindBy(xpath = "//input[@id='myGlobalSearchInput']")
    public WebElement aramaKutusu;
    @FindBy(css = ".h-title")
    public WebElement aramaSonucu;
}

