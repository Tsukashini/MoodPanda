package testdata;

import models.PostModel;
import utilitis.FakerMessage;

public class GetNewPostData {

    public static PostModel getPostData() {
        return PostModel
                .builder()
                .about(FakerMessage.getBiography())
                .rate(FakerMessage.getRate())
                .build();
    }
}
