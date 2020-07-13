package carConditioner;

public class Vehicle {
    private String name;
    private double flueTankCapacity;
    private double avrageConsuption;

    public Vehicle(String name, double flueTankCapacity, double avrageConsuption) {
        this.name = name;
        this.flueTankCapacity = flueTankCapacity;
        this.avrageConsuption = avrageConsuption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFlueTankCapacity() {
        return flueTankCapacity;
    }

    public void setFlueTankCapacity(double flueTankCapacity) {
        this.flueTankCapacity = flueTankCapacity;
    }

    public double getAvrageConsuption() {
        return avrageConsuption;
    }

    public void setAvrageConsuption(double avrageConsuption) {
        this.avrageConsuption = avrageConsuption;
    }

    public double carryCar(){
        double avrageRoadLenght=flueTankCapacity/avrageConsuption;
      return avrageRoadLenght;
    }

    public void printInfo(double roadLenght){
        System.out.println("Nazwa: "+name+", pojemność baku: "+flueTankCapacity+
                "l, średnie spalanie na 100km: "+avrageConsuption+"l/km.");
        System.out.println("Może przejechać:"+carryCar()+"km.");
    }
}
