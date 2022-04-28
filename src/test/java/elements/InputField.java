package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class InputField {

    String placeholder;
    String inputXpath = "//input[@placeholder='%s']";

    public InputField(String placeholder) {
        this.placeholder = placeholder;
    }

    public void inputText(String text) {
        inputXpath = String.format(inputXpath, placeholder);
        SelenideElement textArea = $(By.xpath(inputXpath));
        textArea.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        textArea.sendKeys(text);
    }
}
