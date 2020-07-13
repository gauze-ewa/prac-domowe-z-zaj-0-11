package PojazdyIWypożyczalnia;

public class Person {
    private String firstName;
    private String lastName;
    private String id;
    private boolean carRent;

    public Person(String firstName, String lastName, String id, boolean carRent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.carRent = carRent;
    }

    public boolean isCarRent() {
        return carRent;
    }

    public void setCarRent(boolean carRent) {
        this.carRent = carRent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
