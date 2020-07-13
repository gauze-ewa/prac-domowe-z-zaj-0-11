package specialOffer;

public class SpecialOffer {
    private Product product;
    private String descriptionOffer;
    private int timeOffer;
    private double discount;

    public SpecialOffer(Product product, String descriptionOffer, int timeOffer, double discount) {
        this.product = product;
        this.descriptionOffer = descriptionOffer;
        this.timeOffer = timeOffer;
        this.discount = discount;
    }

    void getInfo(){
        System.out.println("Nazwa produktu w promocji: "+product.getNameProduct()+", opis produktu: " +
                descriptionOffer +", czas promocji: "+timeOffer
                + ", wysokość zniżki: " + (discount*100) + "%.");
    }
}
