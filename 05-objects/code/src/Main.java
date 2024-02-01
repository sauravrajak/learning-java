

public  class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Tesla");

        Bycycle bycycle = new Bycycle("Atlas");

        garage.Park(car);
        garage.Park(car2);
        garage.TwoWheelerPark(bycycle);
    }
}