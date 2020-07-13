package barman;

public class Drink {
    private String nameDrtnk;
    private double price;
    private boolean isAlcohol;

    public Drink(String nameDrtnk, double price, boolean isAlcohol) {
        this.nameDrtnk = nameDrtnk;
        this.price = price;
        this.isAlcohol = isAlcohol;
    }

    public String getNameDrtnk() {
        return nameDrtnk;
    }

    public void setNameDrtnk(String nameDrtnk) {
        this.nameDrtnk = nameDrtnk;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAlcohol() {
        return isAlcohol;
    }

    public void setAlcohol(boolean alcohol) {
        isAlcohol = alcohol;
    }
}
