package pages;

import com.codeborne.selenide.SelenideElement;
import elements.Button;
import elements.InputField;
import elements.TextareaField;
import models.ProfileModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import testdata.GetNewProfileData;
import utilitis.FakerMessage;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {


    private SelenideElement editProfileLink = $(By.xpath("//div[@class='content-pane nav-bar-spacer']//aside/ul[@class='menu-list']/li[contains(., 'Edit profile ')]"));


    private SelenideElement successfulMessage = $(By.xpath("//div[contains(@class,'notification is-full-width-toast is-')]"));


    //div[text()='Update failed']
    //div[text()='Your identity was updated']
    //div[text()='Your biography was updated']


    public void goToEditProfile() {
        editProfileLink.click();
    }

    public void editNames(ProfileModel profileModel) {

        new InputField("e.g Jake").inputText(profileModel.getName());
        new InputField("e.g. S").inputText(profileModel.getInitial());
        new Button().buttonClick(" Save identity ");
    }

    public void editBiography(ProfileModel profileModel) {
        new TextareaField("Optional short paragraph about yourself, displayed on your profile/diary").inputText(profileModel.getBiography());
        new Button().buttonClick(" Save biography ");
    }

    public boolean isSuccessful() {
        return successfulMessage.isEnabled();
    }
}
