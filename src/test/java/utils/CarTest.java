package utils;

import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Log4j2
public class CarTest {

    @Test (enabled = false)
    public void carTest() {
        Car car1 = CarFactory.get();
        Car car2 = CarFactory.get();
        log.fatal("fatal");
        log.error("error");
        log.warn("warn");
        log.info("info");
        log.debug("debug");
        log.trace("trace");

        assertEquals(car1, car2);
    }
}

//        Car car1 = Car.builder()
//                .make("BMW")
//                .model("i8")
//                .maxspeed(360)
//                .build();
//
//        Car car2 = Car.builder()
//                .make("BMW")
//                .model("i8")
//                .maxspeed(360)
//                .build();

