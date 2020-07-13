package specialOffer;

public class Category {
    private String nameCategory;
    private String descriptionCategory;

    public Category( String nameCategory, String descriptionCategory) {
        this.nameCategory = nameCategory;
        this.descriptionCategory = descriptionCategory;
    }
    void getInfo() {
        System.out.println("Nazwa kategorii produktu: " + nameCategory+
                ", opis kategorii produktu: " + descriptionCategory+ ".");
    }
}
