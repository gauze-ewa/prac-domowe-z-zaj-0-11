package conditioner;

public class Room {
    private int roomNumber;
    private double roomTemp;

    public Room(int roomNumber, double roomTemp) {
        this.roomNumber = roomNumber;
        this.roomTemp = roomTemp;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getRoomTemp() {
        return roomTemp;
    }

    public void setRoomTemp(double roomTemp) {
        this.roomTemp = roomTemp;
    }

    public void printInfo(){
        System.out.println("W pokoju nr"+roomNumber+" panuje temeperetura: "+roomTemp+"\u00B0C");
    }
}
