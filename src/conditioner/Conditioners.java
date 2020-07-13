package conditioner;

public class Conditioners extends Room {
    private double minTemp;

    public Conditioners(int roomNumber, double roomTemp, double minTemp) {
        super(roomNumber, roomTemp);
        this.minTemp = minTemp;
    }

    public double BasicAirConditioner() {
        double newTemp = getRoomTemp();
        if (newTemp > minTemp) {
            newTemp--;
            if(newTemp<minTemp) {
                newTemp=minTemp;
                setRoomTemp(newTemp);
            }
            else {
                setRoomTemp(newTemp);
            }
        } else {
            newTemp = getRoomTemp();
        }
        return newTemp;
    }

    public double ProAirConditioner() {
        double newTemp = getRoomTemp();
        if (newTemp > minTemp) {
            newTemp -= 2;
            if(newTemp<minTemp) {
                newTemp=minTemp;
                setRoomTemp(newTemp);
            }
            else {
                setRoomTemp(newTemp);
            }
        } else {
            newTemp = getRoomTemp();
        }
        return newTemp;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if(minTemp>getRoomTemp())
        System.out.println("Temperatura w pomieszczniu jest za niska! Temperatura minimalna :"+minTemp+"\u00B0C." +
                "Klimatyzator przestaje działać");
       else if(minTemp==getRoomTemp())
            System.out.println("Temperatura w pomieszczniu jest temeperaturą minimalną!" +
                    " Klimatyzator przestaje działać");
       else System.out.println("Możesz obniżyć temperature pomieszcznia. Minimanlna temperatura pomieszczenia to: "+
            minTemp+"\u00B0C");
    }
}

