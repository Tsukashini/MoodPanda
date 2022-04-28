package pages;


import elements.*;
import models.PostModel;

public class PostUpdatePage {


    public boolean getTitleQuantity() {
        return new Title().setTitle("How are you?").isDisplayed();
    }

    public void editPost(PostModel postModel) {
        new TextareaField("We've made this mandatory so that your posts hold meaningful memories").inputText(postModel.getAbout());
        new RateButton().rateButtonClick(postModel.getRate());
        new Link().clicklink(" Update to ".concat(postModel.getRate()));
    }

    public void cancelUpdates() {
        new Link().clicklink(" Cancel ");
    }


    public boolean isPostUpdate() {
        return new Title().setTitle("Mood updated").isDisplayed();
    }
}
