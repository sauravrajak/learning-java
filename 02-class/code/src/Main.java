public class Main {
    public static void main(String[] args) {

        // creating instance of Car
        Car myCar = new Car();
        System.out.println(myCar.make);
        System.out.println(myCar.module);
        System.out.println(myCar.year);
        System.out.println(myCar.price);

        myCar.drive();

        myCar.brake();

    }
}