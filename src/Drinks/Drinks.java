package Drinks;

public class Drinks {
    private static final int MAX_NUMBER_INGREDINENT = 3;
    private int ingresinentNum = 0;
    private String nameDrtnk;
    private double price;
    private boolean isAlcohol;

    private Ingredinent[] ingredinents = new Ingredinent[MAX_NUMBER_INGREDINENT];


    public Drinks(String nameDrtnk, double price, boolean isAlcohol) {
        this.nameDrtnk = nameDrtnk;
        this.price = price;
        this.isAlcohol = isAlcohol;
    }

    public static int getMaxNumberIngredinent() {
        return MAX_NUMBER_INGREDINENT;
    }

    public int getIngresinentNum() {
        return ingresinentNum;
    }

    public void setIngresinentNum(int ingresinentNum) {
        this.ingresinentNum = ingresinentNum;
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

    public void addInteger(Ingredinent ingredinent) {
        if (ingresinentNum < MAX_NUMBER_INGREDINENT) {
            ingredinents[ingresinentNum] = ingredinent;
            ingresinentNum++;
        }
    }
        public void printInfo ()
        {
            String result = "Drink: " + nameDrtnk + ", cena: " + price + "zł, czy alkohol: "
                    + isAlcohol + ", skład:\n";
            for (int i = 0; i < ingresinentNum; i++) {
                result = result + ingredinents[i].getInfo();
            }
            System.out.println(result + "\n");
        }

}



