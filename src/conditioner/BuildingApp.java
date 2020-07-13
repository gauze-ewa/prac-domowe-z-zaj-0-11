package conditioner;

public class BuildingApp {
    public static void main(String[] args) {
        System.out.println("Witaj w biurze!");
        Conditioners conditioners1=new Conditioners(1,25.5,18);
        Conditioners conditioners2=new Conditioners(2,16.5,18);
        conditioners1.printInfo();
        conditioners2.printInfo();
        conditioners1.BasicAirConditioner();
        conditioners1.ProAirConditioner();
        conditioners1.ProAirConditioner();
        conditioners1.ProAirConditioner();
        conditioners1.ProAirConditioner();
        conditioners1.printInfo();
        conditioners2.ProAirConditioner();
        conditioners2.printInfo();
    }
}
