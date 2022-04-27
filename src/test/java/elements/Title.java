package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Title {


    String titleXpath = "//p[text()='%s']";

    public SelenideElement setTitle(String titleText) {
        titleXpath = String.format(titleXpath, titleText);
       return $(By.xpath(titleXpath));
    }
}
