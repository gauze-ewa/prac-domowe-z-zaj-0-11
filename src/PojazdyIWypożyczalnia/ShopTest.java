package PojazdyIWypożyczalnia;

public class ShopTest {
    public static void main(String[] args)
    {
        Vehicle car1 = new Car("Audi", 2017, "prosto", 5);
        Vehicle car2 = new Car("BMW", 2010, "prosto", 4);
        Vehicle motorbike1 = new MotorBike("Suzuki", 1992, "prosto", 180);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(motorbike1.toString());
        car1.goBack();
        car1.turnRight();
        motorbike1.turnLeft();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(motorbike1.toString());
        Person person1 = new Person("Ania", "Kowalska", "A14", true);
        RentableCar rentableCar1 = new RentableCar((Car)car1, person1);
        RentableCar rentableCar2 = new RentableCar((Car)car2, person1);
        System.out.println("Samochód jest wypożyczony:"+rentableCar1.isRent());
        System.out.println(rentableCar1.rent(person1));
        System.out.println("Samochód jest wypożyczony:"+rentableCar1.isRent());
        System.out.println(rentableCar1.handOver());
        System.out.println("Samochód jest wypożyczony:"+rentableCar1.isRent());

    }
}
