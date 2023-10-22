package mini_bootcamp_cucumber.pages;

import mini_bootcamp_cucumber.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day01_Background_Page {

    public Day01_Background_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='dropbtn nothidden']")
    public WebElement login;

    @FindBy(xpath = "//button[@data-target='#modalSignIn']")
    public WebElement giris;

    @FindBy(xpath = "//input[@id='tb-contactEmailSignIn']")
    public WebElement eMailBox;

    @FindBy(xpath = "//input[@name='loginPassword']")
    public WebElement sifreBox;

    @FindBy(xpath = "//button[@id='btn-signin']")
    public WebElement girisButton;

    @FindBy(xpath = "//button[@data-target='#modalSignUp']")
    public WebElement uyeOl;

    @FindBy(xpath = "//input[@id='tb-signUp-firstName']")
    public WebElement adInputBox;

    @FindBy(xpath = "//input[@id='tb-signUp-lastName']")
    public WebElement soyadInputBox;

    @FindBy(xpath = "//input[@id='tb-contactEmailSignUp']")
    public WebElement emailInputBox;

    @FindBy(xpath = "//input[@id='contactFormPhoneNumber']")
    public WebElement telefonInputBox;

    @FindBy(id = "showPass_0")
    public WebElement sifreInputBox;

    @FindBy(id = "showPass_1")
    public WebElement sifreTekrarInputBox;

    @FindBy(xpath = "//a[@class='agreement-usage']/preceding-sibling::span[@class='span-for-checkbox']")
    public WebElement kampanyaCheckbox1;

    @FindBy(xpath = "//label[@for='cb-dealCampaign']")
    public WebElement kampanyaCheckbox2;

    @FindBy(xpath = "//button[@id='btn-signup']")
    public WebElement uyelikButton;


}
