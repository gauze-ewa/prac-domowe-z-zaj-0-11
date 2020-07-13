package PojazdyIWypożyczalnia;

public class RentableCar  implements Rentable{
    private Person person;
    private Car car;

    public RentableCar(Car car,Person person) {
        this.car=car;
        this.person = person;
    }

    @Override
    public String rent(Person person) {
        person.setCarRent(true);
        return "Samochód wypożyczono: "+person.getFirstName()+" "+person.getLastName()+
                ", z id: "+person.getId();
    }

    @Override
    public String handOver() {
        person.setCarRent(false);
        return "Samochód nie jest wypożyczony";
    }

    @Override
    public boolean isRent() {
        if(person.isCarRent()==true)
        return true;
        else return false;
    }
}
