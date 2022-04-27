package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Button {

    String buttonXpath = "//button[text()='%s']";


    public void buttonClick(String buttonText) {
        buttonXpath = String.format(buttonXpath, buttonText);
        $(By.xpath(buttonXpath)).click();
    }
}
