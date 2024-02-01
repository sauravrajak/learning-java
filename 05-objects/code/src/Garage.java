import org.w3c.dom.ls.LSOutput;

public class Garage {

    void Park(Car car) {

        System.out.println("The " + car.name + " is parked in the garage.");
    }

    void TwoWheelerPark(Bycycle bycycle) {
        System.out.println("The " + bycycle.name + " is parked in the twoWheelerParking Area.");
    }
}
