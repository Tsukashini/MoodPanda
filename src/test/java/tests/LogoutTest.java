package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import staticdata.WebUrls;
import testdata.GetLoginModel;

import static com.codeborne.selenide.Configuration.baseUrl;

public class LogoutTest extends BaseTest {

    @Test (description = "Test check logout from profile")
    public void logoutTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.sendLoginDataModel(GetLoginModel.getLoginModelWhithAllParams());
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2, "Quantity of titles isn't expected");
        mainPage.logout();
        Assert.assertEquals(WebDriverRunner.url(), baseUrl.concat(WebUrls.LOGIN_URL), "You are not logout");
    }
}
