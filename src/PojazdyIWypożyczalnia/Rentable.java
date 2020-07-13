package PojazdyIWypożyczalnia;

public interface Rentable {

    String rent(Person person);
    String handOver();
    boolean isRent();

}
