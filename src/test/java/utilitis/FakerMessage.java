package utilitis;

import com.github.javafaker.Faker;

public class FakerMessage {

    public static String getBiography() {
        Faker faker = new Faker();
        return faker.chuckNorris().fact();
    }

    public static String getName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String getInitial() {
        Faker faker = new Faker();
        return faker.letterify("?");
    }


    public static String getRate() {
        Faker faker = new Faker();
        return Long.toString(faker.number().numberBetween(0, 10));
    }
}
