package carConditioner;

public class Shop {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Freightliner1", 44.8, 20.3,
                false, 200);
        Truck truck2 = new Truck("Freightliner2", 44.8, 20.3,
                true, 0);
        Truck truck3 = new Truck("Freightliner3", 44.8, 20.3,
                true, 200);

        truck1.printInfo(200);
        truck2.printInfo(200);
        truck3.printInfo(200);
        Car car1 = new Car("Audi1", 24.8, 20.3,
                false);
        Car car2 = new Car("Audi2", 24.8, 20.3,
                true);

        car1.printInfo(200);
        car2.printInfo(200);

    }
}
