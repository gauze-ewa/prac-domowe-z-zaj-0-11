package Drinks;

public class Bar {
    public static void main(String[] args) {
        Ingredinent[] ingredinents=new Ingredinent[6];
        Ingredinent ingredinent1=new Ingredinent("wódka",50);
        Ingredinent ingredinent2=new Ingredinent("sprite",20);
        Ingredinent ingredinent3=new Ingredinent("lód",40);
        Ingredinent ingredinent4=new Ingredinent("rum",60);
        Ingredinent ingredinent5=new Ingredinent("syrop malinowy",70);
        Ingredinent ingredinent6=new Ingredinent("woda",60);
        Ingredinent ingredinent7=new Ingredinent("sok anansowy",45);
        Drinks drinks1=new Drinks("Zielona żabka", 8.50,true);
        drinks1.addInteger(ingredinent1);
        drinks1.addInteger(ingredinent2);
        drinks1.addInteger(ingredinent3);
        drinks1.printInfo();
        Drinks drinks2=new Drinks("Virgin Whiting Sunset", 5.50,false);
        drinks2.addInteger(ingredinent5);
        drinks2.addInteger(ingredinent6);
        drinks2.addInteger(ingredinent3);
        drinks2.printInfo();
        Drinks drinks3=new Drinks("Polish professor", 15.50,true);
        drinks3.addInteger(ingredinent4);
        drinks3.addInteger(ingredinent7);
        drinks3.addInteger(ingredinent2);
        drinks3.printInfo();

    }
}
