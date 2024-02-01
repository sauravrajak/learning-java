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
        // accessing the attributes  of car object
        // using overridden toString() methods
        try {
            System.out.println(car.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
