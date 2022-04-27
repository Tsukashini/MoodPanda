package testdata;

import models.LoginModel;
import staticdata.Secret;

public class GetLoginModel {

    public static LoginModel getLoginModelWhithAllParams() {
        return LoginModel
                .builder()
                .email(Secret.EMAIL)
                .password(Secret.PASSWORD)
                .build();
    }
}
