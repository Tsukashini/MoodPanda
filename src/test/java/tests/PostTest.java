package tests;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PostUpdatePage;
import testdata.GetLoginModel;
import testdata.GetNewPostData;

public class PostTest extends BaseTest{

    @Test (description = "Test check adding a post")
    public void postTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.sendLoginDataModel(GetLoginModel.getLoginModelWhithAllParams());
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2, "Quantity of titles isn't expected");
        mainPage.goToPostUpdatePage();
        PostUpdatePage postUpdatePage = new PostUpdatePage();
        Assert.assertTrue(postUpdatePage.getTitleQuantity());
        postUpdatePage.editPost(GetNewPostData.getPostData());
        Assert.assertTrue(postUpdatePage.isPostUpdate());
        System.out.println("sfg");
    }
}
