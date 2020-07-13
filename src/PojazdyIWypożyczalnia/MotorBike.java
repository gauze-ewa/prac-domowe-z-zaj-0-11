package PojazdyIWypożyczalnia;

public class MotorBike extends Vehicle{
    private double speedLimit;

    public MotorBike(String name, int year, String direction, double speedLimit) {
        super(name, year, direction);
        this.speedLimit = speedLimit;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return super.toString()+". Motor malimit prędkości=" + speedLimit+"km/h.";
    }
}
