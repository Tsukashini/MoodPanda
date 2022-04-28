package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;
import testdata.GetLoginModel;
import testdata.GetNewProfileData;

public class EditProfileTest extends BaseTest {


    @Test (description = "Test check saving the changes in the profile name")
    public void editNamesTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.sendLoginDataModel(GetLoginModel.getLoginModelWhithAllParams());
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2, "Quantity of titles isn't expected");
        mainPage.goToProfilePage();
        ProfilePage profilePage = new ProfilePage();
        profilePage.goToEditProfile();
        profilePage.editNames(GetNewProfileData.getProfileModelWhithAllParams());
        Assert.assertTrue(profilePage.isSuccessful(), "Names updating unsuccessful");
    }

    @Test (description = "Test check saving the changes in the profile bio")
    public void editBiographyTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.openLoginPage();
        loginPage.sendLoginDataModel(GetLoginModel.getLoginModelWhithAllParams());
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.getTitleQuantity(), 2, "Quantity of titles isn't expected");
        mainPage.goToProfilePage();
        ProfilePage profilePage = new ProfilePage();
        profilePage.goToEditProfile();
        profilePage.editBiography(GetNewProfileData.getProfileModelWhithAllParams());
        Assert.assertTrue(profilePage.isSuccessful(), "Biography updating unsuccessful");
    }
}