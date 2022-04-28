package testdata;

import models.ProfileModel;
import utilitis.FakerMessage;

public class GetNewProfileData {

    public static ProfileModel getProfileModelWhithAllParams() {
        return ProfileModel
                .builder()
                .name(FakerMessage.getName())
                .initial(FakerMessage.getInitial())
                .biography(FakerMessage.getBiography())
                .build();
    }
}
