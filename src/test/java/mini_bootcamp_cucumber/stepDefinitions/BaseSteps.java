package mini_bootcamp_cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import mini_bootcamp_cucumber.utilities.ConfigurationReader;
import mini_bootcamp_cucumber.utilities.Driver;

public class BaseSteps {
    @Given("{string} sitesine gidilir")
    public void sitesine_gidilir(String string) {
        switch (string) {
            case "cicek sepeti":
                Driver.getDriver().get(ConfigurationReader.getProperty("ciceksepeti"));
                break;
            case "mynet":
                Driver.getDriver().get(ConfigurationReader.getProperty("mynet"));
                break;
            case "trendyol":
                Driver.getDriver().get(ConfigurationReader.getProperty("trendyol"));
                break;
            case "boyner":
                Driver.getDriver().get(ConfigurationReader.getProperty("boyner"));
                break;
            case "madame coco":
                Driver.getDriver().get(ConfigurationReader.getProperty("madameCoco"));
                break;
            case "ets tur":
                Driver.getDriver().get(ConfigurationReader.getProperty("etstur"));
                break;
            case "herokuapp":
                Driver.getDriver().get(ConfigurationReader.getProperty("herokuapp"));
                break;
            case "pazarama":
                Driver.getDriver().get(ConfigurationReader.getProperty("pazarama"));
                break;
            case "getir":
                Driver.getDriver().get(ConfigurationReader.getProperty("getir"));
                break;
            case "teknosa":
                Driver.getDriver().get(ConfigurationReader.getProperty("teknosa"));
                break;
            default:
                break;
        }
    }
}
