package utils;

import lombok.*;

@Builder
@Data
//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
public class Car {
    String make;
    String model;
    int maxspeed;
}

//
//    public String getMake() {
//        return make;
//    }
//
//    public void setMake(String make) {
//        this.make = make;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public Car(String make, String model) {
//        this.make = make;
//        this.model = model;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(make, car.make) && Objects.equals(model, car.model);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(make, model);
//    }

