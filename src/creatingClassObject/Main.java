package creatingClassObject;

public class Main {
    public static void main(String[] args) {
        Bed bed1=new Bed(200.5,102,200.2,"drewniane");
        Bed bed2=new Bed(164.5,69.7,201,"stalowe");
        bed1.printInfo();
        bed2.printInfo();
    }
}
