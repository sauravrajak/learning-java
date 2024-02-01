/**
 * toString
 * <p>
 * special method that all objects inherit,
 * <p>
 * that returns a string that "textually represents" an object.
 * <p>
 * can be used both implicitly and explicitly
 */


public class ToSTRING {
    public static void main(String[] args) {

        // instantiating an object of Car Class
        Car car = new Car();
        // accessing the properties of car object
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        // address of car object in memory
        System.out.println(car);

        // address of car object in memory
        System.out.println(car.toString());

    }
}
