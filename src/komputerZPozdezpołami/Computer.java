package komputerZPozdezpołami;

public class Computer implements processor, memoryRAM, hardDisc {
    private String name;
    private String id;
    int newCalockingAmaountRAM = calockingAmaount;
    int newCalockingTempRAM = calockingTemp;
    int newClockingComProcessor = clockingCom;
    int newClockingTempProcessor = clockingTemp;

    public Computer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void addClockingRAM() {
        if (newCalockingAmaountRAM > calockingAmaount) {
            newCalockingAmaountRAM += 100;
            newCalockingTempRAM += 15;
        } else {
            newCalockingAmaountRAM = calockingAmaount + 100;
            newCalockingTempRAM = calockingTemp + 15;
        }
    }

    @Override
    public void addMAXClockingRAM() {
        if(newCalockingTempRAM>maxSafeTempRAM) {
            newCalockingTempRAM = maxSafeTempRAM;
            int maxCalockingAmaountRAM=(100*(newCalockingTempRAM-calockingTemp))/15+calockingAmaount;
            System.out.println("Przekroczono dopuszczalną temp dla pamięci RAM! " +
                    "Zmiejszam paramtery do dopuszczlanych. MAX temperatura="+maxSafeTempRAM+
                            ", max pojemność="+maxCalockingAmaountRAM+". \nNie można juz powiekszyć pamięci RAM.");
        }else if(newCalockingTempRAM==maxSafeTempRAM){
            System.out.println("Osiągnieto maksymalne parametry dla pamieci RAM. MAX temperatura="+maxSafeTempRAM+
            ", max pojemność="+newCalockingAmaountRAM);
            System.out.println("Mozesz dodać jeszcze pamięć RAM");
        }else {
            System.out.println("Mozesz dodać jeszcze pamięć RAM");
        }

    }

    @Override
    public void addClockingPrcesoor() {
        if (newClockingComProcessor > clockingCom) {
            newClockingComProcessor += 100;
            newClockingTempProcessor += 10;
        } else {
            newClockingTempProcessor = 10 + clockingTemp;
            newClockingComProcessor = clockingCom + 100;
        }
    }

    @Override
    public void addMAXClockingPrcesoor() {
        if(newClockingTempProcessor>maxSafeTempClockingProcessor) {
            newClockingTempProcessor=maxSafeTempClockingProcessor;
            int maxClockingTempProcessor=((100*(newClockingTempProcessor-clockingTemp))/10)+clockingCom;
            System.out.println("Przekroczono dopuszczalną temp dla procesora! " +
                    "Zmiejszam paramtery do dopuszczlanych. MAX temperatura="+maxSafeTempRAM+
                    ", max pojemność="+maxClockingTempProcessor+". \nNie można juz powiekszyć pojemnosci procesora.");
        }else if(newClockingTempProcessor==maxSafeTempClockingProcessor){
            System.out.println("Osiągnieto maksymalne parametry dla pamieci RAM. MAX temperatura="+
                    maxSafeTempClockingProcessor+ ", max pojemność="+
                    newClockingTempProcessor+". \nNie można juz powiekszyć pojemnosci procesora.");
        }else {
            System.out.println("Mozesz dodać jeszcze powiekszyc pojemność procesora");
        }
    }
}
