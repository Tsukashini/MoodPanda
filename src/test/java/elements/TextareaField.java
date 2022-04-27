package elements;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;


public class TextareaField {


    String placeholder;
    String textareaXpath = "//textarea[@placeholder=\"%s\"]";

    public TextareaField(String placeholder) {
        this.placeholder = placeholder;
    }

    public void inputText(String text) {
        textareaXpath = String.format(textareaXpath, placeholder);
        SelenideElement textArea = $(By.xpath(textareaXpath));
        textArea.sendKeys(Keys.CONTROL + "A", Keys.DELETE);
        textArea.sendKeys(text);
    }
}
