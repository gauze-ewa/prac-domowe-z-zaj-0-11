package carConditioner;

public class Truck extends Car {
    private double officialPayload;

    public Truck(String name, double flueTankCapacity, double avrageConsuption,
                 boolean conditioner, double officialPayload) {
        super(name, flueTankCapacity, avrageConsuption, conditioner);
        this.officialPayload = officialPayload;
    }

    public double getOfficialPayload() {
        return officialPayload;
    }

    public void setOfficialPayload(double officialPayload) {
        this.officialPayload = officialPayload;
    }

    @Override
    public double addAvrageConsuption(double roadLenght) {
        if (isConditioner() == true)
            return super.addAvrageConsuption(roadLenght) - (0.8 * (roadLenght / 100));
        else
            return super.addAvrageConsuption(roadLenght);
    }

    public double addAvrageConsuptionPayload(double roadLenght) {
        if (officialPayload > 0) {
            setAvrageConsuption(getFlueTankCapacity() - 0.005 * roadLenght );
        }
        return getFlueTankCapacity();
    }

    @Override
    public double carryCar() {
        double result=getAvrageConsuption();
        if (officialPayload > 0 && isConditioner() == true){
            result=getFlueTankCapacity()/(getAvrageConsuption()+0.021);
    }else if(officialPayload<=0&& isConditioner()==true){
            result=getFlueTankCapacity()/(getAvrageConsuption()+0.016);
    }else if(officialPayload>0&& isConditioner()==false){
            result=getFlueTankCapacity()/(getAvrageConsuption()+0.005);
    }
        return result;
    }

    @Override
    public void printInfo(double roadLenght) {
        if (officialPayload > 0 && isConditioner() == true){
            addAvrageConsuption(roadLenght);
            addAvrageConsuptionPayload(roadLenght);
        }else if(officialPayload<=0&& isConditioner()==true){
            addAvrageConsuption(roadLenght);

        }else if(officialPayload>0&& isConditioner()==false){
            addAvrageConsuptionPayload(roadLenght);
        }
        super.printInfo(roadLenght);
    }


}
