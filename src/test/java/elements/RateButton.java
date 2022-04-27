package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RateButton {

    String buttonXpath = "//div[@class='buttons hdas-addons is-hidden-touch']/button[text()=' %s ']";


    public void rateButtonClick(String buttonText) {
        buttonXpath = String.format(buttonXpath, buttonText);
        $(By.xpath(buttonXpath)).click();
    }
}
