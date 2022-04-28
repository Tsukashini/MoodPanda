package elements;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Link {


    String linkXpath = "//a[text()='%s']";



    public void clicklink(String linkText) {
        linkXpath = String.format(linkXpath, linkText);
        $(By.xpath(linkXpath)).click();
    }
}
