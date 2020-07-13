package komputerZPozdezpołami;

public class CompTest {
    public static void main(String[] args) {
        Computer comp1 = new Computer("Asus", "A101");
        comp1.addMAXClockingPrcesoor();
        comp1.addMAXClockingRAM();
        for(int i=0; i<9;i++){
            comp1.addClockingRAM();
            comp1.addClockingPrcesoor();
        }
        comp1.addMAXClockingPrcesoor();
        comp1.addMAXClockingRAM();

    }
}
