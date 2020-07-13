package carConditioner;

public class Car extends Vehicle{
    private boolean conditioner;

    public Car(String name, double flueTankCapacity, double avrageConsuption, boolean conditioner) {
        super(name, flueTankCapacity, avrageConsuption);
        this.conditioner = conditioner;
    }

    public boolean isConditioner() {
        return conditioner;
    }

    public void setConditioner(boolean conditioner) {
        this.conditioner = conditioner;
    }



    public double addAvrageConsuption(double roadLenght){
        double result=getAvrageConsuption();
        if(conditioner==true){
           result+=(0.008*roadLenght);
           setAvrageConsuption(result);
    }
        return result;
    }

    @Override
    public double carryCar() {
        double result= super.carryCar();
        if(conditioner==true){
            result=getFlueTankCapacity()/(getAvrageConsuption()+0.008);
        }
        return result;
    }

    public boolean canDvire(double roadLenght){
        boolean result=false;
        if(carryCar()>=addAvrageConsuption(roadLenght))
            result=true;
        return result;
    }

    @Override
    public void printInfo(double roadLenght) {
        super.printInfo( roadLenght);
        if(conditioner==true)
        {   addAvrageConsuption(roadLenght);
            System.out.println("Srednie spalanie z włączoną wentylacją na drodze o długości "+roadLenght
                            +"km, wynosi: "+getAvrageConsuption()+"km.");
            System.out.println("Samochód może pokkonać taką trase: "+canDvire(roadLenght));
        }
    }


}
