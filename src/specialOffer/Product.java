package specialOffer;

import classMathTask.Calculator;

public class Product {
    private String nameProduct;
    private double price;
    private String descriptionProduct;
    private Category category;

    public Product(String nameProduct, double price, String descriptionProduct) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.descriptionProduct = descriptionProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    void getInfo() {
        System.out.println("Nazwa produktu: " + nameProduct+", kategoria produktu: " + category +
                ", opis produktu: " + descriptionProduct + ", cena: " + price + "zł.");
    }
}
