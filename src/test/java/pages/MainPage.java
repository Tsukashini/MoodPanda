package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class MainPage {

    private ElementsCollection globalFeedTitle = $$(By.xpath("//p[text()='Global feed']"));
    private SelenideElement dashboardMenu = $(By.xpath("//a[text()=' Your dashboard ']"));
    private SelenideElement postUpdateLink = $(By.xpath("//a[text()='Post update']"));
    private SelenideElement logoutLink = $(By.partialLinkText("Logout "));

    public int getTitleQuantity() {
        globalFeedTitle.get(1).shouldBe(visible);
        return globalFeedTitle.size();
    }

    public void goToProfilePage() {
        dashboardMenu.click();
    }

    public void goToPostUpdatePage() {
        postUpdateLink.click();
    }

    public void logout() {
        logoutLink.click();
    }
}