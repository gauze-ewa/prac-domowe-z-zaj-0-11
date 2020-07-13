package PojazdyIWypożyczalnia;

public class Car extends Vehicle{
    private int seatNum;

    public Car(String name, int year, String direction, int seatNum) {
        super(name, year, direction);
        this.seatNum = seatNum;
    }

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    @Override
    public String toString() {
        return super.toString()+". Samaochód ma liczbę siedzień= " + seatNum;
    }
}
