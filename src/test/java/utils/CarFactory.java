package utils;

import com.github.javafaker.Faker;

public class CarFactory {

    public static Car get() {
        Faker faker = new Faker();
        return Car.builder()
                .model("BMW")
                .make(faker.name().firstName() + " " + faker.name().lastName())
                .maxspeed(360)
                .build();
    }
}
