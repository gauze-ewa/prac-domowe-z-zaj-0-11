package PojazdyIWypożyczalnia;

public abstract class Vehicle implements  Moveable{
    private String name;
    private int year;
    private String direction;

    public Vehicle(String name, int year, String direction) {
        this.name = name;
        this.year = year;
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Nazwa= " + name  +
                ", rocznik=" + year +
                ", kierunek=" + direction;
    }

    @Override
    public String turnLeft() {
        setDirection("lewo");
        return "lewo";
    }

    @Override
    public String turnRight() {
        setDirection("prawo");
        return "prawo";
    }

    @Override
    public String goBack() {
        setDirection("zawracanie");
        return "zawracanie";
    }

    @Override
    public String goForward() {
        setDirection("do przodu");
        return "do przodu";
    }
}
