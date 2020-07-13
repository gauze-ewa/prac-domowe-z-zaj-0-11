package specialOffer;

public class testShop {
    public static void main(String[] args)
    {
        Category category1 = new Category("Czekolady", "Niebo w gębie");
        Product product1 = new Product("Milka", 3.99, "Mleczna czekolada");
        Product product2 = new Product("Czekolada Studencak", 9.99, "Mleczna z śliwką");
        Product product3 = new Product("Alpejska", 2.20, "Gorzka z migdałami");

        SpecialOffer specialOffer1 = new SpecialOffer(product1, " SUPER OFERTA! ", 20, 0.2);
        product1.getInfo();
        product2.getInfo();
        product3.getInfo();
        specialOffer1.getInfo();
    }
}
