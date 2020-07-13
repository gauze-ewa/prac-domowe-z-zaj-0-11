package creatingClassObject;

public class Bed {
    private double widht;
    private double height;
    private double lenght;
    private String kind;

    public Bed(double widht, double height, double lenght, String kind) {
        this.widht = widht;
        this.height = height;
        this.lenght = lenght;
        this.kind = kind;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void printInfo() {
        System.out.println("Lóżko: rodzaj: " + kind + ", długość: " + lenght +
                "cm, szerokość: " + widht + "cm, wysokość: " + height + "cm.");
    }
}
