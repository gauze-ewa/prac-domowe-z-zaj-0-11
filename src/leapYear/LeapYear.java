package leapYear;

public class LeapYear {
    private boolean isLeap(int year) {
        boolean result;
        if ((year % 4 == 0) && (year % 100 != 0)) {
            result = true;
        } else if (year % 400 == 0) {
            result = true;
        } else
            result = false;
        return result;
    }

    public void printInfo(int year) {
        System.out.println("Rok " + year + " jest rokiem przestępny: " + isLeap(year) + ".");
    }
}
